package org.utn.argentinaprograma.entrega3;

import java.util.ArrayList;
import java.util.List;


public class Jugador {
    private String nombre;
    private List<Pronostico> pronosticos;
    private int puntos;
//constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.pronosticos = new ArrayList<>();
        this.puntos = 0;
    }

    public void agregarPronostico(Pronostico pronostico) {
        this.pronosticos.add(pronostico);
    }

    public Pronostico getPronostico(String fase, String ronda, String equipoLocal, String equipoVisitante) {
        for (Pronostico pronostico : pronosticos) {
            if (pronostico.getFase().equals(fase) && 
                pronostico.getRonda().equals(ronda) &&
                pronostico.getEquipoLocal().equals(equipoLocal) &&
                pronostico.getEquipoVisitante().equals(equipoVisitante)) {
                return pronostico;
            }
        }
        return null;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pronostico> getPronosticos() {
		return pronosticos;
	}

	public void setPronosticos(List<Pronostico> pronosticos) {
		this.pronosticos = pronosticos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

    // Getters y setters
}
