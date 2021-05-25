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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductoCriteria extends AbstractORMCriteria {
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
	
	public ProductoCriteria(Criteria criteria) {
		super(criteria);
		idProducto = new IntegerExpression("idProducto", this);
		ofertaId = new IntegerExpression("oferta.idOferta", this);
		oferta = new AssociationExpression("oferta", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		precio = new DoubleExpression("precio", this);
		marca = new StringExpression("marca", this);
		categorias = new CollectionExpression("ORM_categorias", this);
		valoracions = new CollectionExpression("ORM_valoracions", this);
		fotos = new CollectionExpression("ORM_fotos", this);
		items = new CollectionExpression("ORM_items", this);
	}
	
	public ProductoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto.class));
	}
	
	public ProductoCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public OfertaCriteria createOfertaCriteria() {
		return new OfertaCriteria(createCriteria("oferta"));
	}
	
	public basededatosorm.CategoriaCriteria createCategoriasCriteria() {
		return new basededatosorm.CategoriaCriteria(createCriteria("ORM_categorias"));
	}
	
	public basededatosorm.ValoracionCriteria createValoracionsCriteria() {
		return new basededatosorm.ValoracionCriteria(createCriteria("ORM_valoracions"));
	}
	
	public basededatosorm.FotosCriteria createFotosCriteria() {
		return new basededatosorm.FotosCriteria(createCriteria("ORM_fotos"));
	}
	
	public basededatosorm.ItemCriteria createItemsCriteria() {
		return new basededatosorm.ItemCriteria(createCriteria("ORM_items"));
	}
	
	public Producto uniqueProducto() {
		return (Producto) super.uniqueResult();
	}
	
	public Producto[] listProducto() {
		java.util.List list = super.list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

