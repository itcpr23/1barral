
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
 * @author Acer
 *//////
public class LogIn {
Connection_class con = new Connection_class();
   
   public int Enter(String uname, String pword){int x=0;
       try {
           Class.forName(con.forname);
           Connection cnn = DriverManager.getConnection(con.driver,con.us,con.ps1);
           PreparedStatement pss = cnn.prepareStatement("Select * from user where username = ? and password = md5(?)");
           pss.setString(1, uname);
           pss.setString(2,pword );
           ResultSet rs = pss.executeQuery();
           if(rs.next()){
               x=1;
               
           }else{
               x=0;
           }
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(register_class.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(register_class.class.getName()).log(Level.SEVERE, null, ex);
       }return x;
   }
}
