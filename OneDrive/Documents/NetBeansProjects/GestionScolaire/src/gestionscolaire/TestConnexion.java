/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscolaire;
import java.sql.Connection;

/**
 *
 * @author Worten
 */
public class TestConnexion {
    
    public static void main(String[] args){
        
        
        Connection conn = db.mysconn(); // apple la methode de connection
        
        
        // verifer la conntion
        
        if(conn != null){
            System.out.println("Test réussi :  Connesion bien etablie");
        } else {
              System.out.println("Test échoué :  Connesion non etablie");
        }
        
        
    }
    
}
