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

public class UsuarioRegistradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression nombre;
	public final StringExpression nombreUsuario;
	public final StringExpression mail;
	public final StringExpression contraseña;
	public final StringExpression apellidos;
	public final StringExpression numeroTarjeta;
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
	
	public UsuarioRegistradoDetachedCriteria() {
		super(basededatosorm.UsuarioRegistrado.class, basededatosorm.UsuarioRegistradoCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		numeroTarjeta = new StringExpression("numeroTarjeta", this.getDetachedCriteria());
		titularTarjeta = new StringExpression("titularTarjeta", this.getDetachedCriteria());
		fechaVencimientoTarjeta = new StringExpression("fechaVencimientoTarjeta", this.getDetachedCriteria());
		cvv = new IntegerExpression("cvv", this.getDetachedCriteria());
		direccionUsuario = new StringExpression("direccionUsuario", this.getDetachedCriteria());
		estaOperativo = new BooleanExpression("estaOperativo", this.getDetachedCriteria());
		codigoPostal = new StringExpression("codigoPostal", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		provincia = new StringExpression("provincia", this.getDetachedCriteria());
		pedidos = new CollectionExpression("ORM_pedidos", this.getDetachedCriteria());
		correos = new CollectionExpression("ORM_correos", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.UsuarioRegistradoCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		numeroTarjeta = new StringExpression("numeroTarjeta", this.getDetachedCriteria());
		titularTarjeta = new StringExpression("titularTarjeta", this.getDetachedCriteria());
		fechaVencimientoTarjeta = new StringExpression("fechaVencimientoTarjeta", this.getDetachedCriteria());
		cvv = new IntegerExpression("cvv", this.getDetachedCriteria());
		direccionUsuario = new StringExpression("direccionUsuario", this.getDetachedCriteria());
		estaOperativo = new BooleanExpression("estaOperativo", this.getDetachedCriteria());
		codigoPostal = new StringExpression("codigoPostal", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		provincia = new StringExpression("provincia", this.getDetachedCriteria());
		pedidos = new CollectionExpression("ORM_pedidos", this.getDetachedCriteria());
		correos = new CollectionExpression("ORM_correos", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
	}
	
	public basededatosorm.PedidoDetachedCriteria createPedidosCriteria() {
		return new basededatosorm.PedidoDetachedCriteria(createCriteria("ORM_pedidos"));
	}
	
	public basededatosorm.CorreoDetachedCriteria createCorreosCriteria() {
		return new basededatosorm.CorreoDetachedCriteria(createCriteria("ORM_correos"));
	}
	
	public basededatosorm.ValoracionDetachedCriteria createValoracionsCriteria() {
		return new basededatosorm.ValoracionDetachedCriteria(createCriteria("ORM_valoracions"));
	}
	
	public UsuarioRegistrado uniqueUsuarioRegistrado(PersistentSession session) {
		return (UsuarioRegistrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioRegistrado[] listUsuarioRegistrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
	}
}

