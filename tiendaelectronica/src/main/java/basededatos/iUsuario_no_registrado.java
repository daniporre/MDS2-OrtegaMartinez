package basededatos;

import basededatosorm.Producto;
import basededatosorm.Usuario;

public interface iUsuario_no_registrado extends iComún_Usuarios {

	public Usuario iniciarSesion(String aCorreo, String aContrasenia);

	public Producto[] verCatalogo();

	public Producto[] buscarProducto(String aNombre);

	public Producto visualizarProducto(int aIdProducto);
}