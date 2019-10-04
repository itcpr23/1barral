
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
 * @author Acer Aspire E 15
 */
public class Product_Class {
    
Connection_class con = new Connection_class();
  public int AddToProd(String prod_name, int prod_quantity, Float prod_price){
     int x = 0;
     try{
         Class.forName(con.forname);
         Connection cnn = DriverManager.getConnection(con.driver, con.us, con.ps1);
         PreparedStatement pr = cnn.prepareStatement("Insert into products values (null,?,?,?)");
         pr.setString(1, prod_name);
         pr.setInt(2, prod_quantity);
         pr.setObject(3,prod_price);
         x = pr.executeUpdate();
         
         
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Product_Class.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Product_Class.class.getName()).log(Level.SEVERE, null, ex);
    }return x;
    } 
  public void Product_Delete(int id){

    try{
        Class.forName(con.forname);
        Connection ccon = DriverManager.getConnection(con.driver,con.us,con.ps1);
        PreparedStatement prep = ccon.prepareStatement("delete from products where id = ?");
        prep.setInt(1, id);
        prep.executeUpdate();
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Product_Class.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Product_Class.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 
    }  

