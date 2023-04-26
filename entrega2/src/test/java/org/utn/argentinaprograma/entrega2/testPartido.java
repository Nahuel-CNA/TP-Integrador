package org.utn.argentinaprograma.entrega2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPartido {
	
	@Test
	public void testPartido () {
		
		Equipo equipo1 = new Equipo ("Argentina");
		Equipo equipo2 = new Equipo ("Croacia");
		Partido partido = new Partido (equipo1,equipo2,3,0);
		
	
		
		assertEquals("Ganador", partido.resultado(equipo1) );
	}
	
}
