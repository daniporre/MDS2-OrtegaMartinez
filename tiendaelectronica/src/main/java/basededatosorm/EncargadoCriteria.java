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

public class EncargadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression nombre;
	public final StringExpression nombreUsuario;
	public final StringExpression mail;
	public final StringExpression contraseña;
	public final StringExpression apellidos;
	
	public EncargadoCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		nombre = new StringExpression("nombre", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		mail = new StringExpression("mail", this);
		contraseña = new StringExpression("contraseña", this);
		apellidos = new StringExpression("apellidos", this);
	}
	
	public EncargadoCriteria(PersistentSession session) {
		this(session.createCriteria(Encargado.class));
	}
	
	public EncargadoCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public Encargado uniqueEncargado() {
		return (Encargado) super.uniqueResult();
	}
	
	public Encargado[] listEncargado() {
		java.util.List list = super.list();
		return (Encargado[]) list.toArray(new Encargado[list.size()]);
	}
}

