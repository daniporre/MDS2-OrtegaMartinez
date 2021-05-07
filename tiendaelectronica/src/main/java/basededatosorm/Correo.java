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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Correo")
public class Correo implements Serializable {
	public Correo() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Correo))
			return false;
		Correo correo = (Correo)aObj;
		if ((getIdCorreo() != null && !getIdCorreo().equals(correo.getIdCorreo())) || (getIdCorreo() == null && correo.getIdCorreo() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdCorreo() == null ? 0 : getIdCorreo().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_CORREO_USUARIOREGISTRADO) {
			this.usuarioRegistrado = (basededatosorm.UsuarioRegistrado) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdCorreo", nullable=false, length=255)	
	@Id	
	private String idCorreo;
	
	@ManyToOne(targetEntity=basededatosorm.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKCorreo392858"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.UsuarioRegistrado usuarioRegistrado;
	
	@Column(name="Asunto", nullable=true, length=255)	
	private String asunto;
	
	@Column(name="Mensaje", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="Remitente", nullable=true, length=255)	
	private String remitente;
	
	@Column(name="Destinatario", nullable=true, length=255)	
	private String destinatario;
	
	@Column(name="FechaEnvio", nullable=true, length=255)	
	private String fechaEnvio;
	
	public void setIdCorreo(String value) {
		this.idCorreo = value;
	}
	
	public String getIdCorreo() {
		return idCorreo;
	}
	
	public String getORMID() {
		return getIdCorreo();
	}
	
	public void setAsunto(String value) {
		this.asunto = value;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setRemitente(String value) {
		this.remitente = value;
	}
	
	public String getRemitente() {
		return remitente;
	}
	
	public void setDestinatario(String value) {
		this.destinatario = value;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setFechaEnvio(String value) {
		this.fechaEnvio = value;
	}
	
	public String getFechaEnvio() {
		return fechaEnvio;
	}
	
	public void setUsuarioRegistrado(basededatosorm.UsuarioRegistrado value) {
		if (usuarioRegistrado != null) {
			usuarioRegistrado.correos.remove(this);
		}
		if (value != null) {
			value.correos.add(this);
		}
	}
	
	public basededatosorm.UsuarioRegistrado getUsuarioRegistrado() {
		return usuarioRegistrado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_UsuarioRegistrado(basededatosorm.UsuarioRegistrado value) {
		this.usuarioRegistrado = value;
	}
	
	private basededatosorm.UsuarioRegistrado getORM_UsuarioRegistrado() {
		return usuarioRegistrado;
	}
	
	public String toString() {
		return String.valueOf(getIdCorreo());
	}
	
}
