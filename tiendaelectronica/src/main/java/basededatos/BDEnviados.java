package basededatos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Enviado;
import basededatosorm.Item;
import basededatosorm.Pedido;
import basededatosorm.Pendiente;
import basededatosorm.Producto;
import basededatosorm.ProyectoWebPersistentManager;
import basededatosorm.UsuarioRegistrado;

public class BDEnviados {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Enviado> _contiene_enviado = new Vector<Enviado>();

	public void crearEnviado(UsuarioRegistrado aUsuario, Producto aProducto, basededatosorm.Pendiente pedido)
			throws PersistentException {
		for (int i = 0; i < pedido.items.toArray().length; i++) {
			basededatosorm.ItemDAO.deleteAndDissociate(basededatosorm.ItemDAO.loadItemByORMID(pedido.items.toArray()[i].getID()));
		}
		basededatosorm.PendienteDAO.deleteAndDissociate(basededatosorm.PendienteDAO.loadPendienteByORMID(pedido.getIdPedido()));
		
		
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			
			

			Enviado p = basededatosorm.EnviadoDAO.createEnviado();

			p.setUsuarioRegistrado(aUsuario);
			p.setDireccion(aUsuario.getDireccionUsuario());
			p.setTotalPagado(aProducto.getPrecio());
			p.setTotalProductos(1);
			p.setTransportista(basededatosorm.TransportistaDAO.loadTransportistaByORMID(5));
			

			Calendar c2 = new GregorianCalendar();
			String dia = Integer.toString(c2.get(Calendar.DATE));
			String mes = Integer.toString(c2.get(Calendar.MONTH));
			String anio = Integer.toString(c2.get(Calendar.YEAR));
			String fecha = dia + "/" + mes + "/" + anio;
			p.setFechaEnvio(fecha);
			p.setFechaRecepcion(fecha);

			Item item = new Item();

			item.setPedido(p);

			item.setProducto(aProducto);

			basededatosorm.EnviadoDAO.save(p);

			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en BDPe");
			t.rollback();
		}
		ProyectoWebPersistentManager.instance().disposePersistentManager();
	}
	
	public basededatosorm.Enviado[] cargarTodosEnviados() throws PersistentException{
		Enviado[] enviado = basededatosorm.EnviadoDAO.listEnviadoByQuery(null, null);

		return enviado;
	}
}