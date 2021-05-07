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

public class PendienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPedido;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final IntegerExpression totalProductos;
	public final StringExpression direccion;
	public final DoubleExpression totalPagado;
	public final StringExpression fechaEnvio;
	public final StringExpression fechaRecepcion;
	public final CollectionExpression cantidadProductos;
	
	public PendienteDetachedCriteria() {
		super(basededatosorm.Pendiente.class, basededatosorm.PendienteCriteria.class);
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		totalProductos = new IntegerExpression("totalProductos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		totalPagado = new DoubleExpression("totalPagado", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		cantidadProductos = new CollectionExpression("ORM_cantidadProductos", this.getDetachedCriteria());
	}
	
	public PendienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.PendienteCriteria.class);
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		totalProductos = new IntegerExpression("totalProductos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		totalPagado = new DoubleExpression("totalPagado", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		cantidadProductos = new CollectionExpression("ORM_cantidadProductos", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public basededatosorm.ItemDetachedCriteria createCantidadProductosCriteria() {
		return new basededatosorm.ItemDetachedCriteria(createCriteria("ORM_cantidadProductos"));
	}
	
	public Pendiente uniquePendiente(PersistentSession session) {
		return (Pendiente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pendiente[] listPendiente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
	}
}

