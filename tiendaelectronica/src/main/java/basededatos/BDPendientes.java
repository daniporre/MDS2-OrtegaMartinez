package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Pendiente;
import basededatosorm.Producto;
import basededatosorm.ProyectoWebPersistentManager;
import basededatosorm.UsuarioRegistrado;
import basededatosorm.Item;
import basededatosorm.Pedido;

public class BDPendientes {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Pendiente> _contiene_pendiente = new Vector<Pendiente>();

	public void crearPedido(UsuarioRegistrado aUsuario, Producto[] aProductos, Double precioTotal)
			throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			for (int i = 0; i < aProductos.length; i++) {
				Pendiente p = basededatosorm.PendienteDAO.createPendiente();

				p.setUsuarioRegistrado(aUsuario);
				p.setDireccion(aUsuario.getDireccionUsuario());
				p.setTotalPagado(precioTotal);
				p.setTotalProductos(aProductos.length);

				Calendar c2 = new GregorianCalendar();
				String dia = Integer.toString(c2.get(Calendar.DATE));
				String mes = Integer.toString(c2.get(Calendar.MONTH));
				String anio = Integer.toString(c2.get(Calendar.YEAR));
				String fecha = dia + "/" + mes + "/" + anio;
				p.setFechaEnvio(fecha);
				p.setFechaRecepcion(fecha);

				Item item = new Item();

				item.setPedido(p);

				item.setProducto(aProductos[i]);

				basededatosorm.PendienteDAO.save(p);
			}

			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en BDPe");
			t.rollback();
		}
		ProyectoWebPersistentManager.instance().disposePersistentManager();
	}

	public basededatosorm.Pendiente[] cargarTodosPendientes() throws PersistentException {

		Pendiente[] pendiente = basededatosorm.PendienteDAO.listPendienteByQuery(null, null);

		return pendiente;
	}
	
	public basededatosorm.Pendiente[] cargarPendientesUsuario(UsuarioRegistrado usuario) throws PersistentException {
		Pendiente[] pendiente = basededatosorm.PendienteDAO.listPendienteByQuery("UsuarioRegistradoUsuarioIdUsuario = '" + usuario.getIdUsuario()+ "'", null);
		System.out.println("caca"+Arrays.toString(pendiente));
		return pendiente;
	}
	
	public void cancelarPedido(Pendiente aPedido) throws PersistentException {
		for (int i = 0; i < aPedido.items.toArray().length; i++) {
			basededatosorm.ItemDAO.deleteAndDissociate(basededatosorm.ItemDAO.loadItemByORMID(aPedido.items.toArray()[i].getID()));
		}
		basededatosorm.PendienteDAO.deleteAndDissociate(basededatosorm.PendienteDAO.loadPendienteByORMID(aPedido.getIdPedido()));
		
	}

}