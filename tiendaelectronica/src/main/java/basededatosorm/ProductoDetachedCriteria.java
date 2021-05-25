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
	public final IntegerExpression idProducto;
	public final IntegerExpression ofertaId;
	public final AssociationExpression oferta;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final DoubleExpression precio;
	public final StringExpression marca;
	public final CollectionExpression categorias;
	public final CollectionExpression valoracions;
	public final CollectionExpression fotos;
	public final CollectionExpression items;
	
	public ProductoDetachedCriteria() {
		super(basededatosorm.Producto.class, basededatosorm.ProductoCriteria.class);
		idProducto = new IntegerExpression("idProducto", this.getDetachedCriteria());
		ofertaId = new IntegerExpression("oferta.idOferta", this.getDetachedCriteria());
		oferta = new AssociationExpression("oferta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		categorias = new CollectionExpression("ORM_categorias", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_fotos", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.ProductoCriteria.class);
		idProducto = new IntegerExpression("idProducto", this.getDetachedCriteria());
		ofertaId = new IntegerExpression("oferta.idOferta", this.getDetachedCriteria());
		oferta = new AssociationExpression("oferta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		categorias = new CollectionExpression("ORM_categorias", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_fotos", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria createOfertaCriteria() {
		return new OfertaDetachedCriteria(createCriteria("oferta"));
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
	
	public basededatosorm.ItemDetachedCriteria createItemsCriteria() {
		return new basededatosorm.ItemDetachedCriteria(createCriteria("ORM_items"));
	}
	
	public Producto uniqueProducto(PersistentSession session) {
		return (Producto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto[] listProducto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

