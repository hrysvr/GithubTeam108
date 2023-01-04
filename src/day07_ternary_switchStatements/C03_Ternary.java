package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {

        // input olarak verilen sayiyi kontrol edip
        // sayi cift ise "cift sayi"
        // degilse "tek sayi" yazdirin

        int input = 44;

        // if else ile yapalim

        if (input % 2 == 0) {
            System.out.println("Cift sayi");
        }else {
            System.out.println("Tek sayi");
        }

        // ternary ile yapalim

        System.out.println(input%2==0 ? "Cift sayi" : "Tek sayi");


    }
}
