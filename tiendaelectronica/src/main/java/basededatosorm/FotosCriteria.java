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

public class FotosCriteria extends AbstractORMCriteria {
	public final IntegerExpression idFoto;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	public final IntegerExpression numeroFoto;
	
	public FotosCriteria(Criteria criteria) {
		super(criteria);
		idFoto = new IntegerExpression("idFoto", this);
		productoId = new IntegerExpression("producto.idProducto", this);
		producto = new AssociationExpression("producto", this);
		numeroFoto = new IntegerExpression("numeroFoto", this);
	}
	
	public FotosCriteria(PersistentSession session) {
		this(session.createCriteria(Fotos.class));
	}
	
	public FotosCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createProductoCriteria() {
		return new ProductoCriteria(createCriteria("producto"));
	}
	
	public Fotos uniqueFotos() {
		return (Fotos) super.uniqueResult();
	}
	
	public Fotos[] listFotos() {
		java.util.List list = super.list();
		return (Fotos[]) list.toArray(new Fotos[list.size()]);
	}
}

