package day12_MethodCreation;

public class C04_Faktoriyel {

    public static void main(String[] args) {

        // verilen bir sayinin 15'den kucuk bir pozitif tam sayi oldugunu kontrol edin
        // kucukse bir method olusturup, faktoriyel degerini yazdirin
        // sayi istenen aralikta degilse uyari yazdirin

        int input = 12;

        if (input>0 && input<15){
            faktoriyelYazdir(input);
        }else {
            System.out.println("Girirlen sayi 15'den kucuk pozitif tamsayi olmalidir");
        }


    }

    public static void faktoriyelYazdir(int sayi){

        int faktoriyelSonucu = 1;

        for (int i = sayi; i >= 1 ; i--) {

            faktoriyelSonucu *= i; // her loop'da gelen sayiyi onceki deger ile carpalim
        }

        System.out.println("Girilen " + sayi + " icin faktoriyel : " + faktoriyelSonucu);
    }
}
