package est.edu.ec.JEELibros.modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compra {
	
	@Id
	@GeneratedValue
	private int codigo;
	private Date fecha;
	private Cliente cliente;
	private Libro libro;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
	
}
