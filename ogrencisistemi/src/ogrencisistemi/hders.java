/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencisistemi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Spancer
 */
public class hders extends mysql implements dersintf {
   
    private static int id;
    
  
    void ekle(String isim,String sisim,String ders) throws Exception{
        super.bağlan();
         PreparedStatement p = con.prepareStatement("select hocaid from hocak where hocaisim=? and hocasoyisim=?");
        p.setString(1, isim);
        p.setString(2, sisim);
        ResultSet q=p.executeQuery();
        q.first();
        id=q.getInt("hocaid");
  
     p = con.prepareStatement("insert into hocaders(hocaid,dersad) values(?,?);");
        p.setInt(1, id);
     p.setString(2, ders);
       int executeUpdate = p.executeUpdate();
       super.kopar();
       
    }
  //"SELECT hocak.hocaisim,hocak.hocasoyisim,hocaders.dersad FROM `hocak`INNER JOIN hocaders on hocak.hocaid=hocaders.hocaid WHERE hocak.hocaisim=\"ali\""
    //çift sorgu
}
