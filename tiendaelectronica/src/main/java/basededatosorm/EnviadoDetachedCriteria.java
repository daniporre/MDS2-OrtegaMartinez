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

public class EnviadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPedido;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final IntegerExpression totalProductos;
	public final StringExpression direccion;
	public final DoubleExpression totalPagado;
	public final StringExpression fechaEnvio;
	public final StringExpression fechaRecepcion;
	public final CollectionExpression cantidadProductos;
	public final IntegerExpression transportistaId;
	public final AssociationExpression transportista;
	
	public EnviadoDetachedCriteria() {
		super(basededatosorm.Enviado.class, basededatosorm.EnviadoCriteria.class);
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		totalProductos = new IntegerExpression("totalProductos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		totalPagado = new DoubleExpression("totalPagado", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		cantidadProductos = new CollectionExpression("ORM_cantidadProductos", this.getDetachedCriteria());
		transportistaId = new IntegerExpression("transportista.", this.getDetachedCriteria());
		transportista = new AssociationExpression("transportista", this.getDetachedCriteria());
	}
	
	public EnviadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.EnviadoCriteria.class);
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		totalProductos = new IntegerExpression("totalProductos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		totalPagado = new DoubleExpression("totalPagado", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
		fechaRecepcion = new StringExpression("fechaRecepcion", this.getDetachedCriteria());
		cantidadProductos = new CollectionExpression("ORM_cantidadProductos", this.getDetachedCriteria());
		transportistaId = new IntegerExpression("transportista.", this.getDetachedCriteria());
		transportista = new AssociationExpression("transportista", this.getDetachedCriteria());
	}
	
	public TransportistaDetachedCriteria createTransportistaCriteria() {
		return new TransportistaDetachedCriteria(createCriteria("transportista"));
	}
	
	public UsuarioRegistradoDetachedCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public basededatosorm.ItemDetachedCriteria createCantidadProductosCriteria() {
		return new basededatosorm.ItemDetachedCriteria(createCriteria("ORM_cantidadProductos"));
	}
	
	public Enviado uniqueEnviado(PersistentSession session) {
		return (Enviado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Enviado[] listEnviado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Enviado[]) list.toArray(new Enviado[list.size()]);
	}
}

