/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencisistemi;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;




/**
 *
 * @author Spancer
 */
public abstract class mysql {
    static  Connection con;
    void bağlan(){
     try {
            Class.forName("com.mysql.jdbc.Connection");
 con =(com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrencisistemi","root","");
 
        } catch (Exception ex) {
           System.out.print("Bir bağlantı hatası");
        }
     
    }
    void kopar(){
    
     try {
     con.close();
        } catch (Exception ex) {
           System.out.print("Bir bağlantı ayrılamama hatası");
        }
     
    }
    
 
    }
    
  
