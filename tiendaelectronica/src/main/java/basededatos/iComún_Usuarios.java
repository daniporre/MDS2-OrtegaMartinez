package basededatos;

import basededatosorm.Categoria;
import basededatosorm.Producto;

public interface iComún_Usuarios {

	Producto[] obtenerProductosConCategoria(Categoria categoria);
}