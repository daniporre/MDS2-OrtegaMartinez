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

public class OfertaCriteria extends AbstractORMCriteria {
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
	public final StringExpression nombreOferta;
	public final StringExpression fechaFinOferta;
	public final DoubleExpression porcentaje;
	public final IntegerExpression idOferta;
	
	public OfertaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		precio = new DoubleExpression("precio", this);
		marca = new StringExpression("marca", this);
		categorias = new CollectionExpression("ORM_categorias", this);
		valoracions = new CollectionExpression("ORM_valoracions", this);
		fotos = new CollectionExpression("ORM_fotos", this);
		itemId = new IntegerExpression("item.id", this);
		item = new AssociationExpression("item", this);
		nombreOferta = new StringExpression("nombreOferta", this);
		fechaFinOferta = new StringExpression("fechaFinOferta", this);
		porcentaje = new DoubleExpression("porcentaje", this);
		idOferta = new IntegerExpression("idOferta", this);
	}
	
	public OfertaCriteria(PersistentSession session) {
		this(session.createCriteria(Oferta.class));
	}
	
	public OfertaCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
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
	
	public ItemCriteria createItemCriteria() {
		return new ItemCriteria(createCriteria("item"));
	}
	
	public Oferta uniqueOferta() {
		return (Oferta) super.uniqueResult();
	}
	
	public Oferta[] listOferta() {
		java.util.List list = super.list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

