/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencisistemi;

/**
 *
 * @author Spancer
 */

import java.util.Scanner;

public class Ogrencisistemi {
private static String[] xx = new String[3];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,z;
       
        
        
        while(true){
             Scanner p=new Scanner(System.in);
        Scanner p1=new Scanner(System.in);
        Scanner p2=new Scanner(System.in);
        ogrencik ogrenci=new ogrencik();
        oders ders=new oders();
        hocak hoca=new hocak();
        hders hocad=new hders();
        System.out.println("Yapmak istediğiniz işlem için sayı giriniz");
        System.out.println("1-Öğrenci ekleme");
        System.out.println("2-Öğrenci güncelleme");
        System.out.println("3-Öğrenci silme");
        System.out.println("4-Öğrenci not ekleme");
        System.out.println("5-Öğrenci not görme");
        System.out.println("6-Öğrenci not ortalaması görme");
        System.out.println("7-Öğrenci not güncelleme");
        System.out.println("8-Öğretim üyesi ekleme");
        System.out.println("9-Öğretim üyesi silme");
        System.out.println("10-Öğretim üyesi ders atama");
        System.out.println("11-Çıkış");
      x=p.nextInt();
      if(x==11)
          break;
        try {
            switch(x){
         case 1:
             System.out.println("Öğrenci ismi giriniz");
             xx[0]=p1.nextLine();
             System.out.println("Öğrenci Soyismi giriniz");
             xx[1]=p1.next();
             System.out.println("Öğrenci Bölümü giriniz");
             xx[2]=p2.nextLine();
             ogrenci.ekle(xx[0],xx[1], xx[2]);
              break;
         case 2:
             System.out.println("Güncellenicek öğrenci no sunu giriniz,değişmeyecek kısımları aynı yazınız");
             x=p.nextInt();
             System.out.println("Öğrenci İsmi giriniz");
             xx[0]=p1.nextLine();
             System.out.println("Öğrenci Soyismi giriniz");
             xx[1]=p.next();
             System.out.println("Öğrenci Bölümü giriniz");
             xx[2]=p2.nextLine();
             ogrenci.güncelle(x,xx[0],xx[1], xx[2]);
             
              break;
         case 3:
             System.out.println("silinecek öğrenci no sunu giriniz");
             x=p.nextInt();
             ogrenci.silme(x);
              break;
         case 4:
             System.out.println("Ders eklenicek öğrenci no sunu giriniz");
             x=p.nextInt();
             System.out.println("Ders İsmi giriniz");
             xx[0]=p1.nextLine();
             System.out.println("Vize notunu giriniz");
             y=p1.nextInt();
             System.out.println("Final notunu giriniz");
             z=p2.nextInt();
             ders.dersekle(x, xx[0], y, z);
             break;
         case 5:
             System.out.println("Öğrenci no sunu giriniz");
             x=p.nextInt();
             System.out.println("Ders İsmi giriniz");
             xx[0]=p1.nextLine();
             ders.ara(x, xx[0], true, false);
              break;
         case 6:
             System.out.println("Öğrenci no sunu giriniz");
             x=p.nextInt();
             System.out.println("Ders İsmi giriniz");
             xx[0]=p1.nextLine();
             ders.ara(x, xx[0], true, true);
              break;
         case 7:
             System.out.println("Güncellenicek öğrenci no sunu giriniz,değişmeyecek nota -1 yazınız");
             x=p.nextInt();
             System.out.println("Ders ismi giriniz");
             xx[0]=p1.nextLine();
             System.out.println("Vize notunu giriniz");
             y=p1.nextInt();
             System.out.println("Final notunu giriniz");
             z=p2.nextInt();
             ders.güncelle(x, xx[0], y, z);
              break;
         case 8:
              System.out.println("Öğretim görevlisi İsmi giriniz");
             xx[0]=p1.nextLine();
             System.out.println("Öğretim görevlisi Soyismi giriniz");
             xx[1]=p1.next();
             System.out.println("Öğretim görevlisi Bölümü giriniz");
             xx[2]=p2.nextLine();
             hoca.ekle(xx[0],xx[1], xx[2]);
              break;
         case 9:
             System.out.println("Öğretim görevlisi İsmi giriniz");
             xx[0]=p2.nextLine();
             System.out.println("Öğretim görevlisi Soyismi giriniz");
             xx[1]=p2.next();
             hoca.silme(xx[0], xx[1]);
              break;
         case 10:
             System.out.println("Öğretim görevlisi İsmi giriniz");
             xx[0]=p1.nextLine();
             System.out.println("Öğretim görevlisi Soyismi giriniz");
             xx[1]=p1.next();
             System.out.println("Öğretim görevlisi Dersini giriniz");
             xx[2]=p2.nextLine();
             hocad.ekle(xx[0],xx[1], xx[2]);
              break;
         case 11:
              break;
             
      }
            
            
            
      
         
        } 
       
            
        catch (Exception ex) {
           System.out.print("Bir hata oldu \n");
          
        }
        
         
    }
    }
}
