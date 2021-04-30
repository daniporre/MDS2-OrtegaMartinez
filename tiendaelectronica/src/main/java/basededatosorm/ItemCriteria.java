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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ItemCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression pedidoId;
	public final AssociationExpression pedido;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	public final IntegerExpression idProducto;
	public final IntegerExpression idPedido;
	public final IntegerExpression cantidadProducto;
	
	public ItemCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		pedidoId = new IntegerExpression("pedido.id", this);
		pedido = new AssociationExpression("pedido", this);
		productoId = new IntegerExpression("producto.id", this);
		producto = new AssociationExpression("producto", this);
		idProducto = new IntegerExpression("idProducto", this);
		idPedido = new IntegerExpression("idPedido", this);
		cantidadProducto = new IntegerExpression("cantidadProducto", this);
	}
	
	public ItemCriteria(PersistentSession session) {
		this(session.createCriteria(Item.class));
	}
	
	public ItemCriteria() throws PersistentException {
		this(basededatosorm.ProyectoWebPersistentManager.instance().getSession());
	}
	
	public PedidoCriteria createPedidoCriteria() {
		return new PedidoCriteria(createCriteria("pedido"));
	}
	
	public ProductoCriteria createProductoCriteria() {
		return new ProductoCriteria(createCriteria("producto"));
	}
	
	public Item uniqueItem() {
		return (Item) super.uniqueResult();
	}
	
	public Item[] listItem() {
		java.util.List list = super.list();
		return (Item[]) list.toArray(new Item[list.size()]);
	}
}

