package est.edu.ec.JEELibros.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private String apellido;
	private Double credito;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Double getCredito() {
		return credito;
	}
	public void setCredito(Double credito) {
		this.credito = credito;
	}
	
	
	
	
}
