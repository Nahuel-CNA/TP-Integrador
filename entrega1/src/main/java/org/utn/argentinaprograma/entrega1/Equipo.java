package org.utn.argentinaprograma.entrega1;

public class Equipo {
	
	private String nombre;
	private String descripcion;
	
	
	//Constructor
	public Equipo(String nombre) {
		this.nombre = nombre;
	} 
	
	
	// Get y Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
