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
@Table(name="Transportista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario")
public class Transportista extends basededatosorm.Usuario implements Serializable {
	public Transportista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatosorm.ORMConstants.KEY_TRANSPORTISTA_ENVIADO) {
			return ORM_enviado;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="transportista", targetEntity=basededatosorm.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_enviado = new java.util.HashSet();
	
	private void setORM_Enviado(java.util.Set value) {
		this.ORM_enviado = value;
	}
	
	private java.util.Set getORM_Enviado() {
		return ORM_enviado;
	}
	
	@Transient	
	public final basededatosorm.EnviadoSetCollection enviado = new basededatosorm.EnviadoSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_TRANSPORTISTA_ENVIADO, basededatosorm.ORMConstants.KEY_ENVIADO_TRANSPORTISTA, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
