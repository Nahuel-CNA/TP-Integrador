package org.utn.argentinaprograma.entrega3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//Esta clase obtendria los pronosticos de la base de datos

public class PronosticoBD {
    private Connection conn;

    public PronosticoBD(Connection conn) {
        this.conn = conn;
    }
//Metodo de consulta SQL de la tabla pronostico
    public List<Pronostico> obtenerPronosticos() throws SQLException {
        List<Pronostico> pronosticos = new ArrayList<>();

        try (Statement stmt = conn.createStatement()) {
            String query = "SELECT nombre, fase, ronda, equipo_local, equipo_visitante, pronostico FROM pronosticos";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String fase = rs.getString("fase");
                String ronda = rs.getString("ronda");
                String equipoLocal = rs.getString("equipo_local");
                String equipoVisitante = rs.getString("equipo_visitante");
                String pronostico = rs.getString("pronostico");

                Pronostico p = new Pronostico(nombre, fase, ronda, equipoLocal, equipoVisitante, pronostico);
                pronosticos.add(p);
            }
        }

        return pronosticos;
    }
}