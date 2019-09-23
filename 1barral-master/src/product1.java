
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aspire 3
 */
public class product1 {
    String forname=  "com.mysql.jdbc.Driver";
   String driver = "jdbc:mysql://localhost/registration";
   String us = "root";
   String ps1 ="";
   
   
   public void add(String product, int quantity, String price){
        try {
            Class.forName(forname);
            Connection con = DriverManager.getConnection(driver,us,ps1);
            PreparedStatement ps = con.prepareStatement("insert into products values(null,?,?,?)");
            ps.setString(1, product);
            ps.setInt(2, quantity);
            ps.setString(3,price);
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product1.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
