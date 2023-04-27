package org.utn.argentinaprograma.entrega3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.opencsv.CSVReader;

//Se llama asi esat clase porque procesaria el CSV
public class Procesador {
    private PronosticoBD pronosticoBD;
    
    private int puntosGanar;
    private int puntosPerder;
    private int puntosEmpatar;
    private int puntosExtraRonda;
    private int puntosExtraFase;
    
    //constructor
    public Procesador(Connection conn, int puntosGanar, int puntosPerder, int puntosEmpatar, int puntosExtraRonda, int puntosExtraFase) {
        this.pronosticoBD = new PronosticoBD(conn);
        this.puntosGanar = puntosGanar;
        this.puntosPerder = puntosPerder;
        this.puntosEmpatar = puntosEmpatar;
        this.puntosExtraRonda = puntosExtraRonda;
        this.puntosExtraFase = puntosExtraFase;
    }

    public void procesar(String archivoResultados) throws IOException, SQLException {
        // Leer resultados de CSV
        CSVReader reader = new CSVReader(new FileReader(archivoResultados));
        String[] linea;

        while ((linea = reader.readNext()) != null) {
            String fase = linea[0];
            String ronda = linea[1];
            String equipoLocal = linea[2];
            int golLocal = Integer.parseInt(linea[3]);
            String equipoVisitante = linea[4];
            int golVisitante = Integer.parseInt(linea[5]);

            Resultado resultado = new Resultado(fase, ronda, equipoLocal, golLocal, equipoVisitante, golVisitante);

            
        }
    }
}
           
            
            