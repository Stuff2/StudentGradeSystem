/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencisistemi;
import java.sql.PreparedStatement;



/**
 *
 * @author Spancer
 */
public class hocak   extends mysql implements bilgiintf  {
     
   private String isim,sisim,bölüm;
  

 
   public void ekle(String isim,String sisim,String bölüm) throws Exception{
       super.bağlan();
        PreparedStatement p = con.prepareStatement("insert into hocak(hocaisim,hocasoyisim,hocab) values(?,?,?);");
        p.setString(1, isim);
        p.setString(2, sisim);
        p.setString(3, bölüm);
 
        int executeUpdate = p.executeUpdate();

        this.isim=isim;
        this.sisim=sisim;
        this.bölüm=bölüm;
         System.out.println("Eklenen Öğretim görevlisi bilgileri");
        System.out.println(isim +" "+ sisim +" " + bölüm);
        super.kopar();
}
 
   public void silme(String isim,String sisim)throws Exception {
        super.bağlan();
      PreparedStatement p = con.prepareStatement("delete from hocak where hocaisim=? and hocasoyisim=?");
        p.setString(1, isim);
        p.setString(2, sisim);
        int q=p.executeUpdate();
        super.kopar();
    }

    @Override
    public void silme(int num) throws Exception {
         }

    

    
    
}
