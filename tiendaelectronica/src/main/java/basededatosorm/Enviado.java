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
@Table(name="Enviado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="PedidoIdPedido", referencedColumnName="IdPedido")
public class Enviado extends basededatosorm.Pedido implements Serializable {
	public Enviado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_ENVIADO_TRANSPORTISTA) {
			this.transportista = (basededatosorm.Transportista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=basededatosorm.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado899563"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Transportista transportista;
	
	public void setTransportista(basededatosorm.Transportista value) {
		if (transportista != null) {
			transportista.enviado.remove(this);
		}
		if (value != null) {
			value.enviado.add(this);
		}
	}
	
	public basededatosorm.Transportista getTransportista() {
		return transportista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Transportista(basededatosorm.Transportista value) {
		this.transportista = value;
	}
	
	private basededatosorm.Transportista getORM_Transportista() {
		return transportista;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
