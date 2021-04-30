package basededatos;

import java.util.Vector;
import basededatosorm.Pendiente;
import basededatosorm.Pedido;

public class BDPendientes {
	public BDPrincipal _unnamed_BDPrincipal_;
	public Vector<Pendiente> _contiene_pendiente = new Vector<Pendiente>();

	public Pedido[] cargarCompras() {
		throw new UnsupportedOperationException();
	}

	public Pedido[] actualizarListadoCompras() {
		throw new UnsupportedOperationException();
	}

	public void marcarRecibido(int aId) {
		throw new UnsupportedOperationException();
	}

	public void cancelarPedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}
}