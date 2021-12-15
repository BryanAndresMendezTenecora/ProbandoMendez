package est.edu.ec.JEELibros.modelos;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Libro {
	@Id
	@GeneratedValue
	private int codigo;
	private String titulo;
	private String autor;
	private String edicion;
	private Double precio;
	public int getCodigo() {
		return codigo;
		
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
