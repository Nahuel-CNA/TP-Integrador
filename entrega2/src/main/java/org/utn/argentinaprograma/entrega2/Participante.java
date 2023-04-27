package org.utn.argentinaprograma.entrega2;

public class Participante {
	
	private String nombre;
	private int puntuacion;
	
	//Constructor
	public Participante(String nombre) {
		super();
		this.nombre = nombre;
		
	}

//Getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	

}
