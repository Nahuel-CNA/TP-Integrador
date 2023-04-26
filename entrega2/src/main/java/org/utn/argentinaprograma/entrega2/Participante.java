package org.utn.argentinaprograma.entrega2;

public class Participante {
	
	private String nombre;
	private int puntuacion;
	
	
	public Participante(String nombre) {
		super();
		this.nombre = nombre;
		
	}


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
