/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: daniporre(University of Almeria)
 * License Type: Academic
 */
package basededatosorm;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final DoubleExpression precio;
	public final StringExpression marca;
	public final CollectionExpression categorias;
	public final CollectionExpression valoracions;
	public final CollectionExpression fotos;
	public final IntegerExpression itemId;
	public final AssociationExpression item;
	
	public ProductoDetachedCriteria() {
		super(basededatosorm.Producto.class, basededatosorm.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		categorias = new CollectionExpression("ORM_categorias", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_fotos", this.getDetachedCriteria());
		itemId = new IntegerExpression("item.id", this.getDetachedCriteria());
		item = new AssociationExpression("item", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		categorias = new CollectionExpression("ORM_categorias", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_fotos", this.getDetachedCriteria());
		itemId = new IntegerExpression("item.id", this.getDetachedCriteria());
		item = new AssociationExpression("item", this.getDetachedCriteria());
	}
	
	public basededatosorm.CategoriaDetachedCriteria createCategoriasCriteria() {
		return new basededatosorm.CategoriaDetachedCriteria(createCriteria("ORM_categorias"));
	}
	
	public basededatosorm.ValoracionDetachedCriteria createValoracionsCriteria() {
		return new basededatosorm.ValoracionDetachedCriteria(createCriteria("ORM_valoracions"));
	}
	
	public basededatosorm.FotosDetachedCriteria createFotosCriteria() {
		return new basededatosorm.FotosDetachedCriteria(createCriteria("ORM_fotos"));
	}
	
	public ItemDetachedCriteria createItemCriteria() {
		return new ItemDetachedCriteria(createCriteria("item"));
	}
	
	public Producto uniqueProducto(PersistentSession session) {
		return (Producto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto[] listProducto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

