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
public class Producto implements Serializable, Comparable<Producto> {
	public Producto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_CATEGORIAS) {
			return ORM_categorias;
		}
		else if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_VALORACIONS) {
			return ORM_valoracions;
		}
		else if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_FOTOS) {
			return ORM_fotos;
		}
		else if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_ITEMS) {
			return ORM_items;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_PRODUCTO_OFERTA) {
			this.oferta = (basededatosorm.Oferta) owner;
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
	
	@Column(name="IdProducto", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOSORM_PRODUCTO_IDPRODUCTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOSORM_PRODUCTO_IDPRODUCTO_GENERATOR", strategy="native")	
	private int idProducto;
	
	@ManyToOne(targetEntity=basededatosorm.Oferta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="OfertaIdOferta", referencedColumnName="IdOferta") }, foreignKey=@ForeignKey(name="FKProducto151090"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Oferta oferta;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Marca", nullable=true, length=255)	
	private String marca;
	
	@ManyToMany(targetEntity=basededatosorm.Categoria.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Categoria_Producto", joinColumns={ @JoinColumn(name="ProductoIdProducto") }, inverseJoinColumns={ @JoinColumn(name="CategoriaIdCategoria") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_categorias = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=basededatosorm.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valoracions = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=basededatosorm.Fotos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_fotos = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=basededatosorm.Item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_items = new java.util.HashSet();
	
	private void setIdProducto(int value) {
		this.idProducto = value;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	
	public int getORMID() {
		return getIdProducto();
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
	
	private void setORM_Categorias(java.util.Set value) {
		this.ORM_categorias = value;
	}
	
	private java.util.Set getORM_Categorias() {
		return ORM_categorias;
	}
	
	@Transient	
	public final basededatosorm.CategoriaSetCollection categorias = new basededatosorm.CategoriaSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_PRODUCTO_CATEGORIAS, basededatosorm.ORMConstants.KEY_CATEGORIA_PRODUCTOS, basededatosorm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
	
	public void setOferta(basededatosorm.Oferta value) {
		if (oferta != null) {
			oferta.productos.remove(this);
		}
		if (value != null) {
			value.productos.add(this);
		}
	}
	
	public basededatosorm.Oferta getOferta() {
		return oferta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Oferta(basededatosorm.Oferta value) {
		this.oferta = value;
	}
	
	private basededatosorm.Oferta getORM_Oferta() {
		return oferta;
	}
	
	private void setORM_Items(java.util.Set value) {
		this.ORM_items = value;
	}
	
	private java.util.Set getORM_Items() {
		return ORM_items;
	}
	
	@Transient	
	public final basededatosorm.ItemSetCollection items = new basededatosorm.ItemSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_PRODUCTO_ITEMS, basededatosorm.ORMConstants.KEY_ITEM_PRODUCTO, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdProducto());
	}
	
	@Override
	public int compareTo(Producto pro) {
		if (this.precio < pro.getPrecio()) {
			return -1;
		}
		if (this.precio > pro.getPrecio()) {
			return 1;
		}
		return 0;
	}
	
}
