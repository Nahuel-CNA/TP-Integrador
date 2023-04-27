package org.utn.argentinaprograma.entrega3;

import java.sql.*;
//Esta clase iba a ser la encargada de conectar con la Base de datos 
public class Conexion {
    private Connection conn; // variable conn

    public Conexion(String url, String usuario, String contrasena) throws SQLException {
        this.conn = DriverManager.getConnection(url, usuario, contrasena);
    }
    //metodo de la conexion que se haga, devuelve la conexion almacenada
    public Connection getConn() {
        return conn;
    }
}
