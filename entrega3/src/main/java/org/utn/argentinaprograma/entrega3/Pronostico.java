package org.utn.argentinaprograma.entrega3;

public class Pronostico {
	 //Los distintos datos para almacenar pronostico 
    private String nombre;
    private String fase;
    private String ronda;
    private String equipoLocal;
    private String equipoVisitante;
    private String pronostico;
    
   
//Constructor
    public Pronostico(String nombre, String fase, String ronda, String equipoLocal, String equipoVisitante, String pronostico) {
        this.nombre = nombre;
        this.fase = fase;
        this.ronda = ronda;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.pronostico = pronostico;
    }

    
    //Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public String getRonda() {
		return ronda;
	}

	public void setRonda(String ronda) {
		this.ronda = ronda;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public String getPronostico() {
		return pronostico;
	}

	public void setPronostico(String pronostico) {
		this.pronostico = pronostico;
	}

   
}
