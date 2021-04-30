/**
 * Licensee: daniporre(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoWebData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Producto...");
		basededatosorm.Producto[] basededatosORMProductos = basededatosorm.ProductoDAO.listProductoByQuery(null, null);
		int length = Math.min(basededatosORMProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		basededatosorm.Oferta[] basededatosORMOfertas = basededatosorm.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(basededatosORMOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		basededatosorm.Categoria[] basededatosORMCategorias = basededatosorm.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(basededatosORMCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido...");
		basededatosorm.Pedido[] basededatosORMPedidos = basededatosorm.PedidoDAO.listPedidoByQuery(null, null);
		length = Math.min(basededatosORMPedidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMPedidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pendiente...");
		basededatosorm.Pendiente[] basededatosORMPendientes = basededatosorm.PendienteDAO.listPendienteByQuery(null, null);
		length = Math.min(basededatosORMPendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMPendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Enviado...");
		basededatosorm.Enviado[] basededatosORMEnviados = basededatosorm.EnviadoDAO.listEnviadoByQuery(null, null);
		length = Math.min(basededatosORMEnviados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMEnviados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Entregado...");
		basededatosorm.Entregado[] basededatosORMEntregados = basededatosorm.EntregadoDAO.listEntregadoByQuery(null, null);
		length = Math.min(basededatosORMEntregados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMEntregados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		basededatosorm.Usuario[] basededatosORMUsuarios = basededatosorm.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(basededatosORMUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatosorm.Administrador[] basededatosORMAdministradors = basededatosorm.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosORMAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado...");
		basededatosorm.Encargado[] basededatosORMEncargados = basededatosorm.EncargadoDAO.listEncargadoByQuery(null, null);
		length = Math.min(basededatosORMEncargados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMEncargados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Transportista...");
		basededatosorm.Transportista[] basededatosORMTransportistas = basededatosorm.TransportistaDAO.listTransportistaByQuery(null, null);
		length = Math.min(basededatosORMTransportistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMTransportistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Correo...");
		basededatosorm.Correo[] basededatosORMCorreos = basededatosorm.CorreoDAO.listCorreoByQuery(null, null);
		length = Math.min(basededatosORMCorreos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMCorreos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Valoracion...");
		basededatosorm.Valoracion[] basededatosORMValoracions = basededatosorm.ValoracionDAO.listValoracionByQuery(null, null);
		length = Math.min(basededatosORMValoracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMValoracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Item...");
		basededatosorm.Item[] basededatosORMItems = basededatosorm.ItemDAO.listItemByQuery(null, null);
		length = Math.min(basededatosORMItems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMItems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioRegistrado...");
		basededatosorm.UsuarioRegistrado[] basededatosORMUsuarioRegistrados = basededatosorm.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
		length = Math.min(basededatosORMUsuarioRegistrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMUsuarioRegistrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fotos...");
		basededatosorm.Fotos[] basededatosORMFotoses = basededatosorm.FotosDAO.listFotosByQuery(null, null);
		length = Math.min(basededatosORMFotoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosORMFotoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Producto by Criteria...");
		basededatosorm.ProductoCriteria basededatosORMProductoCriteria = new basededatosorm.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMProductoCriteria.id.eq();
		basededatosORMProductoCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Producto[] basededatosORMProductos = basededatosORMProductoCriteria.listProducto();
		int length =basededatosORMProductos== null ? 0 : Math.min(basededatosORMProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		basededatosorm.OfertaCriteria basededatosORMOfertaCriteria = new basededatosorm.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMOfertaCriteria.id.eq();
		basededatosORMOfertaCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Oferta[] basededatosORMOfertas = basededatosORMOfertaCriteria.listOferta();
		length =basededatosORMOfertas== null ? 0 : Math.min(basededatosORMOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		basededatosorm.CategoriaCriteria basededatosORMCategoriaCriteria = new basededatosorm.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMCategoriaCriteria.ID.eq();
		basededatosORMCategoriaCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Categoria[] basededatosORMCategorias = basededatosORMCategoriaCriteria.listCategoria();
		length =basededatosORMCategorias== null ? 0 : Math.min(basededatosORMCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Pedido by Criteria...");
		basededatosorm.PedidoCriteria basededatosORMPedidoCriteria = new basededatosorm.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMPedidoCriteria.id.eq();
		basededatosORMPedidoCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Pedido[] basededatosORMPedidos = basededatosORMPedidoCriteria.listPedido();
		length =basededatosORMPedidos== null ? 0 : Math.min(basededatosORMPedidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMPedidos[i]);
		}
		System.out.println(length + " Pedido record(s) retrieved."); 
		
		System.out.println("Listing Pendiente by Criteria...");
		basededatosorm.PendienteCriteria basededatosORMPendienteCriteria = new basededatosorm.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMPendienteCriteria.id.eq();
		basededatosORMPendienteCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Pendiente[] basededatosORMPendientes = basededatosORMPendienteCriteria.listPendiente();
		length =basededatosORMPendientes== null ? 0 : Math.min(basededatosORMPendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMPendientes[i]);
		}
		System.out.println(length + " Pendiente record(s) retrieved."); 
		
		System.out.println("Listing Enviado by Criteria...");
		basededatosorm.EnviadoCriteria basededatosORMEnviadoCriteria = new basededatosorm.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMEnviadoCriteria.id.eq();
		basededatosORMEnviadoCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Enviado[] basededatosORMEnviados = basededatosORMEnviadoCriteria.listEnviado();
		length =basededatosORMEnviados== null ? 0 : Math.min(basededatosORMEnviados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMEnviados[i]);
		}
		System.out.println(length + " Enviado record(s) retrieved."); 
		
		System.out.println("Listing Entregado by Criteria...");
		basededatosorm.EntregadoCriteria basededatosORMEntregadoCriteria = new basededatosorm.EntregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMEntregadoCriteria.id.eq();
		basededatosORMEntregadoCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Entregado[] basededatosORMEntregados = basededatosORMEntregadoCriteria.listEntregado();
		length =basededatosORMEntregados== null ? 0 : Math.min(basededatosORMEntregados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMEntregados[i]);
		}
		System.out.println(length + " Entregado record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		basededatosorm.UsuarioCriteria basededatosORMUsuarioCriteria = new basededatosorm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMUsuarioCriteria.idUsuario.eq();
		basededatosORMUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Usuario[] basededatosORMUsuarios = basededatosORMUsuarioCriteria.listUsuario();
		length =basededatosORMUsuarios== null ? 0 : Math.min(basededatosORMUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatosorm.AdministradorCriteria basededatosORMAdministradorCriteria = new basededatosorm.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMAdministradorCriteria.idUsuario.eq();
		basededatosORMAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Administrador[] basededatosORMAdministradors = basededatosORMAdministradorCriteria.listAdministrador();
		length =basededatosORMAdministradors== null ? 0 : Math.min(basededatosORMAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Encargado by Criteria...");
		basededatosorm.EncargadoCriteria basededatosORMEncargadoCriteria = new basededatosorm.EncargadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMEncargadoCriteria.idUsuario.eq();
		basededatosORMEncargadoCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Encargado[] basededatosORMEncargados = basededatosORMEncargadoCriteria.listEncargado();
		length =basededatosORMEncargados== null ? 0 : Math.min(basededatosORMEncargados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMEncargados[i]);
		}
		System.out.println(length + " Encargado record(s) retrieved."); 
		
		System.out.println("Listing Transportista by Criteria...");
		basededatosorm.TransportistaCriteria basededatosORMTransportistaCriteria = new basededatosorm.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMTransportistaCriteria.idUsuario.eq();
		basededatosORMTransportistaCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Transportista[] basededatosORMTransportistas = basededatosORMTransportistaCriteria.listTransportista();
		length =basededatosORMTransportistas== null ? 0 : Math.min(basededatosORMTransportistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMTransportistas[i]);
		}
		System.out.println(length + " Transportista record(s) retrieved."); 
		
		System.out.println("Listing Correo by Criteria...");
		basededatosorm.CorreoCriteria basededatosORMCorreoCriteria = new basededatosorm.CorreoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMCorreoCriteria.id.eq();
		basededatosORMCorreoCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Correo[] basededatosORMCorreos = basededatosORMCorreoCriteria.listCorreo();
		length =basededatosORMCorreos== null ? 0 : Math.min(basededatosORMCorreos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMCorreos[i]);
		}
		System.out.println(length + " Correo record(s) retrieved."); 
		
		System.out.println("Listing Valoracion by Criteria...");
		basededatosorm.ValoracionCriteria basededatosORMValoracionCriteria = new basededatosorm.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMValoracionCriteria.idValoracion.eq();
		basededatosORMValoracionCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Valoracion[] basededatosORMValoracions = basededatosORMValoracionCriteria.listValoracion();
		length =basededatosORMValoracions== null ? 0 : Math.min(basededatosORMValoracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMValoracions[i]);
		}
		System.out.println(length + " Valoracion record(s) retrieved."); 
		
		System.out.println("Listing Item by Criteria...");
		basededatosorm.ItemCriteria basededatosORMItemCriteria = new basededatosorm.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMItemCriteria.ID.eq();
		basededatosORMItemCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Item[] basededatosORMItems = basededatosORMItemCriteria.listItem();
		length =basededatosORMItems== null ? 0 : Math.min(basededatosORMItems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMItems[i]);
		}
		System.out.println(length + " Item record(s) retrieved."); 
		
		System.out.println("Listing UsuarioRegistrado by Criteria...");
		basededatosorm.UsuarioRegistradoCriteria basededatosORMUsuarioRegistradoCriteria = new basededatosorm.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMUsuarioRegistradoCriteria.idUsuario.eq();
		basededatosORMUsuarioRegistradoCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.UsuarioRegistrado[] basededatosORMUsuarioRegistrados = basededatosORMUsuarioRegistradoCriteria.listUsuarioRegistrado();
		length =basededatosORMUsuarioRegistrados== null ? 0 : Math.min(basededatosORMUsuarioRegistrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMUsuarioRegistrados[i]);
		}
		System.out.println(length + " UsuarioRegistrado record(s) retrieved."); 
		
		System.out.println("Listing Fotos by Criteria...");
		basededatosorm.FotosCriteria basededatosORMFotosCriteria = new basededatosorm.FotosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//basededatosORMFotosCriteria.idFoto.eq();
		basededatosORMFotosCriteria.setMaxResults(ROW_COUNT);
		basededatosorm.Fotos[] basededatosORMFotoses = basededatosORMFotosCriteria.listFotos();
		length =basededatosORMFotoses== null ? 0 : Math.min(basededatosORMFotoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosORMFotoses[i]);
		}
		System.out.println(length + " Fotos record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoWebData listProyectoWebData = new ListProyectoWebData();
			try {
				listProyectoWebData.listTestData();
				//listProyectoWebData.listByCriteria();
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
