package org.utn.argentinaprograma.entrega2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
    public static void main(String[] args) {   
    	
    	Map<String, Integer> puntajes = new HashMap<>(); // map para almacenar los nombres y el puntaje de los jugadores

    	Collection<Partido> partidos = new ArrayList<Partido>();
    	Collection<Ronda> rondas = new ArrayList<Ronda>();
    	
    	List<Pronostico> listaPronosticos = new ArrayList<>();

    	
    	Path pathResultados = Paths.get("C:\\Curso-java\\entrega2\\src\\test\\resources\\resultado1.csv"); // src/test/resources/resultado1.csv
    	// args[0], es el argumento el cual le indicamos donde se encuentra el archivo por fuera del codigo, 
    	//haciendo mas dinamico el programa

        try (BufferedReader br = Files.newBufferedReader(pathResultados)) {
            br.readLine(); // Saltar la primera línea del archivo CSV

            String lineaResultado;
            while ((lineaResultado = br.readLine()) != null) {
                String[] campos = lineaResultado.split(",");
                
                Equipo equipo1 = new Equipo(campos[1]);
                Equipo equipo2 = new Equipo(campos[4]);
                Ronda ronda1 = new Ronda(campos[0]);
               
                Partido partido = new Partido(equipo1, equipo2);
                partido.setGolesEquipo1(Integer.parseInt(campos[2]));
                partido.setGolesEquipo2(Integer.parseInt(campos[3]));

                partidos.add(partido);
               
                //System.out.println(ronda1); //era para comprobar e
                
             //  System.out.println(lineaResultado);//borrar luego solo era para ver la tabla 
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer la línea Resultado");
            e.printStackTrace();
            System.exit(1);
        }
       

        int puntos = 0;
       
        Path pathPronosticos = Paths.get("C:\\Curso-java\\entrega2\\src\\test\\resources\\pronostico1.csv");// src/test/resources/pronostico1.csv

        try (BufferedReader br = Files.newBufferedReader(pathPronosticos)) {
            br.readLine(); // Saltar la primera línea del archivo CSV

            String lineaPronostico;
            while ((lineaPronostico = br.readLine()) != null) {
            	
            	String[] campos = lineaPronostico.split(",");
            	
            	
            	Equipo equipo1 = new Equipo(campos[1]);
                Equipo equipo2 = new Equipo(campos[5]);
              
               
              
                Partido partido = null;
                
                for(Partido partidoCol : partidos) {
                	if(partidoCol.getEquipo1().getNombre().equals(equipo1.getNombre()) && 
                			partidoCol.getEquipo2().getNombre().equals(equipo2.getNombre())){
                		
                		partido = partidoCol;
                	}
                	
                }
                Equipo equipo = null;
                String resultado = null;
            	if("X".equals(campos[2])) {
            		equipo = equipo1;
            		resultado = "Ganador"; 
            	}
            	if("X".equals(campos[3])) {
            		equipo = equipo1;
            		resultado = "Empate"; 
            	}
            	if("X".equals(campos[4])) {
            		equipo = equipo1;
            		resultado = "Perdedor"; 
            	}
            	
            	Map<String, Integer> puntajePersonas = new HashMap<>();
            	//Almacenar los puntajes de cada participante segun su nombre
            	
            	if(campos[0]==campos[0]) {
            		 
            	}// Borrar no afecta en nada
            	
            	
            	
            	// System.out.println(campos[0]); // era para ver el participante
            	
            	
            	
            	
            	Pronostico pronostico = new Pronostico(partido, equipo, resultado);

            	String nombreUsuario = campos[0];
            	int puntosUsuario = puntajes.getOrDefault(nombreUsuario, 0);
            	puntosUsuario += pronostico.puntos();
            	puntajes.put(nombreUsuario, puntosUsuario);
            	/* Se modifico el sistema de puntaje, ahora se almacena en map, utilizando el nombre como la clave
            	 * getOrDefault se uso para que en el caso de no acertar el valor predeterminado sea "0"
            	 */
            	

            	
            	puntos += pronostico.puntos();
            	
              // System.out.println(lineaPronostico);//borrar luego solo era para ver la tabla 
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer la línea Pronostico");
            e.printStackTrace();
            System.exit(1);
        }
        
        for (Map.Entry<String, Integer> entry : puntajes.entrySet()) {
            String nombreUsuario = entry.getKey();
            int puntajeUsuario = entry.getValue();
            System.out.println(nombreUsuario + ": " + puntajeUsuario + " punto/s" + ", tuvo "+ puntajeUsuario+ " acierto/s en los pronosticos");
            
            /* un pequeño bucle para imprimir el puntaje del usuario, es un iterador es decir un for each
            En cada iteración, se obtiene el nombre del usuario y su puntaje asociado y se imprimen en la consola.*/
        }
        
		System.out.println("Se obtuvo un total de: "+ puntos + " punto/s en todos los pronosticos");
		
		
 }
    	//Obersvacion podria agregarse un EnumResultado
    		 	
    
}
