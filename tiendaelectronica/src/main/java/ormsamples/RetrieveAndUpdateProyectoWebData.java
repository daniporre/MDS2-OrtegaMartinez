/**
 * Licensee: daniporre(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoWebData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatosorm.Oferta basededatosORMOferta = basededatosorm.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.OfertaDAO.save(basededatosORMOferta);
			basededatosorm.Categoria basededatosORMCategoria = basededatosorm.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.CategoriaDAO.save(basededatosORMCategoria);
			basededatosorm.Producto basededatosORMProducto = basededatosorm.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.ProductoDAO.save(basededatosORMProducto);
			basededatosorm.Pedido basededatosORMPedido = basededatosorm.PedidoDAO.loadPedidoByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.PedidoDAO.save(basededatosORMPedido);
			basededatosorm.Pendiente basededatosORMPendiente = basededatosorm.PendienteDAO.loadPendienteByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.PendienteDAO.save(basededatosORMPendiente);
			basededatosorm.Enviado basededatosORMEnviado = basededatosorm.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.EnviadoDAO.save(basededatosORMEnviado);
			basededatosorm.Entregado basededatosORMEntregado = basededatosorm.EntregadoDAO.loadEntregadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.EntregadoDAO.save(basededatosORMEntregado);
			basededatosorm.Usuario basededatosORMUsuario = basededatosorm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.UsuarioDAO.save(basededatosORMUsuario);
			basededatosorm.Administrador basededatosORMAdministrador = basededatosorm.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.AdministradorDAO.save(basededatosORMAdministrador);
			basededatosorm.Encargado basededatosORMEncargado = basededatosorm.EncargadoDAO.loadEncargadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.EncargadoDAO.save(basededatosORMEncargado);
			basededatosorm.Transportista basededatosORMTransportista = basededatosorm.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.TransportistaDAO.save(basededatosORMTransportista);
			basededatosorm.Correo basededatosORMCorreo = basededatosorm.CorreoDAO.loadCorreoByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.CorreoDAO.save(basededatosORMCorreo);
			basededatosorm.Valoracion basededatosORMValoracion = basededatosorm.ValoracionDAO.loadValoracionByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.ValoracionDAO.save(basededatosORMValoracion);
			basededatosorm.Item basededatosORMItem = basededatosorm.ItemDAO.loadItemByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.ItemDAO.save(basededatosORMItem);
			basededatosorm.UsuarioRegistrado basededatosORMUsuarioRegistrado = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.UsuarioRegistradoDAO.save(basededatosORMUsuarioRegistrado);
			basededatosorm.Fotos basededatosORMFotos = basededatosorm.FotosDAO.loadFotosByQuery(null, null);
			// Update the properties of the persistent object
			basededatosorm.FotosDAO.save(basededatosORMFotos);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Oferta by OfertaCriteria");
		basededatosorm.OfertaCriteria basededatosORMOfertaCriteria = new basededatosorm.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMOfertaCriteria.idOferta.eq();
		System.out.println(basededatosORMOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		basededatosorm.CategoriaCriteria basededatosORMCategoriaCriteria = new basededatosorm.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMCategoriaCriteria.idCategoria.eq();
		System.out.println(basededatosORMCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		basededatosorm.ProductoCriteria basededatosORMProductoCriteria = new basededatosorm.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMProductoCriteria.idProducto.eq();
		System.out.println(basededatosORMProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Pedido by PedidoCriteria");
		basededatosorm.PedidoCriteria basededatosORMPedidoCriteria = new basededatosorm.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMPedidoCriteria.idPedido.eq();
		System.out.println(basededatosORMPedidoCriteria.uniquePedido());
		
		System.out.println("Retrieving Pendiente by PendienteCriteria");
		basededatosorm.PendienteCriteria basededatosORMPendienteCriteria = new basededatosorm.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMPendienteCriteria.idPedido.eq();
		System.out.println(basededatosORMPendienteCriteria.uniquePendiente());
		
		System.out.println("Retrieving Enviado by EnviadoCriteria");
		basededatosorm.EnviadoCriteria basededatosORMEnviadoCriteria = new basededatosorm.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMEnviadoCriteria.idPedido.eq();
		System.out.println(basededatosORMEnviadoCriteria.uniqueEnviado());
		
		System.out.println("Retrieving Entregado by EntregadoCriteria");
		basededatosorm.EntregadoCriteria basededatosORMEntregadoCriteria = new basededatosorm.EntregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMEntregadoCriteria.idPedido.eq();
		System.out.println(basededatosORMEntregadoCriteria.uniqueEntregado());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		basededatosorm.UsuarioCriteria basededatosORMUsuarioCriteria = new basededatosorm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMUsuarioCriteria.idUsuario.eq();
		System.out.println(basededatosORMUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatosorm.AdministradorCriteria basededatosORMAdministradorCriteria = new basededatosorm.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMAdministradorCriteria.idUsuario.eq();
		System.out.println(basededatosORMAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Encargado by EncargadoCriteria");
		basededatosorm.EncargadoCriteria basededatosORMEncargadoCriteria = new basededatosorm.EncargadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMEncargadoCriteria.idUsuario.eq();
		System.out.println(basededatosORMEncargadoCriteria.uniqueEncargado());
		
		System.out.println("Retrieving Transportista by TransportistaCriteria");
		basededatosorm.TransportistaCriteria basededatosORMTransportistaCriteria = new basededatosorm.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMTransportistaCriteria.idUsuario.eq();
		System.out.println(basededatosORMTransportistaCriteria.uniqueTransportista());
		
		System.out.println("Retrieving Correo by CorreoCriteria");
		basededatosorm.CorreoCriteria basededatosORMCorreoCriteria = new basededatosorm.CorreoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMCorreoCriteria.idCorreo.eq();
		System.out.println(basededatosORMCorreoCriteria.uniqueCorreo());
		
		System.out.println("Retrieving Valoracion by ValoracionCriteria");
		basededatosorm.ValoracionCriteria basededatosORMValoracionCriteria = new basededatosorm.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMValoracionCriteria.idValoracion.eq();
		System.out.println(basededatosORMValoracionCriteria.uniqueValoracion());
		
		System.out.println("Retrieving Item by ItemCriteria");
		basededatosorm.ItemCriteria basededatosORMItemCriteria = new basededatosorm.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMItemCriteria.ID.eq();
		System.out.println(basededatosORMItemCriteria.uniqueItem());
		
		System.out.println("Retrieving UsuarioRegistrado by UsuarioRegistradoCriteria");
		basededatosorm.UsuarioRegistradoCriteria basededatosORMUsuarioRegistradoCriteria = new basededatosorm.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMUsuarioRegistradoCriteria.idUsuario.eq();
		System.out.println(basededatosORMUsuarioRegistradoCriteria.uniqueUsuarioRegistrado());
		
		System.out.println("Retrieving Fotos by FotosCriteria");
		basededatosorm.FotosCriteria basededatosORMFotosCriteria = new basededatosorm.FotosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//basededatosORMFotosCriteria.idFoto.eq();
		System.out.println(basededatosORMFotosCriteria.uniqueFotos());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoWebData retrieveAndUpdateProyectoWebData = new RetrieveAndUpdateProyectoWebData();
			try {
				retrieveAndUpdateProyectoWebData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoWebData.retrieveByCriteria();
			}
			finally {
				basededatosorm.ProyectoWebPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
