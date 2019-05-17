/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konutsatısuygulaması;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Yazlık extends Yapı{
    String tip;
    
    public Yazlık(int fiyat, int yas, int odasayisi, int kat, String konum, boolean havuz, String tip) {
        super(fiyat, yas, odasayisi, kat, konum, havuz);
    }
          public void get(){
        
        System.out.print("Fiyat "+this.fiyat+" Yaşı "+this.yas+" Oda Sayısı "+this.odasayisi+" Konum "+this.konum+" havuz "+this.havuz);
        
    }
}
