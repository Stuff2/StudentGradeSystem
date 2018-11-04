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
public interface bilgiintf {
    void ekle(String isim,String sisim,String bölüm) throws Exception;
     void silme(String isim,String sisim) throws Exception;
     void silme(int num)throws Exception;
    
}
