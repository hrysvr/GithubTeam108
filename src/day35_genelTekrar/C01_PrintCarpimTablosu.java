package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintCarpimTablosu {

    public static void main(String[] args) {

        // Kullanicidan bir rakam alin ve carpim tablosu olusturun

        Scanner scan = new Scanner(System.in);
        int girilenSayi=0;

        while (girilenSayi<=1 || girilenSayi>=10) {
            try {
                System.out.println("Carpim tablosu olusturmak icin bir rakam giriniz");
                girilenSayi= scan.nextInt();

                if (girilenSayi>1 && girilenSayi<10){
                    break;
                }
                System.out.println("Carpim tablosu icin pozitif bir rakam girmelisiniz ");
            } catch (InputMismatchException e) {
                System.out.println("Carpim tablosu icin pozitif bir rakam girmelisiniz ");
                scan.next();
            }
        }

        for (int i = 1; i <= girilenSayi; i++) {

            for (int j = 1; j <= girilenSayi ; j++) {

                int carpim =i*j;
                System.out.printf("%-3d  ", carpim);
            }

            System.out.println(" ");

        }

        /*
        sayilarin arasinda 2 space var
        sayilarda 2 karakter seklinde yazilip saga dayali yapildi
        1  2   3  4   5
        2  4   6  8  10
        3  6   9 12  15
        4  8  12 16  20

        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25
         */

    }
}
