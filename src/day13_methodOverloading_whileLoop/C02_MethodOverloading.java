package day13_methodOverloading_whileLoop;

public class C02_MethodOverloading {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.substring(5)); // cok guzel

        System.out.println(str.substring(3, 5)); // a

        //Eger sectigimiz isimde birden fazla method varsa buna overloading denir
        // ve ayni isimdeki methodlardan hangisinin calisacagina argument/parametre uyumu karar verir



        toplama(5,6); // 11
        toplama(5,3,1); // 9

        /*
           java ayni class icerisinde ayni isim
           ve ayni data turunden parametre sayisi ile 2 method olusturmaniza izin vermez

           1- Ismini degistirebiliriz, ancak bu durumda overloading olmaz
              overloading ayni isimde ama farkli isleve sahip methodlar olusturmak demektir
           2- Parametre sayisini degistirebiliriz
           3- Ayni sayida parametre yazip, parametrelerin data turunu degistirebiliriz
              veya farkli data turundeki parametrelerin yerini degistirebiliriz
         */


        toplama(5,6); // 2 tam sayinin toplami : 11
        toplama(4.5,5); // double ve int toplami : 9.5
        toplama(4.5,6.7); // 2 double sayi toplami : 11.2


    }

    public static void toplama(int sayi1, int sayi2){
        System.out.println("2 tam sayinin toplami : " + (sayi1+sayi2));
    }

    public static void toplama(int sayi1, int sayi2, int sayi3){
        System.out.println("3 tam sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    public static void toplama (double sayi1, int sayi2){
        System.out.println("double ve int toplami : " + (sayi1+sayi2));
    }

    public static void toplama (int sayi2, double sayi1){
        System.out.println("int ve double toplami : " + (sayi1+sayi2));
    }

    public static void toplama (double sayi1, double sayi2){
        System.out.println("2 double sayi toplami : " + (sayi1+sayi2));
    }

}
