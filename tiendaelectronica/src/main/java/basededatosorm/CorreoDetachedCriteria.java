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

public class CorreoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idCorreo;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final StringExpression asunto;
	public final StringExpression mensaje;
	public final StringExpression remitente;
	public final StringExpression destinatario;
	public final StringExpression fechaEnvio;
	
	public CorreoDetachedCriteria() {
		super(basededatosorm.Correo.class, basededatosorm.CorreoCriteria.class);
		idCorreo = new StringExpression("idCorreo", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		remitente = new StringExpression("remitente", this.getDetachedCriteria());
		destinatario = new StringExpression("destinatario", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
	}
	
	public CorreoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.CorreoCriteria.class);
		idCorreo = new StringExpression("idCorreo", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		remitente = new StringExpression("remitente", this.getDetachedCriteria());
		destinatario = new StringExpression("destinatario", this.getDetachedCriteria());
		fechaEnvio = new StringExpression("fechaEnvio", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public Correo uniqueCorreo(PersistentSession session) {
		return (Correo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Correo[] listCorreo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Correo[]) list.toArray(new Correo[list.size()]);
	}
}

