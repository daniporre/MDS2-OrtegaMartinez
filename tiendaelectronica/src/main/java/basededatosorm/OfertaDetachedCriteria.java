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

public class OfertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final DoubleExpression precio;
	public final StringExpression marca;
	public final CollectionExpression valoracions;
	public final CollectionExpression fotos;
	public final IntegerExpression itemId;
	public final AssociationExpression item;
	public final StringExpression nombreOferta;
	public final StringExpression fechaFinOferta;
	public final DoubleExpression porcentaje;
	public final IntegerExpression idOferta;
	
	public OfertaDetachedCriteria() {
		super(basededatosorm.Oferta.class, basededatosorm.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.ID", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_fotos", this.getDetachedCriteria());
		itemId = new IntegerExpression("item.id", this.getDetachedCriteria());
		item = new AssociationExpression("item", this.getDetachedCriteria());
		nombreOferta = new StringExpression("nombreOferta", this.getDetachedCriteria());
		fechaFinOferta = new StringExpression("fechaFinOferta", this.getDetachedCriteria());
		porcentaje = new DoubleExpression("porcentaje", this.getDetachedCriteria());
		idOferta = new IntegerExpression("idOferta", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatosorm.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.ID", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		marca = new StringExpression("marca", this.getDetachedCriteria());
		valoracions = new CollectionExpression("ORM_valoracions", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_fotos", this.getDetachedCriteria());
		itemId = new IntegerExpression("item.id", this.getDetachedCriteria());
		item = new AssociationExpression("item", this.getDetachedCriteria());
		nombreOferta = new StringExpression("nombreOferta", this.getDetachedCriteria());
		fechaFinOferta = new StringExpression("fechaFinOferta", this.getDetachedCriteria());
		porcentaje = new DoubleExpression("porcentaje", this.getDetachedCriteria());
		idOferta = new IntegerExpression("idOferta", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria createCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("categoria"));
	}
	
	public basededatosorm.ValoracionDetachedCriteria createValoracionsCriteria() {
		return new basededatosorm.ValoracionDetachedCriteria(createCriteria("ORM_valoracions"));
	}
	
	public basededatosorm.FotosDetachedCriteria createFotosCriteria() {
		return new basededatosorm.FotosDetachedCriteria(createCriteria("ORM_fotos"));
	}
	
	public ItemDetachedCriteria createItemCriteria() {
		return new ItemDetachedCriteria(createCriteria("item"));
	}
	
	public Oferta uniqueOferta(PersistentSession session) {
		return (Oferta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Oferta[] listOferta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}
