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
@Table(name="Item")
public class Item implements Serializable {
	public Item() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatosorm.ORMConstants.KEY_ITEM_PRODUCTO) {
			this.producto = (basededatosorm.Producto) owner;
		}
		
		else if (key == basededatosorm.ORMConstants.KEY_ITEM_PEDIDO) {
			this.pedido = (basededatosorm.Pedido) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOSORM_ITEM_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOSORM_ITEM_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=basededatosorm.Pedido.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PedidoIdPedido", referencedColumnName="IdPedido", nullable=false) }, foreignKey=@ForeignKey(name="FKItem600544"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Pedido pedido;
	
	@OneToOne(optional=false, targetEntity=basededatosorm.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoIdProducto", referencedColumnName="IdProducto", nullable=false) }, foreignKey=@ForeignKey(name="FKItem423252"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Producto producto;
	
	@Column(name="IdProducto", nullable=false, length=10)	
	private int idProducto;
	
	@Column(name="IdPedido", nullable=false, length=10)	
	private int idPedido;
	
	@Column(name="CantidadProducto", nullable=false, length=10)	
	private int cantidadProducto;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIdProducto(int value) {
		this.idProducto = value;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	
	public void setIdPedido(int value) {
		this.idPedido = value;
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	
	public void setCantidadProducto(int value) {
		this.cantidadProducto = value;
	}
	
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	
	public void setProducto(basededatosorm.Producto value) {
		if (this.producto != value) {
			basededatosorm.Producto lproducto = this.producto;
			this.producto = value;
			if (value != null) {
				producto.setItem(this);
			}
			if (lproducto != null && lproducto.getItem() == this) {
				lproducto.setItem(null);
			}
		}
	}
	
	public basededatosorm.Producto getProducto() {
		return producto;
	}
	
	public void setPedido(basededatosorm.Pedido value) {
		if (pedido != null) {
			pedido.cantidadProductos.remove(this);
		}
		if (value != null) {
			value.cantidadProductos.add(this);
		}
	}
	
	public basededatosorm.Pedido getPedido() {
		return pedido;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pedido(basededatosorm.Pedido value) {
		this.pedido = value;
	}
	
	private basededatosorm.Pedido getORM_Pedido() {
		return pedido;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
