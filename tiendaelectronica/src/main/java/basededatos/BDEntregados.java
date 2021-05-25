package basededatos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatosorm.Entregado;
import basededatosorm.Enviado;
import basededatosorm.Item;
import basededatosorm.Pedido;
import basededatosorm.Pendiente;
import basededatosorm.Producto;
import basededatosorm.ProyectoWebPersistentManager;
import basededatosorm.UsuarioRegistrado;

public class BDEntregados {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Entregado> _contiene_entregado = new Vector<Entregado>();

	public void crearEntregado(UsuarioRegistrado aUsuario, Producto aProducto, basededatosorm.Enviado pedido)
			throws PersistentException {
		for (int i = 0; i < pedido.items.toArray().length; i++) {
			basededatosorm.ItemDAO.deleteAndDissociate(basededatosorm.ItemDAO.loadItemByORMID(pedido.items.toArray()[i].getID()));
		}
		basededatosorm.EnviadoDAO.deleteAndDissociate(basededatosorm.EnviadoDAO.loadEnviadoByORMID(pedido.getIdPedido()));
		
		
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			
			

			Entregado p = basededatosorm.EntregadoDAO.createEntregado();

			p.setUsuarioRegistrado(aUsuario);
			p.setDireccion(aUsuario.getDireccionUsuario());
			p.setTotalPagado(aProducto.getPrecio());
			p.setTotalProductos(1);
			
			Calendar c22 = new GregorianCalendar();
			String dia2 = Integer.toString(c22.get(Calendar.DATE));
			String mes2 = Integer.toString(c22.get(Calendar.MONTH));
			String anio2 = Integer.toString(c22.get(Calendar.YEAR));
			String fecha2 = dia2 + "/" + mes2 + "/" + anio2;
			
			p.setFechaRecepcion(fecha2);
			

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

			basededatosorm.EntregadoDAO.save(p);

			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en BDEntregados");
			t.rollback();
		}
		ProyectoWebPersistentManager.instance().disposePersistentManager();
	}
	public basededatosorm.Entregado[] cargarTodosEntregados() throws PersistentException {

		Entregado[] entregado = basededatosorm.EntregadoDAO.listEntregadoByQuery(null, null);

		return entregado;
	}
	
	public basededatosorm.Entregado[] cargarEntregadosUsuario(UsuarioRegistrado usuario) throws PersistentException {
		Entregado[] entregado = basededatosorm.EntregadoDAO.listEntregadoByQuery("UsuarioRegistradoUsuarioIdUsuario = '" + usuario.getIdUsuario()+ "'", null);
		return entregado;
	}
}