/**
 * Licensee: daniporre(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoWebData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatosorm.ProyectoWebPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatosorm.Oferta basededatosORMOferta = basededatosorm.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			basededatosorm.OfertaDAO.delete(basededatosORMOferta);
			basededatosorm.Categoria basededatosORMCategoria = basededatosorm.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			basededatosorm.CategoriaDAO.delete(basededatosORMCategoria);
			basededatosorm.Producto basededatosORMProducto = basededatosorm.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			basededatosorm.ProductoDAO.delete(basededatosORMProducto);
			basededatosorm.Pedido basededatosORMPedido = basededatosorm.PedidoDAO.loadPedidoByQuery(null, null);
			// Delete the persistent object
			basededatosorm.PedidoDAO.delete(basededatosORMPedido);
			basededatosorm.Pendiente basededatosORMPendiente = basededatosorm.PendienteDAO.loadPendienteByQuery(null, null);
			// Delete the persistent object
			basededatosorm.PendienteDAO.delete(basededatosORMPendiente);
			basededatosorm.Enviado basededatosORMEnviado = basededatosorm.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Delete the persistent object
			basededatosorm.EnviadoDAO.delete(basededatosORMEnviado);
			basededatosorm.Entregado basededatosORMEntregado = basededatosorm.EntregadoDAO.loadEntregadoByQuery(null, null);
			// Delete the persistent object
			basededatosorm.EntregadoDAO.delete(basededatosORMEntregado);
			basededatosorm.Usuario basededatosORMUsuario = basededatosorm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatosorm.UsuarioDAO.delete(basededatosORMUsuario);
			basededatosorm.Administrador basededatosORMAdministrador = basededatosorm.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatosorm.AdministradorDAO.delete(basededatosORMAdministrador);
			basededatosorm.Encargado basededatosORMEncargado = basededatosorm.EncargadoDAO.loadEncargadoByQuery(null, null);
			// Delete the persistent object
			basededatosorm.EncargadoDAO.delete(basededatosORMEncargado);
			basededatosorm.Transportista basededatosORMTransportista = basededatosorm.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Delete the persistent object
			basededatosorm.TransportistaDAO.delete(basededatosORMTransportista);
			basededatosorm.Correo basededatosORMCorreo = basededatosorm.CorreoDAO.loadCorreoByQuery(null, null);
			// Delete the persistent object
			basededatosorm.CorreoDAO.delete(basededatosORMCorreo);
			basededatosorm.Valoracion basededatosORMValoracion = basededatosorm.ValoracionDAO.loadValoracionByQuery(null, null);
			// Delete the persistent object
			basededatosorm.ValoracionDAO.delete(basededatosORMValoracion);
			basededatosorm.Item basededatosORMItem = basededatosorm.ItemDAO.loadItemByQuery(null, null);
			// Delete the persistent object
			basededatosorm.ItemDAO.delete(basededatosORMItem);
			basededatosorm.UsuarioRegistrado basededatosORMUsuarioRegistrado = basededatosorm.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Delete the persistent object
			basededatosorm.UsuarioRegistradoDAO.delete(basededatosORMUsuarioRegistrado);
			basededatosorm.Fotos basededatosORMFotos = basededatosorm.FotosDAO.loadFotosByQuery(null, null);
			// Delete the persistent object
			basededatosorm.FotosDAO.delete(basededatosORMFotos);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoWebData deleteProyectoWebData = new DeleteProyectoWebData();
			try {
				deleteProyectoWebData.deleteTestData();
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
