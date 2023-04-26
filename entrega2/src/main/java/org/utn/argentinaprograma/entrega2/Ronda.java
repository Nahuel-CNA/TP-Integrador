package org.utn.argentinaprograma.entrega2;

import java.util.ArrayList;
import java.util.List;

public class Ronda {
	
	private int nro;
	private List<Partido> partidos = new ArrayList<>();
	
	
	public Ronda(String nro) {
		super();
		this.nro = Integer.parseInt(nro);
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
		
	}
	public List<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	
	@Override
	public String toString() {
		return "Ronda nro = " + nro ;
	}
	
	
	

}
