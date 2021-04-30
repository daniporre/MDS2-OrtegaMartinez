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
@Table(name="Producto")
@Inheritance(strategy=InheritanceType.JOINED)
public class Producto implements Serializable {
	public Producto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_VALORACIONS) {
			return ORM_valoracions;
		}
		else if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_FOTOS) {
			return ORM_fotos;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_CATEGORIA) {
			this.categoria = (basededatosorm.Categoria) owner;
		}
		
		else if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_ITEM) {
			this.item = (basededatosorm.Item) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOSORM_PRODUCTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOSORM_PRODUCTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatosorm.Categoria.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CategoriaID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto904736"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Categoria categoria;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Marca", nullable=true, length=255)	
	private String marca;
	
	@OneToMany(mappedBy="producto", targetEntity=basededatosorm.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valoracions = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=basededatosorm.Fotos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_fotos = new java.util.HashSet();
	
	@OneToOne(mappedBy="producto", targetEntity=basededatosorm.Item.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Item item;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setPrecio(double value) {
		this.precio = value;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setMarca(String value) {
		this.marca = value;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setCategoria(basededatosorm.Categoria value) {
		if (categoria != null) {
			categoria.productos.remove(this);
		}
		if (value != null) {
			value.productos.add(this);
		}
	}
	
	public basededatosorm.Categoria getCategoria() {
		return categoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Categoria(basededatosorm.Categoria value) {
		this.categoria = value;
	}
	
	private basededatosorm.Categoria getORM_Categoria() {
		return categoria;
	}
	
	private void setORM_Valoracions(java.util.Set value) {
		this.ORM_valoracions = value;
	}
	
	private java.util.Set getORM_Valoracions() {
		return ORM_valoracions;
	}
	
	@Transient	
	public final basededatosorm.ValoracionSetCollection valoracions = new basededatosorm.ValoracionSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_PRODUCTO_VALORACIONS, basededatosorm.ORMConstants.KEY_VALORACION_PRODUCTO, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Fotos(java.util.Set value) {
		this.ORM_fotos = value;
	}
	
	private java.util.Set getORM_Fotos() {
		return ORM_fotos;
	}
	
	@Transient	
	public final basededatosorm.FotosSetCollection fotos = new basededatosorm.FotosSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_PRODUCTO_FOTOS, basededatosorm.ORMConstants.KEY_FOTOS_PRODUCTO, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setItem(basededatosorm.Item value) {
		if (this.item != value) {
			basededatosorm.Item litem = this.item;
			this.item = value;
			if (value != null) {
				item.setProducto(this);
			}
			if (litem != null && litem.getProducto() == this) {
				litem.setProducto(null);
			}
		}
	}
	
	public basededatosorm.Item getItem() {
		return item;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
