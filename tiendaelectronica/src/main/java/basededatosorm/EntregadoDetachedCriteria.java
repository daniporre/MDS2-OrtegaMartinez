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

public class EntregadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPedido;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final IntegerExpression totalProductos;
	public final StringExpression direccion;
	public final DoubleExpression totalPagado;
	public final StringExpression fechaEnvio;
	public final StringExpression fechaRecepcion;
	public final CollectionExpression items;
	public final StringExpression fechaEntrega;
	
	public EntregadoDetachedCriteria() {
		super(basededatosorm.Entregado.class, basededatosorm.EntregadoCriteria.class);
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		totalProductos = new IntegerExpression("totalProductos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		totalPagado = new DoubleExpression("totalPagado", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
		fechaEntrega = new StringExpression("fechaEntrega", this.getDetachedCriteria());
	}
	
	public EntregadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.EntregadoCriteria.class);
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		totalProductos = new IntegerExpression("totalProductos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		totalPagado = new DoubleExpression("totalPagado", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
		fechaEntrega = new StringExpression("fechaEntrega", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public basededatosorm.ItemDetachedCriteria createItemsCriteria() {
		return new basededatosorm.ItemDetachedCriteria(createCriteria("ORM_items"));
	}
	
	public Entregado uniqueEntregado(PersistentSession session) {
		return (Entregado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entregado[] listEntregado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entregado[]) list.toArray(new Entregado[list.size()]);
	}
}

