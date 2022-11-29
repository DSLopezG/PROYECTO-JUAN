/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionBD {
    
    private final String BASE = "proyectofinal";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/proyectofinal";
    private final String USERNAME = "root";
    private final String PASSWORD = "1234";
    private Connection con=null;
    
    public Connection getConexion() {
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.URL,this.USERNAME,this.PASSWORD);
            
            
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    
}
