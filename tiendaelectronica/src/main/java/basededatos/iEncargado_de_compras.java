package basededatos;

import basededatosorm.Usuario;
import interfaz.Pedido;

public interface iEncargado_de_compras {

	public Pedido[] actualizarListadoCompras();
	
	public Usuario[] cargarUsuarios();
	
	public void cambiarContraseniaAdmin(String aMail, String aNuevaContrasenia);
}