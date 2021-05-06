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

public class UsuarioRegistradoDAO {
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatosorm.UsuarioRegistrado.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatosorm.UsuarioRegistrado.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatosorm.UsuarioRegistrado.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatosorm.UsuarioRegistrado.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy, lockMode);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatosorm.ProyectoWebPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatosorm.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado createUsuarioRegistrado() {
		return new basededatosorm.UsuarioRegistrado();
	}
	
	public static boolean save(basededatosorm.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().saveObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatosorm.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().deleteObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.UsuarioRegistrado usuarioRegistrado)throws PersistentException {
		try {
			basededatosorm.Pedido[] lPedidoss = usuarioRegistrado.pedidos.toArray();
			for(int i = 0; i < lPedidoss.length; i++) {
				lPedidoss[i].setUsuarioRegistrado(null);
			}
			basededatosorm.Correo[] lCorreoss = usuarioRegistrado.correos.toArray();
			for(int i = 0; i < lCorreoss.length; i++) {
				lCorreoss[i].setUsuarioRegistrado(null);
			}
			basededatosorm.Valoracion[] lValoracionss = usuarioRegistrado.valoracions.toArray();
			for(int i = 0; i < lValoracionss.length; i++) {
				lValoracionss[i].setUsuarioRegistrado(null);
			}
			return delete(usuarioRegistrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatosorm.UsuarioRegistrado usuarioRegistrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatosorm.Pedido[] lPedidoss = usuarioRegistrado.pedidos.toArray();
			for(int i = 0; i < lPedidoss.length; i++) {
				lPedidoss[i].setUsuarioRegistrado(null);
			}
			basededatosorm.Correo[] lCorreoss = usuarioRegistrado.correos.toArray();
			for(int i = 0; i < lCorreoss.length; i++) {
				lCorreoss[i].setUsuarioRegistrado(null);
			}
			basededatosorm.Valoracion[] lValoracionss = usuarioRegistrado.valoracions.toArray();
			for(int i = 0; i < lValoracionss.length; i++) {
				lValoracionss[i].setUsuarioRegistrado(null);
			}
			try {
				session.delete(usuarioRegistrado);
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
	
	public static boolean refresh(basededatosorm.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().refresh(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatosorm.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			basededatosorm.ProyectoWebPersistentManager.instance().getSession().evict(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByCriteria(usuarioRegistradoCriteria);
		if(usuarioRegistrados == null || usuarioRegistrados.length == 0) {
			return null;
		}
		return usuarioRegistrados[0];
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		return usuarioRegistradoCriteria.listUsuarioRegistrado();
	}
}
