package day13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {

    public static void main(String[] args) {

        /*
        random olarak 1 ile 100 arasinda bir sayi olusturun
        kullanicidan bu sayiyi bilmesini isteyin
        kullanici her deger girdiginde
        tuttugumuz sayi ile karsilastirip tahminin buyut veya kucult diyelim
        kullnici tutugumuz sayiyi bildiginde tahmin sayisini ve
        -3 veya daha az tahminde bildiyse "Waowww"
        -4 - 8 tahminde bildiyse "aferin"
        daha fazla tahminde bildiyse basarisiz yazdirin
         */

        Random rnd=new Random();
        int tutulanSayi= rnd.nextInt(100);
        int tahminSayi = 0;
        int sayac = 1;

        Scanner scan=new Scanner(System.in);

        while (tutulanSayi!=tahminSayi) {
            System.out.println("Lutfen bir tahmin giriniz");
            tahminSayi = scan.nextInt();

            if (tutulanSayi == tahminSayi) {
                System.out.println(sayac + " tahmin ile tuttugum sayiyi buldun");
                if (sayac <= 3) {
                    System.out.println("Vaoowww");
                } else if (sayac <= 8) {
                    System.out.println("Aferin");
                } else {
                    System.out.println("Basarisiz");
                }
                break;
            } else if (tahminSayi<tahminSayi) {
                System.out.println("Sayiyi buyut");
                sayac++;
            } else {
                System.out.println("Sayiyi kucult");
                sayac++;
            }
        }
    }
}
