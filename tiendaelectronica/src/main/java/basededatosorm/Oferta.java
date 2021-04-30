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
@Table(name="Oferta")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ProductoId", referencedColumnName="Id")
public class Oferta extends basededatosorm.Producto implements Serializable {
	public Oferta() {
	}
	
	@Column(name="NombreOferta", nullable=true, length=255)	
	private String nombreOferta;
	
	@Column(name="FechaFinOferta", nullable=true, length=255)	
	private String fechaFinOferta;
	
	@Column(name="Porcentaje", nullable=false)	
	private double porcentaje;
	
	@Column(name="IdOferta", nullable=false, length=10)	
	private int idOferta;
	
	public void setNombreOferta(String value) {
		this.nombreOferta = value;
	}
	
	public String getNombreOferta() {
		return nombreOferta;
	}
	
	public void setFechaFinOferta(String value) {
		this.fechaFinOferta = value;
	}
	
	public String getFechaFinOferta() {
		return fechaFinOferta;
	}
	
	public void setPorcentaje(double value) {
		this.porcentaje = value;
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}
	
	public void setIdOferta(int value) {
		this.idOferta = value;
	}
	
	public int getIdOferta() {
		return idOferta;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
