package interfaz;

public class Pedido {
	private Label _fecha;
	private Label _referencia;
	private Label _total;
	private Object _estado;
	private ProgressBar _estadoPB;
	private Button _verPedido;
	private Button _cancelarPedido;
	private Button _comprobarEstadoPedido;
	public Ver_pedidos _ver_pedidos;
	public Cancelar_pedido _cancelar_pedido;
	public Ver_pedido _ver_pedido;
	public Comprobar_estado_del_pedido _comprobar_estado_del_pedido;

	public boolean cancelarPedido() {
		throw new UnsupportedOperationException();
	}

	public void comprobarEstadoPedido() {
		throw new UnsupportedOperationException();
	}

	public void verPedido() {
		throw new UnsupportedOperationException();
	}
}