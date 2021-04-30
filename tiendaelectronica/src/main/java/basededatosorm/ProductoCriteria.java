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
	public final IntegerExpression id;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final DoubleExpression precio;
	public final StringExpression marca;
	public final CollectionExpression valoracions;
	public final CollectionExpression fotos;
	public final IntegerExpression itemId;
	public final AssociationExpression item;
	
	public ProductoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		categoriaId = new IntegerExpression("categoria.ID", this);
		categoria = new AssociationExpression("categoria", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		precio = new DoubleExpression("precio", this);
		marca = new StringExpression("marca", this);
		valoracions = new CollectionExpression("ORM_valoracions", this);
		fotos = new CollectionExpression("ORM_fotos", this);
		itemId = new IntegerExpression("item.id", this);
		item = new AssociationExpression("item", this);
	}
	
	public ProductoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto.class));
	}
	
	public ProductoCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public CategoriaCriteria createCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("categoria"));
	}
	
	public basededatosorm.ValoracionCriteria createValoracionsCriteria() {
		return new basededatosorm.ValoracionCriteria(createCriteria("ORM_valoracions"));
	}
	
	public basededatosorm.FotosCriteria createFotosCriteria() {
		return new basededatosorm.FotosCriteria(createCriteria("ORM_fotos"));
	}
	
	public ItemCriteria createItemCriteria() {
		return new ItemCriteria(createCriteria("item"));
	}
	
	public Producto uniqueProducto() {
		return (Producto) super.uniqueResult();
	}
	
	public Producto[] listProducto() {
		java.util.List list = super.list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

