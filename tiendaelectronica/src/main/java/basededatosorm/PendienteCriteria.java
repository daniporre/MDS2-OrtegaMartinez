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

public class PendienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPedido;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final IntegerExpression totalProductos;
	public final StringExpression direccion;
	public final DoubleExpression totalPagado;
	public final StringExpression fechaEnvio;
	public final StringExpression fechaRecepcion;
	public final CollectionExpression items;
	
	public PendienteCriteria(Criteria criteria) {
		super(criteria);
		idPedido = new IntegerExpression("idPedido", this);
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this);
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this);
		totalProductos = new IntegerExpression("totalProductos", this);
		direccion = new StringExpression("direccion", this);
		totalPagado = new DoubleExpression("totalPagado", this);
		fechaEnvio = new StringExpression("fechaEnvio", this);
		fechaRecepcion = new StringExpression("fechaRecepcion", this);
		items = new CollectionExpression("ORM_items", this);
	}
	
	public PendienteCriteria(PersistentSession session) {
		this(session.createCriteria(Pendiente.class));
	}
	
	public PendienteCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public basededatosorm.ItemCriteria createItemsCriteria() {
		return new basededatosorm.ItemCriteria(createCriteria("ORM_items"));
	}
	
	public Pendiente uniquePendiente() {
		return (Pendiente) super.uniqueResult();
	}
	
	public Pendiente[] listPendiente() {
		java.util.List list = super.list();
		return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
	}
}

