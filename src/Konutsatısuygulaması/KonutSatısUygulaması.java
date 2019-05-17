/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konutsatısuygulaması;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class KonutSatısUygulaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //nesne türetilmiş kısım
        Daire d1 = new Daire(90000, 6, 4, 1, "merkeze yakın", false);
        Daire d2 = new Daire(200000, 2, 4, 3, "merkeze yakın", false);
        Daire d3 = new Daire(340000, 6, 4, 5, "merkeze yakın", false);
        Daire d4 = new Daire(520000, 6, 4, 4, "şehir merkezi", false);
        Daire d5 = new Daire(520000, 3, 2, 2, "şehir merkezi", false);

        Rezidans r1 = new Rezidans(1000000, 3, 4, 0, "şehir merkezi", false);
        Rezidans r2 = new Rezidans(1200000, 2, 5, 0, "şehir merkezi", false);
        Rezidans r3 = new Rezidans(900000, 5, 4, 0, "şehir merkezi", false);

        Villa v1 = new Villa(800000, 2, 6, 0, "merkeze yakın", true, "triplex");
        Villa v2 = new Villa(400000, 6, 4, 0, "şehir merkezi", true, "dublex");

        Yazlık y1 = new Yazlık(800000, 6, 6, 0, "deniz kenarı", true, "triplex");
        Yazlık y2 = new Yazlık(1250000, 4, 6, 0, "deniz kenarı", true, "dublex");
        Yazlık y3 = new Yazlık(700000, 6, 4, 0, "deniz kenarı", true, "dublex");
        Yazlık y4 = new Yazlık(450000, 6, 4, 0, "deniz kenarı", false, "dublex");
        Yazlık y5 = new Yazlık(570000, 3, 5, 0, "deniz kenarı", false, "triplex");
        
        //menüyü oluşturan kod parçası
        int secim = 0;
        while (secim != 6) {
            System.out.println("\n*********************************\nKONUT SATIŞ UYGULAMASI");
            System.out.println("Satın almak istediğiniz konut tipi numarasını giriniz: ");
            System.out.println("1: Daire");
            System.out.println("2: Rezidans");
            System.out.println("3: Villa");
            System.out.println("4: Yazlık");
            System.out.println("5: fiş göster");
            System.out.println("6: çık");
            
            //dosya oluşturma ve scanner tanımlama
            Scanner x = new Scanner(System.in);
            secim = x.nextInt();
            File dosya = new File("dosya.txt");
            //seçilen konut tipine göre evlerin listelenmesi ve dosyaya kaydetme
            switch (secim) {

                case 1:
                    System.out.println("lütfen aşağıdaki menüden istediğiniz daireyi seçiniz");
                    System.out.print("1");
                    d1.get();
                    System.out.print("\n2");
                    d2.get();
                    System.out.print("\n3");
                    d3.get();
                    System.out.print("\n4");
                    d4.get();
                    System.out.print("\n5");
                    d5.get();
                    System.out.print("\n");
                    System.out.print("ana menüneye dönmek için 6 e basın");
                    int s2 = x.nextInt();

                    if ((s2 == 1) || (s2 == 2) || (s2 == 3) || (s2 == 4) || (s2 == 5)) {
                        System.out.println("satın alma başarılı");
                        try {
                            FileWriter w = new FileWriter(dosya);
                            if (s2 == 1) {
                                w.write("Fiyat " + d1.fiyat + " Yaşı " + d1.yas + " Oda Sayısı " + d1.odasayisi + " Kat " + d1.kat + " Konum " + d1.konum + " havuz " + d1.havuz);
                            }
                            if (s2 == 2) {
                                w.write("Fiyat " + d2.fiyat + " Yaşı " + d2.yas + " Oda Sayısı " + d2.odasayisi + " Kat " + d2.kat + " Konum " + d2.konum + " havuz " + d2.havuz);
                            }
                            if (s2 == 3) {
                                w.write("Fiyat " + d3.fiyat + " Yaşı " + d3.yas + " Oda Sayısı " + d3.odasayisi + " Kat " + d3.kat + " Konum " + d3.konum + " havuz " + d3.havuz);
                            }
                            if (s2 == 4) {
                                w.write("Fiyat " + d4.fiyat + " Yaşı " + d4.yas + " Oda Sayısı " + d4.odasayisi + " Kat " + d4.kat + " Konum " + d4.konum + " havuz " + d4.havuz);
                            }
                            if (s2 == 5) {
                                w.write("Fiyat " + d5.fiyat + " Yaşı " + d5.yas + " Oda Sayısı " + d5.odasayisi + " Kat " + d5.kat + " Konum " + d5.konum + " havuz " + d5.havuz);
                            }
                            w.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    } else {
                        break;
                    }
                case 2:
                    System.out.println("lütfen aşağıdaki menüden istediğiniz rezidansı seçiniz");
                    System.out.println("1");
                    r1.get();
                    System.out.println("\n2");
                    r2.get();
                    System.out.println("\n3");
                    r3.get();
                    System.out.println("\n");
                    System.out.print("ana menüneye dönmek için 4 e basın");
                    int s3 = x.nextInt();
                    if ((s3 == 1) || (s3 == 2) || (s3 == 3)) {
                        System.out.println("satın alma başarılı");
                        try {
                            FileWriter w = new FileWriter(dosya);
                            if (s3 == 1) {
                                w.write("Fiyat " + r1.fiyat + " Yaşı " + r1.yas + " Oda Sayısı " + r1.odasayisi + " Kat " + r1.kat + " Konum " + r1.konum + " havuz " + r1.havuz);
                            }
                            if (s3 == 2) {
                                w.write("Fiyat " + r2.fiyat + " Yaşı " + r2.yas + " Oda Sayısı " + r2.odasayisi + " Kat " + r2.kat + " Konum " + r2.konum + " havuz " + r2.havuz);
                            }
                            if (s3 == 3) {
                                w.write("Fiyat " + r3.fiyat + " Yaşı " + r3.yas + " Oda Sayısı " + r3.odasayisi + " Kat " + r3.kat + " Konum " + r3.konum + " havuz " + r3.havuz);
                            }
                            w.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    System.out.println("lütfen aşağıdaki menüden istediğiniz villa seçiniz");
                    System.out.println("1");
                    v1.get();
                    System.out.println("\n2");
                    v2.get();
                    System.out.println("\n");
                    System.out.print("ana menüneye dönmek için 3 e basın");
                    int s4 = x.nextInt();
                    if ((s4 == 1) || (s4 == 2)) {
                        System.out.println("satın alma başarılı");
                        try {
                            FileWriter w = new FileWriter(dosya);
                            if (s4 == 1) {
                                w.write("Fiyat " + v1.fiyat + " Yaşı " + v1.yas + " Oda Sayısı " + v1.odasayisi + " Kat " + v1.kat + " Konum " + v1.konum + " havuz " + v1.havuz);
                            }
                            if (s4 == 2) {
                                w.write("Fiyat " + v2.fiyat + " Yaşı " + v2.yas + " Oda Sayısı " + v2.odasayisi + " Kat " + v2.kat + " Konum " + v2.konum + " havuz " + v2.havuz);
                            }
                            w.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    } else {
                        break;
                    }
                case 4:
                    System.out.println("lütfen aşağıdaki menüden istediğiniz yazlığı seçiniz");
                    System.out.println("1");
                    y1.get();
                    System.out.println("\n2");
                    y2.get();
                    System.out.println("\n3");
                    y3.get();
                    System.out.println("\n4");
                    y4.get();
                    System.out.println("\n5");
                    y5.get();
                    System.out.println("\n");
                    System.out.print("ana menüneye dönmek için 6 e basın");
                    int s5 = x.nextInt();
                    if ((s5 == 1) || (s5 == 2) || (s5 == 3) || (s5 == 4) || (s5 == 5)) {
                        System.out.println("satın alma başarılı");
                        try {
                            FileWriter w = new FileWriter(dosya);
                            if (s5 == 1) {
                                w.write("Fiyat " + y1.fiyat + " Yaşı " + y1.yas + " Oda Sayısı " + y1.odasayisi + " Kat " + y1.kat + " Konum " + y1.konum + " havuz " + y1.havuz);
                            }
                            if (s5 == 2) {
                                w.write("Fiyat " + y2.fiyat + " Yaşı " + y2.yas + " Oda Sayısı " + y2.odasayisi + " Kat " + y2.kat + " Konum " + y2.konum + " havuz " + y2.havuz);
                            }
                            if (s5 == 3) {
                                w.write("Fiyat " + y3.fiyat + " Yaşı " + y3.yas + " Oda Sayısı " + y3.odasayisi + " Kat " + y3.kat + " Konum " + y3.konum + " havuz " + y3.havuz);
                            }
                            if (s5 == 4) {
                                w.write("Fiyat " + y4.fiyat + " Yaşı " + y4.yas + " Oda Sayısı " + y4.odasayisi + " Kat " + y4.kat + " Konum " + y4.konum + " havuz " + y4.havuz);
                            }
                            if (s5 == 5) {
                                w.write("Fiyat " + y5.fiyat + " Yaşı " + y5.yas + " Oda Sayısı " + y5.odasayisi + " Kat " + y5.kat + " Konum " + y5.konum + " havuz " + y5.havuz);
                            }
                            w.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    } else {
                        break;
                    }
                case 5: fatura f = new fatura();//fatura classından nesne türetildi ve çağırıldı
                    f.getir();
                    
            }
        }
    }

}
