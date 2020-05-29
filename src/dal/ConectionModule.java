/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author bmend
 */
public class ConectionModule {
   //Method responsible for establishing the connection with the Database
    public static Connection conector() {
    java.sql.Connection conexao = null; //conexao is the name of the variable
    
    //the line above "call" the driver
    String driver = "com.mysql.jdbc.Driver";
    
    // Storing information regarding the database
    String url="jdbc:mysql://localhost:3306/vgcdb";
    String user="root";
    String password="root";
    
    //Establishing database connection
          try {
           Class.forName(driver);
           conexao = DriverManager.getConnection(url, user, password);
           return conexao;
                   
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"There is no connection with the database\n "+e);
            return null;
            
        }
    
    }
    
}
