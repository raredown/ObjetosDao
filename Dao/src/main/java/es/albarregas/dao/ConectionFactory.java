/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Daw2
 */
public class ConectionFactory {

   // Connection conexion = null;
    //String driver = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        //String connectionString = "jdbc:mysql://localhost:3306/pruebasJava";
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasJava", "java2017", "2017");
        
        } catch (SQLException ex) {
            System.out.println("no conectos");
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    public static void closeConexion(Connection conexion){
        
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }

}
