package basededatos;

import basededatosorm.Usuario;
import interfaz.Pedido;
import basededatosorm.UsuarioRegistrado;

public interface iEmpresa_de_transportes {

	public Usuario obtenerUsuario(int aIdUsuario);

	public Pedido[] actualizarListadoCompras();

	public void marcarRecibido(int aId);

	public void marcarEntregado(int aId);

	public UsuarioRegistrado visualizarUsuario(int aIdUsuario);
	
	public void cambiarContraseniaAdmin(String aMail, String aNuevaContrasenia);
}