package interfaz;

import java.util.Vector;
import interfaz.Ver_producto;

public class Productos {
	private Label _ordenarPor;
	private ComboBox _tipoOrden;
	private Label _filtrarPor;
	private ComboBox _tipoFiltro;
	public Ver_catálogo _ver_catálogo;
	public Vector<Ver_producto> _list_Ver_producto = new Vector<Ver_producto>();
}