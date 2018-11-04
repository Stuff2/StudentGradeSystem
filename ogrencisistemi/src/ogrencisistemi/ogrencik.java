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
public class ogrencik extends mysql implements bilgiintf{
  
   private String isim,sisim,bölüm;
   private int yas;

    
   
    
    
    public void ekle(String isim,String sisim,String bölüm)throws Exception {
        super.bağlan();
        PreparedStatement p = con.prepareStatement("insert into ogrencik(ograd,soyad,bolum) values(?,?,?);");
        p.setString(1, isim);
        p.setString(2, sisim);
        p.setString(3, bölüm);
        int executeUpdate = p.executeUpdate();
       //ekle sonra id çek
        p = con.prepareStatement("select ogrno from ogrencik where ograd=? and soyad=?");
        p.setString(1, isim);
        p.setString(2, sisim);
   
        ResultSet q=p.executeQuery();
        q.first();
        
        this.isim=isim;
        this.sisim=sisim;
        this.bölüm=bölüm;
        //bilgileri yazdır
           System.out.println("Eklenen öğrenci bilgileri");
        System.out.println(q.getString("ogrno")+isim +" "+ sisim +" " + bölüm);
        super.kopar();
        
        
}
    void ara(int num,boolean yaz)throws Exception {
        super.bağlan();
        PreparedStatement p = con.prepareStatement("select ograd,soyad,bolum from ogrencik where ogrno=?");
        p.setInt(1, num);
   
        ResultSet q=p.executeQuery();
        q.first();
        
    
    this.isim=q.getString("ograd");
    this.sisim=q.getString("soyad");
   this. bölüm=q.getString("bolum");
    if (yaz==true){
           System.out.println("Öğrenci bilgileri bilgileri");
        System.out.println(isim +" "+ sisim +" " + bölüm);  
    }
     super.kopar();
     
    }
   public void silme(int num)throws Exception {
        ara(num,true);
        super.bağlan();
        PreparedStatement p = con.prepareStatement("delete from ogrencik where ogrno=?");
        p.setInt(1, num);
        int q=p.executeUpdate();
        super.kopar();
       
    }
    void güncelle(int num,String isim,String sisim,String bölüm)throws Exception{
        ara(num,false);
        super.bağlan();
        
        
         PreparedStatement p = con.prepareStatement("update ogrencik set ograd=?,soyad=?,bolum=? where ogrno=? ");
        p.setString(1, isim);
        p.setString(2, sisim);
        p.setString(3, bölüm);
        p.setInt(4, num);
        int executeUpdate = p.executeUpdate();
        super.kopar();
        ara(num,true);
        
        
    }

    @Override
    public void silme(String isim, String sisim) throws Exception {
         }
}
