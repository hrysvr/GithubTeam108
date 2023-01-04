package day3_dataCasting_MatematikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {

        // % Modulus : java'da bolme islemi sonucunda kalan sayiyi verir

        System.out.println(15 % 4 ); // 3

        System.out.println(45 % 4); // 1

        /* kullanicinin girdigi deger cift sayi mi ?
           girilenSayi % 2 isleminin sonucu 0 ise cift sayidir
           kullanicinin girdigi sayi 7'nin kati mi ?
           girilensayi % 7 isleminin sonucu 0 ise 7'nin katidir
           kullanicinin girdigi sayinin birler basamagini bulalim
           kullanici 3426 girdi
         */

        // birler basamagini bulmak icin %10 yapiyoruz

        int girilenSayi=3426;
        int birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 342


        birlerBasamagi= girilenSayi % 10; // 2
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 34

        birlerBasamagi= girilenSayi % 10; // 4
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 3

        birlerBasamagi= girilenSayi % 10; // 3
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi); // 0
    }
}

