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

public class OfertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idOferta;
	public final StringExpression nombreOferta;
	public final StringExpression fechaFinOferta;
	public final DoubleExpression porcentaje;
	public final CollectionExpression productos;
	
	public OfertaDetachedCriteria() {
		super(basededatosorm.Oferta.class, basededatosorm.OfertaCriteria.class);
		idOferta = new IntegerExpression("idOferta", this.getDetachedCriteria());
		nombreOferta = new StringExpression("nombreOferta", this.getDetachedCriteria());
		fechaFinOferta = new StringExpression("fechaFinOferta", this.getDetachedCriteria());
		porcentaje = new DoubleExpression("porcentaje", this.getDetachedCriteria());
		productos = new CollectionExpression("ORM_productos", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.OfertaCriteria.class);
		idOferta = new IntegerExpression("idOferta", this.getDetachedCriteria());
		nombreOferta = new StringExpression("nombreOferta", this.getDetachedCriteria());
		fechaFinOferta = new StringExpression("fechaFinOferta", this.getDetachedCriteria());
		porcentaje = new DoubleExpression("porcentaje", this.getDetachedCriteria());
		productos = new CollectionExpression("ORM_productos", this.getDetachedCriteria());
	}
	
	public basededatosorm.ProductoDetachedCriteria createProductosCriteria() {
		return new basededatosorm.ProductoDetachedCriteria(createCriteria("ORM_productos"));
	}
	
	public Oferta uniqueOferta(PersistentSession session) {
		return (Oferta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Oferta[] listOferta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

