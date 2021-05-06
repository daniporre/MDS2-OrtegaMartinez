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

public class UsuarioRegistradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression nombre;
	public final StringExpression nombreUsuario;
	public final StringExpression mail;
	public final StringExpression contraseña;
	public final StringExpression apellidos;
	public final IntegerExpression numeroTarjeta;
	public final StringExpression titularTarjeta;
	public final StringExpression fechaVencimientoTarjeta;
	public final IntegerExpression cvv;
	public final StringExpression direccionUsuario;
	public final BooleanExpression estaOperativo;
	public final StringExpression codigoPostal;
	public final StringExpression ciudad;
	public final StringExpression provincia;
	public final CollectionExpression pedidos;
	public final CollectionExpression correos;
	public final CollectionExpression valoracions;
	
	public UsuarioRegistradoCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		nombre = new StringExpression("nombre", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		mail = new StringExpression("mail", this);
		contraseña = new StringExpression("contraseña", this);
		apellidos = new StringExpression("apellidos", this);
		numeroTarjeta = new IntegerExpression("numeroTarjeta", this);
		titularTarjeta = new StringExpression("titularTarjeta", this);
		fechaVencimientoTarjeta = new StringExpression("fechaVencimientoTarjeta", this);
		cvv = new IntegerExpression("cvv", this);
		direccionUsuario = new StringExpression("direccionUsuario", this);
		estaOperativo = new BooleanExpression("estaOperativo", this);
		codigoPostal = new StringExpression("codigoPostal", this);
		ciudad = new StringExpression("ciudad", this);
		provincia = new StringExpression("provincia", this);
		pedidos = new CollectionExpression("ORM_pedidos", this);
		correos = new CollectionExpression("ORM_correos", this);
		valoracions = new CollectionExpression("ORM_valoracions", this);
	}
	
	public UsuarioRegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioRegistrado.class));
	}
	
	public UsuarioRegistradoCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public basededatosorm.PedidoCriteria createPedidosCriteria() {
		return new basededatosorm.PedidoCriteria(createCriteria("ORM_pedidos"));
	}
	
	public basededatosorm.CorreoCriteria createCorreosCriteria() {
		return new basededatosorm.CorreoCriteria(createCriteria("ORM_correos"));
	}
	
	public basededatosorm.ValoracionCriteria createValoracionsCriteria() {
		return new basededatosorm.ValoracionCriteria(createCriteria("ORM_valoracions"));
	}
	
	public UsuarioRegistrado uniqueUsuarioRegistrado() {
		return (UsuarioRegistrado) super.uniqueResult();
	}
	
	public UsuarioRegistrado[] listUsuarioRegistrado() {
		java.util.List list = super.list();
		return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
	}
}

