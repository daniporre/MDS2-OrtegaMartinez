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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class OfertaDAO {
	public static Oferta loadOfertaByORMID(int idOferta) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadOfertaByORMID(session, idOferta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(int idOferta) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getOfertaByORMID(session, idOferta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(int idOferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadOfertaByORMID(session, idOferta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(int idOferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getOfertaByORMID(session, idOferta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(PersistentSession session, int idOferta) throws PersistentException {
		try {
			return (Oferta) session.load(basededatosorm.Oferta.class, new Integer(idOferta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(PersistentSession session, int idOferta) throws PersistentException {
		try {
			return (Oferta) session.get(basededatosorm.Oferta.class, new Integer(idOferta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(PersistentSession session, int idOferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Oferta) session.load(basededatosorm.Oferta.class, new Integer(idOferta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(PersistentSession session, int idOferta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Oferta) session.get(basededatosorm.Oferta.class, new Integer(idOferta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryOferta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryOferta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Oferta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOferta(session, condition, orderBy);
			return (Oferta[]) list.toArray(new Oferta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOferta(session, condition, orderBy, lockMode);
			return (Oferta[]) list.toArray(new Oferta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Oferta[] ofertas = listOfertaByQuery(session, condition, orderBy);
		if (ofertas != null && ofertas.length > 0)
			return ofertas[0];
		else
			return null;
	}
	
	public static Oferta loadOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Oferta[] ofertas = listOfertaByQuery(session, condition, orderBy, lockMode);
		if (ofertas != null && ofertas.length > 0)
			return ofertas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Oferta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta createOferta() {
		return new basededatosorm.Oferta();
	}
	
	public static boolean save(basededatosorm.Oferta oferta) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().saveObject(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatosorm.Oferta oferta) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().deleteObject(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.Oferta oferta)throws PersistentException {
		try {
			basededatosorm.Producto[] lProductoss = oferta.productos.toArray();
			for(int i = 0; i < lProductoss.length; i++) {
				lProductoss[i].setOferta(null);
			}
			return delete(oferta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.Oferta oferta, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatosorm.Producto[] lProductoss = oferta.productos.toArray();
			for(int i = 0; i < lProductoss.length; i++) {
				lProductoss[i].setOferta(null);
			}
			try {
				session.delete(oferta);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatosorm.Oferta oferta) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().refresh(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatosorm.Oferta oferta) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().evict(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByCriteria(OfertaCriteria ofertaCriteria) {
		Oferta[] ofertas = listOfertaByCriteria(ofertaCriteria);
		if(ofertas == null || ofertas.length == 0) {
			return null;
		}
		return ofertas[0];
	}
	
	public static Oferta[] listOfertaByCriteria(OfertaCriteria ofertaCriteria) {
		return ofertaCriteria.listOferta();
	}
}
