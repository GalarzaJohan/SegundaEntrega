/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arqtoshi
 */
public class Conexion {
    private static Connection cn =null;
    private static void conectar(){
        try {
            Class.forName("jdbc:postgresql://localhost:5432/info_heroes [postgres on public]");
            String url = "Database URL	jdbc:postgresql://localhost:5432/info_heroes";  //@equipo>puerto>Servicio
            cn = DriverManager.getConnection(url,"posgrest","mortadela13");
            System.out.println("conectando");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
 public static Connection getConnection() {
        if (cn==null){
            conectar();   
        }
        return cn;
    }
   
}
