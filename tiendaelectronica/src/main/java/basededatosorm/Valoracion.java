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
@Table(name="Valoracion")
public class Valoracion implements Serializable {
	public Valoracion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_VALORACION_PRODUCTO) {
			this.producto = (basededatosorm.Producto) owner;
		}
		
		else if (key == basededatosorm.ORMConstants.KEY_VALORACION_USUARIOREGISTRADO) {
			this.usuarioRegistrado = (basededatosorm.UsuarioRegistrado) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdValoracion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOSORM_VALORACION_IDVALORACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOSORM_VALORACION_IDVALORACION_GENERATOR", strategy="native")	
	private int idValoracion;
	
	@ManyToOne(targetEntity=basededatosorm.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKValoracion305986"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.UsuarioRegistrado usuarioRegistrado;
	
	@ManyToOne(targetEntity=basededatosorm.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKValoracion666204"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Producto producto;
	
	private void setIdValoracion(int value) {
		this.idValoracion = value;
	}
	
	public int getIdValoracion() {
		return idValoracion;
	}
	
	public int getORMID() {
		return getIdValoracion();
	}
	
	public void setProducto(basededatosorm.Producto value) {
		if (producto != null) {
			producto.valoracions.remove(this);
		}
		if (value != null) {
			value.valoracions.add(this);
		}
	}
	
	public basededatosorm.Producto getProducto() {
		return producto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Producto(basededatosorm.Producto value) {
		this.producto = value;
	}
	
	private basededatosorm.Producto getORM_Producto() {
		return producto;
	}
	
	public void setUsuarioRegistrado(basededatosorm.UsuarioRegistrado value) {
		if (usuarioRegistrado != null) {
			usuarioRegistrado.valoracions.remove(this);
		}
		if (value != null) {
			value.valoracions.add(this);
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
		return String.valueOf(getIdValoracion());
	}
	
}
