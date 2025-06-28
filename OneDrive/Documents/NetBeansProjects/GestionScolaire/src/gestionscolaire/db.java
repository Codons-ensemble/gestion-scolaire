/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscolaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Worten
 */
public class db {
    
     public static Connection mysconn(){
        
        Connection con = null;
        
        try{
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");// chagement du driver
            
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root",""); // coonction a la base de doonees
            
            
            return con;
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Erreur de connexion:" + e.getMessage());
        }
        return null;
    }
    
}
