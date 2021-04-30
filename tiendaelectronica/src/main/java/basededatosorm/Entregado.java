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
@Table(name="Entregado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="PedidoId", referencedColumnName="Id")
public class Entregado extends basededatosorm.Pedido implements Serializable {
	public Entregado() {
	}
	
	@Column(name="FechaEntrega", nullable=true, length=255)	
	private String fechaEntrega;
	
	public void setFechaEntrega(String value) {
		this.fechaEntrega = value;
	}
	
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
