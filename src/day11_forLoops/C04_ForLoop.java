package day11_forLoops;

public class C04_ForLoop {

    public static void main(String[] args) {

        // Eger sart i'nin hicbir degeri true olmuyorsa

        // input olarak verilen sayidan 1'e kadar tum sayilari yazdirin

        int input = 23;         // eger kullanicinin pozitif ve negatif girebilecegini on gorup
                                // ona gore kod yazmazsak, loop body'sinin hic calismamasi durumu olabilir


        if (input > 1) {
            for (int i = input; i >= 1; i--) {
                System.out.println(i + " ");
            }

        }else {
            for (int i = input; i <=1 ; i++) {
                System.out.println(i+" ");
            }
        }

        // eger sart i'nin tum degerleri icin dogru oluyorsa
        // teknik olarak sonsuz loop olusur
        // bilgisayarimiz sonsuza kadar calismaz, ram dolar veya int'in sinirina ulasir
        // buna teknik olarak sonsuz loop denir

        // input olarak verilen sayidan 100'e kadar tum sayilari yazdirin
        System.out.println(" ");
        for (int i = input; i <= 100 ; i++) {
            System.out.print(i + " ");
        }
    }
}