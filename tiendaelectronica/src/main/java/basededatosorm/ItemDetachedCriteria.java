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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ItemDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression pedidoId;
	public final AssociationExpression pedido;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	
	public ItemDetachedCriteria() {
		super(basededatosorm.Item.class, basededatosorm.ItemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pedidoId = new IntegerExpression("pedido.idPedido", this.getDetachedCriteria());
		pedido = new AssociationExpression("pedido", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.idProducto", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
	}
	
	public ItemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.ItemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pedidoId = new IntegerExpression("pedido.idPedido", this.getDetachedCriteria());
		pedido = new AssociationExpression("pedido", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.idProducto", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
	}
	
	public PedidoDetachedCriteria createPedidoCriteria() {
		return new PedidoDetachedCriteria(createCriteria("pedido"));
	}
	
	public ProductoDetachedCriteria createProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("producto"));
	}
	
	public Item uniqueItem(PersistentSession session) {
		return (Item) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Item[] listItem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Item[]) list.toArray(new Item[list.size()]);
	}
}

