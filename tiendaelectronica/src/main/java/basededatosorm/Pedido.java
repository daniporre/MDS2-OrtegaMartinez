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
@Table(name="Pedido")
@Inheritance(strategy=InheritanceType.JOINED)
public class Pedido implements Serializable {
	public Pedido() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatosorm.ORMConstants.KEY_PEDIDO_CANTIDADPRODUCTOS) {
			return ORM_cantidadProductos;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_PEDIDO_USUARIOREGISTRADO) {
			this.usuarioRegistrado = (basededatosorm.UsuarioRegistrado) owner;
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
	@GeneratedValue(generator="BASEDEDATOSORM_PEDIDO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOSORM_PEDIDO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatosorm.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKPedido874496"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.UsuarioRegistrado usuarioRegistrado;
	
	@Column(name="TotalProductos", nullable=false, length=10)	
	private int totalProductos;
	
	@Column(name="Direccion", nullable=true, length=255)	
	private String direccion;
	
	@Column(name="TotalPagado", nullable=false)	
	private double totalPagado;
	
	@Column(name="FechaEnvio", nullable=true, length=255)	
	private String fechaEnvio;
	
	@Column(name="FechaRecepcion", nullable=true, length=255)	
	private String fechaRecepcion;
	
	@OneToMany(mappedBy="pedido", targetEntity=basededatosorm.Item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cantidadProductos = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTotalProductos(int value) {
		this.totalProductos = value;
	}
	
	public int getTotalProductos() {
		return totalProductos;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setTotalPagado(double value) {
		this.totalPagado = value;
	}
	
	public double getTotalPagado() {
		return totalPagado;
	}
	
	public void setFechaEnvio(String value) {
		this.fechaEnvio = value;
	}
	
	public String getFechaEnvio() {
		return fechaEnvio;
	}
	
	public void setFechaRecepcion(String value) {
		this.fechaRecepcion = value;
	}
	
	public String getFechaRecepcion() {
		return fechaRecepcion;
	}
	
	private void setORM_CantidadProductos(java.util.Set value) {
		this.ORM_cantidadProductos = value;
	}
	
	private java.util.Set getORM_CantidadProductos() {
		return ORM_cantidadProductos;
	}
	
	@Transient	
	public final basededatosorm.ItemSetCollection cantidadProductos = new basededatosorm.ItemSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_PEDIDO_CANTIDADPRODUCTOS, basededatosorm.ORMConstants.KEY_ITEM_PEDIDO, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setUsuarioRegistrado(basededatosorm.UsuarioRegistrado value) {
		if (usuarioRegistrado != null) {
			usuarioRegistrado.pedidos.remove(this);
		}
		if (value != null) {
			value.pedidos.add(this);
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
		return String.valueOf(getId());
	}
	
}
