/**
 * Licensee: daniporre(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoWebData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatosorm.Oferta basededatosORMOferta = basededatosorm.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : porcentaje
			basededatosorm.OfertaDAO.save(basededatosORMOferta);
			basededatosorm.Categoria basededatosORMCategoria = basededatosorm.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productos
			basededatosorm.CategoriaDAO.save(basededatosORMCategoria);
			basededatosorm.Producto basededatosORMProducto = basededatosorm.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : items, fotos, valoracions, categorias, precio
			basededatosorm.ProductoDAO.save(basededatosORMProducto);
			basededatosorm.Pedido basededatosORMPedido = basededatosorm.PedidoDAO.createPedido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : items, totalPagado, totalProductos, usuarioRegistrado
			basededatosorm.PedidoDAO.save(basededatosORMPedido);
			basededatosorm.Pendiente basededatosORMPendiente = basededatosorm.PendienteDAO.createPendiente();
			// Initialize the properties of the persistent object here
			basededatosorm.PendienteDAO.save(basededatosORMPendiente);
			basededatosorm.Enviado basededatosORMEnviado = basededatosorm.EnviadoDAO.createEnviado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : transportista
			basededatosorm.EnviadoDAO.save(basededatosORMEnviado);
			basededatosorm.Entregado basededatosORMEntregado = basededatosorm.EntregadoDAO.createEntregado();
			// Initialize the properties of the persistent object here
			basededatosorm.EntregadoDAO.save(basededatosORMEntregado);
			basededatosorm.Usuario basededatosORMUsuario = basededatosorm.UsuarioDAO.createUsuario();
			// Initialize the properties of the persistent object here
			basededatosorm.UsuarioDAO.save(basededatosORMUsuario);
			basededatosorm.Administrador basededatosORMAdministrador = basededatosorm.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatosorm.AdministradorDAO.save(basededatosORMAdministrador);
			basededatosorm.Encargado basededatosORMEncargado = basededatosorm.EncargadoDAO.createEncargado();
			// Initialize the properties of the persistent object here
			basededatosorm.EncargadoDAO.save(basededatosORMEncargado);
			basededatosorm.Transportista basededatosORMTransportista = basededatosorm.TransportistaDAO.createTransportista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : enviado
			basededatosorm.TransportistaDAO.save(basededatosORMTransportista);
			basededatosorm.Correo basededatosORMCorreo = basededatosorm.CorreoDAO.createCorreo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuarioRegistrado
			basededatosorm.CorreoDAO.save(basededatosORMCorreo);
			basededatosorm.Valoracion basededatosORMValoracion = basededatosorm.ValoracionDAO.createValoracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valor, producto, usuarioRegistrado
			basededatosorm.ValoracionDAO.save(basededatosORMValoracion);
			basededatosorm.UsuarioRegistrado basededatosORMUsuarioRegistrado = basededatosorm.UsuarioRegistradoDAO.createUsuarioRegistrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracions, correos, pedidos, estaOperativo, cvv, numeroTarjeta
			basededatosorm.UsuarioRegistradoDAO.save(basededatosORMUsuarioRegistrado);
			basededatosorm.Fotos basededatosORMFotos = basededatosorm.FotosDAO.createFotos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numeroFoto, producto
			basededatosorm.FotosDAO.save(basededatosORMFotos);
			basededatosorm.Item basededatosORMItem = basededatosorm.ItemDAO.createItem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : producto, pedido
			basededatosorm.ItemDAO.save(basededatosORMItem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoWebData createProyectoWebData = new CreateProyectoWebData();
			try {
				createProyectoWebData.createTestData();
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
