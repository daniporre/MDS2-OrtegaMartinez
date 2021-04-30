package basededatos;

public interface iUsuario_no_identificado extends iUsuario_no_registrado {

	public void crearCuenta(String aCorreo, String aContrasenia);
}