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
@Table(name="Fotos")
public class Fotos implements Serializable {
	public Fotos() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_FOTOS_PRODUCTO) {
			this.producto = (basededatosorm.Producto) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdFoto", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOSORM_FOTOS_IDFOTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOSORM_FOTOS_IDFOTO_GENERATOR", strategy="native")	
	private int idFoto;
	
	@ManyToOne(targetEntity=basededatosorm.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKFotos527238"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Producto producto;
	
	@Column(name="NumeroFoto", nullable=false, length=10)	
	private int numeroFoto;
	
	private void setIdFoto(int value) {
		this.idFoto = value;
	}
	
	public int getIdFoto() {
		return idFoto;
	}
	
	public int getORMID() {
		return getIdFoto();
	}
	
	public void setNumeroFoto(int value) {
		this.numeroFoto = value;
	}
	
	public int getNumeroFoto() {
		return numeroFoto;
	}
	
	public void setProducto(basededatosorm.Producto value) {
		if (producto != null) {
			producto.fotos.remove(this);
		}
		if (value != null) {
			value.fotos.add(this);
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
	
	public String toString() {
		return String.valueOf(getIdFoto());
	}
	
}
