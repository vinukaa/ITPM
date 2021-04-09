/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Msi 9RDS
 */
public class connection {
  
        public static Connection Connectdb()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm project?zeroDateTimeBehavior=convertToNull","root","");
            // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm project","root","");
            System.out.println("Database Connection Successfull!!");
            return conn;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e );
            return null;
        }   
    }
}
