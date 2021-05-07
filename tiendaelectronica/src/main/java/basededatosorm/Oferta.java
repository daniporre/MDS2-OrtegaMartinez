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
@Table(name="Oferta")
public class Oferta implements Serializable {
	public Oferta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatosorm.ORMConstants.KEY_OFERTA_PRODUCTOS) {
			return ORM_productos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdOferta", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOSORM_OFERTA_IDOFERTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOSORM_OFERTA_IDOFERTA_GENERATOR", strategy="native")	
	private int idOferta;
	
	@Column(name="NombreOferta", nullable=true, length=255)	
	private String nombreOferta;
	
	@Column(name="FechaFinOferta", nullable=true, length=255)	
	private String fechaFinOferta;
	
	@Column(name="Porcentaje", nullable=false)	
	private double porcentaje;
	
	@OneToMany(mappedBy="oferta", targetEntity=basededatosorm.Producto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_productos = new java.util.HashSet();
	
	public void setNombreOferta(String value) {
		this.nombreOferta = value;
	}
	
	public String getNombreOferta() {
		return nombreOferta;
	}
	
	public void setFechaFinOferta(String value) {
		this.fechaFinOferta = value;
	}
	
	public String getFechaFinOferta() {
		return fechaFinOferta;
	}
	
	public void setPorcentaje(double value) {
		this.porcentaje = value;
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}
	
	private void setIdOferta(int value) {
		this.idOferta = value;
	}
	
	public int getIdOferta() {
		return idOferta;
	}
	
	public int getORMID() {
		return getIdOferta();
	}
	
	private void setORM_Productos(java.util.Set value) {
		this.ORM_productos = value;
	}
	
	private java.util.Set getORM_Productos() {
		return ORM_productos;
	}
	
	@Transient	
	public final basededatosorm.ProductoSetCollection productos = new basededatosorm.ProductoSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_OFERTA_PRODUCTOS, basededatosorm.ORMConstants.KEY_PRODUCTO_OFERTA, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdOferta());
	}
	
}
