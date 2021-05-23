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
@Table(name="UsuarioRegistrado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario")
public class UsuarioRegistrado extends basededatosorm.Usuario implements Serializable {
	public UsuarioRegistrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatosorm.ORMConstants.KEY_USUARIOREGISTRADO_PEDIDOS) {
			return ORM_pedidos;
		}
		else if (key == basededatosorm.ORMConstants.KEY_USUARIOREGISTRADO_CORREOS) {
			return ORM_correos;
		}
		else if (key == basededatosorm.ORMConstants.KEY_USUARIOREGISTRADO_VALORACIONS) {
			return ORM_valoracions;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NumeroTarjeta", nullable=false, length=255)	
	private String numeroTarjeta;
	
	@Column(name="TitularTarjeta", nullable=true, length=255)	
	private String titularTarjeta;
	
	@Column(name="FechaVencimientoTarjeta", nullable=true, length=255)	
	private String fechaVencimientoTarjeta;
	
	@Column(name="Cvv", nullable=false, length=10)	
	private int cvv;
	
	@Column(name="DireccionUsuario", nullable=true, length=255)	
	private String direccionUsuario;
	
	@Column(name="EstaOperativo", nullable=false, length=1)	
	private boolean estaOperativo;
	
	@Column(name="CodigoPostal", nullable=true, length=255)	
	private String codigoPostal;
	
	@Column(name="Ciudad", nullable=true, length=255)	
	private String ciudad;
	
	@Column(name="Provincia", nullable=true, length=255)	
	private String provincia;
	
	@OneToMany(mappedBy="usuarioRegistrado", targetEntity=basededatosorm.Pedido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pedidos = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarioRegistrado", targetEntity=basededatosorm.Correo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_correos = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarioRegistrado", targetEntity=basededatosorm.Valoracion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valoracions = new java.util.HashSet();
	
	public void setNumeroTarjeta(String value) {
		this.numeroTarjeta = value;
	}
	
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	
	public void setTitularTarjeta(String value) {
		this.titularTarjeta = value;
	}
	
	public String getTitularTarjeta() {
		return titularTarjeta;
	}
	
	public void setFechaVencimientoTarjeta(String value) {
		this.fechaVencimientoTarjeta = value;
	}
	
	public String getFechaVencimientoTarjeta() {
		return fechaVencimientoTarjeta;
	}
	
	public void setCvv(int value) {
		this.cvv = value;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	public void setDireccionUsuario(String value) {
		this.direccionUsuario = value;
	}
	
	public String getDireccionUsuario() {
		return direccionUsuario;
	}
	
	public void setEstaOperativo(boolean value) {
		this.estaOperativo = value;
	}
	
	public boolean getEstaOperativo() {
		return estaOperativo;
	}
	
	public void setCodigoPostal(String value) {
		this.codigoPostal = value;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setProvincia(String value) {
		this.provincia = value;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	private void setORM_Pedidos(java.util.Set value) {
		this.ORM_pedidos = value;
	}
	
	private java.util.Set getORM_Pedidos() {
		return ORM_pedidos;
	}
	
	@Transient	
	public final basededatosorm.PedidoSetCollection pedidos = new basededatosorm.PedidoSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_USUARIOREGISTRADO_PEDIDOS, basededatosorm.ORMConstants.KEY_PEDIDO_USUARIOREGISTRADO, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Correos(java.util.Set value) {
		this.ORM_correos = value;
	}
	
	private java.util.Set getORM_Correos() {
		return ORM_correos;
	}
	
	@Transient	
	public final basededatosorm.CorreoSetCollection correos = new basededatosorm.CorreoSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_USUARIOREGISTRADO_CORREOS, basededatosorm.ORMConstants.KEY_CORREO_USUARIOREGISTRADO, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Valoracions(java.util.Set value) {
		this.ORM_valoracions = value;
	}
	
	private java.util.Set getORM_Valoracions() {
		return ORM_valoracions;
	}
	
	@Transient	
	public final basededatosorm.ValoracionSetCollection valoracions = new basededatosorm.ValoracionSetCollection(this, _ormAdapter, basededatosorm.ORMConstants.KEY_USUARIOREGISTRADO_VALORACIONS, basededatosorm.ORMConstants.KEY_VALORACION_USUARIOREGISTRADO, basededatosorm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
