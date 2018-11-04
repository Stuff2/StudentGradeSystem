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
public class oders extends mysql implements dersintf{
    
    private String dersi;
    private int vize,fnl,ogrno;
    
    void dersekle(int no,String ders,int vize,int fnl) throws Exception{
        super.bağlan();
     PreparedStatement p = con.prepareStatement("insert into dersnot(ogrno,dersad,vizenot,finalnot) values(?,?,?,?);");
        p.setInt(1, no);
     p.setString(2, ders);
        p.setInt(3, vize);
        p.setInt(4, fnl);
        int executeUpdate = p.executeUpdate();
        this.dersi=ders;
        this.ogrno=no;
        this.vize=vize;
        this.fnl=fnl;
        System.out.println("Öğrenci ders bilgileri bilgileri");
        System.out.printf("%d "+ders +"%d  %d\n",no,vize,fnl);  
        super.kopar();
    }
    void güncelle(int no,String ders,int vize,int fnl)throws Exception{
    ara(no,ders,false,false);
    super.bağlan();
    if (vize==-1)
        vize=this.vize;
    if (fnl==-1)
        fnl=this.fnl;
    
         PreparedStatement p = con.prepareStatement("update dersnot set vizenot=?,finalnot=? where ogrno=? and dersad=? ");
        p.setInt(1, vize);
        p.setInt(2, fnl);
        p.setInt(3, no);
        p.setString(4, ders);
        int executeUpdate = p.executeUpdate();
    super.kopar();
    ara(no,ders,true,false);
    
    }
       void ara(int no,String disim,boolean yaz,boolean ort )throws Exception{
           super.bağlan();
     PreparedStatement p = con.prepareStatement("select vizenot,finalnot from dersnot where ogrno=? and dersad=?");
        p.setInt(1,no);
        p.setString(2, disim);
   
        ResultSet q=p.executeQuery();
        q.first();
        
    vize=q.getInt("vizenot");
    fnl=q.getInt("finalnot");
    if(yaz==true){
    
    System.out.println("Öğrenci ders bilgileri");
    System.out.printf("%d "+disim +" vize:%d  final:%d\n",no,vize,fnl); 
    if(ort==true)
    System.out.printf("Ortalama:%.2f\n",(float)(vize+fnl)/2); 
    }
        
     super.kopar();
    }
    
}

