package day19_arraylist_forEachLoop;

public class C03_ForEachLoop {

    public static void main(String[] args) {
        
        /* 
           Eger coklu element iceren bir yapidaki tum elementlere 
           eyni islemi yapmak istiyorsak 
           index'ten bagimsiz olarak for each loop kullanilabilir

           for each loop'da 3 seyi belirtmemiz gerekir
           1- getirilecek elementlerin data turu
           2- getirilen elemente verilecek isim (genelde each/w kullanilir)
           3- nereden getirilecegi
         */



        
        
        int[] arr = {2,4,6,8,1};
        
        // bu array'in tum elementlerini yazdiralim

        for (int each: arr
             ) {


            System.out.print(each+ " "); // 2 4 6 8 1
        }
        System.out.println(" ");


        // tum elementleri toplayalim
        int toplam = 0;

        for (int each: arr
             ) {
            toplam+=each;
        }

        System.out.println("Sayilarin toplami : " + toplam); // Sayilarin toplami : 21


        // tum sayilarin karelerini toplayalim

        toplam=0;

        for (int each: arr
             ) {

            toplam+=each*each;
        }

        System.out.println("Sayilarin kareleri toplami : " + toplam); // Sayilarin kareleri toplami : 121
    }
}
