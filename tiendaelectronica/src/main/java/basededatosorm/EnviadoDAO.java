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

public class EnviadoDAO {
	public static Enviado loadEnviadoByORMID(int idPedido) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadEnviadoByORMID(session, idPedido);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(int idPedido) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getEnviadoByORMID(session, idPedido);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(int idPedido, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadEnviadoByORMID(session, idPedido, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(int idPedido, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getEnviadoByORMID(session, idPedido, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(PersistentSession session, int idPedido) throws PersistentException {
		try {
			return (Enviado) session.load(basededatosorm.Enviado.class, new Integer(idPedido));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(PersistentSession session, int idPedido) throws PersistentException {
		try {
			return (Enviado) session.get(basededatosorm.Enviado.class, new Integer(idPedido));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(PersistentSession session, int idPedido, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Enviado) session.load(basededatosorm.Enviado.class, new Integer(idPedido), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(PersistentSession session, int idPedido, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Enviado) session.get(basededatosorm.Enviado.class, new Integer(idPedido), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryEnviado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryEnviado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Enviado as Enviado");
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
	
	public static List queryEnviado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Enviado as Enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Enviado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEnviado(session, condition, orderBy);
			return (Enviado[]) list.toArray(new Enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEnviado(session, condition, orderBy, lockMode);
			return (Enviado[]) list.toArray(new Enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Enviado[] enviados = listEnviadoByQuery(session, condition, orderBy);
		if (enviados != null && enviados.length > 0)
			return enviados[0];
		else
			return null;
	}
	
	public static Enviado loadEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Enviado[] enviados = listEnviadoByQuery(session, condition, orderBy, lockMode);
		if (enviados != null && enviados.length > 0)
			return enviados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Enviado as Enviado");
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
	
	public static java.util.Iterator iterateEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.Enviado as Enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Enviado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado createEnviado() {
		return new basededatosorm.Enviado();
	}
	
	public static boolean save(basededatosorm.Enviado enviado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().saveObject(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatosorm.Enviado enviado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().deleteObject(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.Enviado enviado)throws PersistentException {
		try {
			if (enviado.getTransportista() != null) {
				enviado.getTransportista().enviado.remove(enviado);
			}
			
			if (enviado.getUsuarioRegistrado() != null) {
				enviado.getUsuarioRegistrado().pedidos.remove(enviado);
			}
			
			basededatosorm.Item[] lItemss = enviado.items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setPedido(null);
			}
			return delete(enviado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.Enviado enviado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (enviado.getTransportista() != null) {
				enviado.getTransportista().enviado.remove(enviado);
			}
			
			if (enviado.getUsuarioRegistrado() != null) {
				enviado.getUsuarioRegistrado().pedidos.remove(enviado);
			}
			
			basededatosorm.Item[] lItemss = enviado.items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setPedido(null);
			}
			try {
				session.delete(enviado);
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
	
	public static boolean refresh(basededatosorm.Enviado enviado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().refresh(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatosorm.Enviado enviado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().evict(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByCriteria(EnviadoCriteria enviadoCriteria) {
		Enviado[] enviados = listEnviadoByCriteria(enviadoCriteria);
		if(enviados == null || enviados.length == 0) {
			return null;
		}
		return enviados[0];
	}
	
	public static Enviado[] listEnviadoByCriteria(EnviadoCriteria enviadoCriteria) {
		return enviadoCriteria.listEnviado();
	}
}
