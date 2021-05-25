package interfaz;

import basededatosorm.Producto;
import basededatosorm.Usuario;
import basededatosorm.Valoracion;
import vistas.VistaValoraciondelproducto;

public class Valoracion_del_producto extends VistaValoraciondelproducto {

	public Valoracion_del_producto(Usuario usuario, Valoracion valoracion) {
		this.getNombreUsuarioValoracionLabel1().setText(usuario.getNombreUsuario());
		this.getValoracionProductoLabel().setText("Valoración: "+Integer.toString(valoracion.getValor())+"/5");
		this.getComentarioValoracionTArea().setValue(valoracion.getComentario());
	}
	
}