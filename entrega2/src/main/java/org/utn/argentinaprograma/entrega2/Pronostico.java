package org.utn.argentinaprograma.entrega2;

public class Pronostico {
	
	private Partido partido;
	private Equipo equipo;
	private String resultado;
	
	
	//Constructor
	public Pronostico(Partido partido, Equipo equipo, String resultado) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}


//Getters y setters
	public Partido getPartido() {
		return partido;
	}



	public Equipo getEquipo() {
		return equipo;
	}



	public String getResultado() {
		return resultado;
	}
	
	public int puntos () {
		
		String resultadoTrue = partido.resultado(equipo);
		if(resultado.equals(resultadoTrue)) {
			return 1;
		} else {
			return 0;
		}
		
	}

}
