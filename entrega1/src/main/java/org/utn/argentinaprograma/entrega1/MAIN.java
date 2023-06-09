package org.utn.argentinaprograma.entrega1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MAIN {
	
    public static void main(String[] args) {   
    	
    	Collection<Partido> partidos = new ArrayList<Partido>();
    	//Coleccion de objetos Partido, utilizando un lista de array
    	
    	Path pathResultados = Paths.get(args[0]); // src/test/resources/resultado1.csv
    	// args[0], es el argumento el cual le indicamos donde se encuentra el archivo por fuera del codigo, 
    	//haciendo mas dinamico el programa

        try (BufferedReader br = Files.newBufferedReader(pathResultados)) {
            br.readLine(); // Saltar la primera línea del archivo CSV

            String lineaResultado;
            while ((lineaResultado = br.readLine()) != null) {
                String[] campos = lineaResultado.split(",");
                Equipo equipo1 = new Equipo(campos[0]);
                Equipo equipo2 = new Equipo(campos[3]);
                Partido partido = new Partido(equipo1, equipo2);
                partido.setGolesEquipo1(Integer.parseInt(campos[1]));
                partido.setGolesEquipo2(Integer.parseInt(campos[2]));

                partidos.add(partido);
               // System.out.println(lineaResultado);//borrar luego solo era para ver la tabla 
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer la línea Resultado");
            e.printStackTrace();
            System.exit(1);
        }
		//Nuevo Path
        
        int puntos = 0;
       
        Path pathPronosticos = Paths.get(args[1]);// src/test/resources/pronostico1.csv

        try (BufferedReader br = Files.newBufferedReader(pathPronosticos)) {
            br.readLine(); // Saltar la primera línea del archivo CSV

            String lineaPronostico;
            while ((lineaPronostico = br.readLine()) != null) {
            	
            	String[] campos = lineaPronostico.split(",");
            	Equipo equipo1 = new Equipo(campos[0]);
                Equipo equipo2 = new Equipo(campos[4]);
                Partido partido = null;
                
                //bucle for
                for(Partido partidoCol : partidos) { //Recorre la colecion de partidos
                	if(partidoCol.getEquipo1().getNombre().equals(equipo1.getNombre()) && 
                			partidoCol.getEquipo2().getNombre().equals(equipo2.getNombre())){ /*compara los nombres de
                		los equipos */
                		
                		partido = partidoCol;
                	}
                	
                }
                Equipo equipo = null;
                String resultado = null;
                
            	if("X".equals(campos[1])) {
            		equipo = equipo1;
            		resultado = "Ganador"; 
            	}
            	if("X".equals(campos[2])) {
            		equipo = equipo1;
            		resultado = "Empate"; 
            	}
            	if("X".equals(campos[3])) {
            		equipo = equipo1;
            		resultado = "Perdedor"; 
            	}
            	Pronostico pronostico = new Pronostico(partido, equipo, resultado);
            	
            	puntos += pronostico.puntos();
            	
               // System.out.println(lineaPronostico);//borrar luego solo era para ver la tabla 
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer la línea Pronostico");
            e.printStackTrace();
            System.exit(1);
        }
		System.out.println("Los puntos obtenidos por el usuario fueron: "+ puntos + " punto/s");
		
		
 }
    	//Obersvacion podria agregarse un EnumResultado
    		 	
    
}
 