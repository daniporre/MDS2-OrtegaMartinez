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

public class CorreoCriteria extends AbstractORMCriteria {
	public final StringExpression idCorreo;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final StringExpression asunto;
	public final StringExpression mensaje;
	public final StringExpression remitente;
	public final StringExpression destinatario;
	public final StringExpression fechaEnvio;
	
	public CorreoCriteria(Criteria criteria) {
		super(criteria);
		idCorreo = new StringExpression("idCorreo", this);
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.", this);
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this);
		asunto = new StringExpression("asunto", this);
		mensaje = new StringExpression("mensaje", this);
		remitente = new StringExpression("remitente", this);
		destinatario = new StringExpression("destinatario", this);
		fechaEnvio = new StringExpression("fechaEnvio", this);
	}
	
	public CorreoCriteria(PersistentSession session) {
		this(session.createCriteria(Correo.class));
	}
	
	public CorreoCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public Correo uniqueCorreo() {
		return (Correo) super.uniqueResult();
	}
	
	public Correo[] listCorreo() {
		java.util.List list = super.list();
		return (Correo[]) list.toArray(new Correo[list.size()]);
	}
}

