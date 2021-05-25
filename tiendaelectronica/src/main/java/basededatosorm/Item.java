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
	
	@ManyToOne(targetEntity=basededatosorm.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoIdProducto", referencedColumnName="IdProducto", nullable=false) }, foreignKey=@ForeignKey(name="FKItem423252"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatosorm.Producto producto;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setProducto(basededatosorm.Producto value) {
		if (producto != null) {
			producto.items.remove(this);
		}
		if (value != null) {
			value.items.add(this);
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
	
	public void setPedido(basededatosorm.Pedido value) {
		if (pedido != null) {
			pedido.items.remove(this);
		}
		if (value != null) {
			value.items.add(this);
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
