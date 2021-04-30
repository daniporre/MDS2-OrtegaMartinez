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

public class FotosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idFoto;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	public final IntegerExpression numeroFoto;
	
	public FotosDetachedCriteria() {
		super(basededatosorm.Fotos.class, basededatosorm.FotosCriteria.class);
		idFoto = new IntegerExpression("idFoto", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		numeroFoto = new IntegerExpression("numeroFoto", this.getDetachedCriteria());
	}
	
	public FotosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.FotosCriteria.class);
		idFoto = new IntegerExpression("idFoto", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		numeroFoto = new IntegerExpression("numeroFoto", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("producto"));
	}
	
	public Fotos uniqueFotos(PersistentSession session) {
		return (Fotos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fotos[] listFotos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fotos[]) list.toArray(new Fotos[list.size()]);
	}
}

