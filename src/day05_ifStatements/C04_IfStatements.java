package day05_ifStatements;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

        /*
        if cumlelerinde sart parantezinden sonra body kullanmazsak
        ilk ;'e kadar ilan kismi body olarak kabul eder
        yani sadece 1 satir kodu body olarak kabul eder

        Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        mutlaka { } suslu parantez kullanilmalidir
         */

        // Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi yaziniz");

        int sayi = scan.nextInt();

        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }

        if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}
