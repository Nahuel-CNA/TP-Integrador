package org.utn.argentinaprograma.entrega2;

public class Equipo {
	
	private String nombre;
	private String descripcion;
	
	//Constructor
	public Equipo(String nombre) {
		this.nombre = nombre;
	} 
	
	
	//Getters y setters
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
