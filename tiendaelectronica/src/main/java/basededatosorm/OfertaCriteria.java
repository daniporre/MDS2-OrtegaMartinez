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
	public final IntegerExpression idOferta;
	public final StringExpression nombreOferta;
	public final StringExpression fechaFinOferta;
	public final DoubleExpression porcentaje;
	public final CollectionExpression productos;
	
	public OfertaCriteria(Criteria criteria) {
		super(criteria);
		idOferta = new IntegerExpression("idOferta", this);
		nombreOferta = new StringExpression("nombreOferta", this);
		fechaFinOferta = new StringExpression("fechaFinOferta", this);
		porcentaje = new DoubleExpression("porcentaje", this);
		productos = new CollectionExpression("ORM_productos", this);
	}
	
	public OfertaCriteria(PersistentSession session) {
		this(session.createCriteria(Oferta.class));
	}
	
	public OfertaCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public basededatosorm.ProductoCriteria createProductosCriteria() {
		return new basededatosorm.ProductoCriteria(createCriteria("ORM_productos"));
	}
	
	public Oferta uniqueOferta() {
		return (Oferta) super.uniqueResult();
	}
	
	public Oferta[] listOferta() {
		java.util.List list = super.list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

