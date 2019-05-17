/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konutsatısuygulaması;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author user
 */
public class fatura{
    
    public void getir(){
                        File dosya = new File("dosya.txt");
try {
                        FileReader r = new FileReader(dosya);//file ilk satırda açıldı
                        BufferedReader br = new BufferedReader(r);
                        System.out.println(br.readLine());
                        br.close();
                    } catch (Exception e) {
                        e.printStackTrace();//bunun ne olduğunu ben bilmiyorum hocam :)
                    }
    }
}
