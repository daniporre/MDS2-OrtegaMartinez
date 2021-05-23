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

public class CorreoDAO {
	public static Correo loadCorreoByORMID(int idCorreo) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadCorreoByORMID(session, idCorreo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo getCorreoByORMID(int idCorreo) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getCorreoByORMID(session, idCorreo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo loadCorreoByORMID(int idCorreo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadCorreoByORMID(session, idCorreo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo getCorreoByORMID(int idCorreo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getCorreoByORMID(session, idCorreo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo loadCorreoByORMID(PersistentSession session, int idCorreo) throws PersistentException {
		try {
			return (Correo) session.load(basededatosorm.Correo.class, new Integer(idCorreo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo getCorreoByORMID(PersistentSession session, int idCorreo) throws PersistentException {
		try {
			return (Correo) session.get(basededatosorm.Correo.class, new Integer(idCorreo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo loadCorreoByORMID(PersistentSession session, int idCorreo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Correo) session.load(basededatosorm.Correo.class, new Integer(idCorreo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo getCorreoByORMID(PersistentSession session, int idCorreo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Correo) session.get(basededatosorm.Correo.class, new Integer(idCorreo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCorreo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryCorreo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCorreo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryCorreo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo[] listCorreoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listCorreoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo[] listCorreoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listCorreoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCorreo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Correo as Correo");
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
	
	public static List queryCorreo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Correo as Correo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Correo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo[] listCorreoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCorreo(session, condition, orderBy);
			return (Correo[]) list.toArray(new Correo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo[] listCorreoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCorreo(session, condition, orderBy, lockMode);
			return (Correo[]) list.toArray(new Correo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo loadCorreoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadCorreoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo loadCorreoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadCorreoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo loadCorreoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Correo[] correos = listCorreoByQuery(session, condition, orderBy);
		if (correos != null && correos.length > 0)
			return correos[0];
		else
			return null;
	}
	
	public static Correo loadCorreoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Correo[] correos = listCorreoByQuery(session, condition, orderBy, lockMode);
		if (correos != null && correos.length > 0)
			return correos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCorreoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateCorreoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCorreoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateCorreoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCorreoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Correo as Correo");
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
	
	public static java.util.Iterator iterateCorreoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Correo as Correo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Correo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo createCorreo() {
		return new basededatosorm.Correo();
	}
	
	public static boolean save(basededatosorm.Correo correo) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().saveObject(correo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatosorm.Correo correo) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().deleteObject(correo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.Correo correo)throws PersistentException {
		try {
			if (correo.getUsuarioRegistrado() != null) {
				correo.getUsuarioRegistrado().correos.remove(correo);
			}
			
			return delete(correo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.Correo correo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (correo.getUsuarioRegistrado() != null) {
				correo.getUsuarioRegistrado().correos.remove(correo);
			}
			
			try {
				session.delete(correo);
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
	
	public static boolean refresh(basededatosorm.Correo correo) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().refresh(correo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatosorm.Correo correo) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().evict(correo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Correo loadCorreoByCriteria(CorreoCriteria correoCriteria) {
		Correo[] correos = listCorreoByCriteria(correoCriteria);
		if(correos == null || correos.length == 0) {
			return null;
		}
		return correos[0];
	}
	
	public static Correo[] listCorreoByCriteria(CorreoCriteria correoCriteria) {
		return correoCriteria.listCorreo();
	}
}
