package org.utn.argentinaprograma.entrega2;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class testPuntos {

    @Test
    public void testPuntos() {
        Map<String, Integer> puntajes = new HashMap<>();

        /* Se crean los equipos y los partidos.
        Partidos: Octavos de final, Mundial 2022*/
        
        Equipo equipo1 = new Equipo("Países Bajos");
        Equipo equipo2 = new Equipo("Estados Unidos");
        Partido partido1 = new Partido(equipo1, equipo2);
        partido1.setGolesEquipo1(3);
        partido1.setGolesEquipo2(1);

        Equipo equipo3 = new Equipo("Argentina");
        Equipo equipo4 = new Equipo("Australia");
        Partido partido2 = new Partido(equipo3, equipo4);
        partido2.setGolesEquipo1(2);
        partido2.setGolesEquipo2(1);

        // Pronosticos de Mariana y Pedro
        Pronostico pronostico1 = new Pronostico(partido1, equipo1, "Ganador"); //1 punto para Mariana
        Pronostico pronostico2 = new Pronostico(partido2, equipo4, "Ganador"); // 0 puntos para Pedro
        
        Pronostico pronostico3 = new Pronostico(partido2, equipo3, "Ganador"); // 1 punto para Mariana
        Pronostico pronostico4 = new Pronostico(partido1, equipo2, "Ganador"); // 0 puntos para Pedro

        // Se calculan los puntos 
        String usuario1 = "Mariana";
        String usuario2 = "Pedro";
        
        int puntosUsuario1 = puntajes.getOrDefault(usuario1, 0);
        int puntosUsuario2 = puntajes.getOrDefault(usuario2, 0);
        
        puntosUsuario1 += pronostico1.puntos();
        puntosUsuario1 += pronostico3.puntos();
        
        puntosUsuario2 += pronostico2.puntos();
        puntosUsuario2 += pronostico4.puntos();
        
        puntajes.put(usuario1, puntosUsuario1);
        puntajes.put(usuario2, puntosUsuario2);

        // Test para verificar los puntos sean correctos
        assertEquals(2, puntosUsuario1);
        assertEquals(0, puntosUsuario2);
        
        //System.out.println(puntosUsuario1); 
        //System.out.println(puntosUsuario2);
        // Lo use para verificar manualmente los puntos de Mariana y Pedro
    }
    
}


