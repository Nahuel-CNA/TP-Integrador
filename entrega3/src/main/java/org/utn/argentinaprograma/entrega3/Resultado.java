package org.utn.argentinaprograma.entrega3;
//Clase que representaria los resultado del partido
public class Resultado {
    private String fase;
    private String ronda;
    private String equipoLocal;
    private int golLocal;
    private String equipoVisitante;
    private int golVisitante;
    
    private int puntosGanados;

    
    public Resultado(int puntosGanados) {
		super();
		this.puntosGanados = puntosGanados;
	}
//constructor

	public Resultado(String fase, String ronda, String equipoLocal, int golLocal, String equipoVisitante, int golVisitante) {
        this.fase = fase;
        this.ronda = ronda;
        this.equipoLocal = equipoLocal;
        this.golLocal = golLocal;
        this.equipoVisitante = equipoVisitante;
        this.golVisitante = golVisitante;
       
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

	public int getGolLocal() {
		return golLocal;
	}

	public void setGolLocal(int golLocal) {
		this.golLocal = golLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolVisitante() {
		return golVisitante;
	}

	public void setGolVisitante(int golVisitante) {
		this.golVisitante = golVisitante;
	}

    // getters y setters
}
