package basededatos;

import java.util.Vector;
import basededatosorm.Correo;

public class BDCorreo {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Correo> _contiene_correo = new Vector<Correo>();

	public Correo[] obtenerMensajesRecibidos() {
		throw new UnsupportedOperationException();
	}

	public Correo[] obtenerMensajesEnviados() {
		throw new UnsupportedOperationException();
	}

	public void responderMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio) {
		throw new UnsupportedOperationException();
	}

	public void crearMensaje(String aAsunto, String aMensaje, String aRemitente, String aDestinatario, String aFechaEnvio) {
		throw new UnsupportedOperationException();
	}

	public Correo obtenerMensaje(String aId) {
		throw new UnsupportedOperationException();
	}
}