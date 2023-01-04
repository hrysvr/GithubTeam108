package day24_StringBuilder;

public class C04_AccessModifier {

    String str;
    // Access modifier'i gozlerimizle goremiyorsak
    // default access modifier var demektir

    // Bu class'da default constructor var
    // str'in degeri null (default deger)
    // str'in access modifier'i default access modifier

    public static void main(String[] args) {

        D obj1 = new D();
        System.out.println(obj1.isimDefault); // Furkan
        obj1.defaulStaticOlmayanMethod();
        //default access modifier'li static method calisti

        // Baska class'lardaki class uyelerine erisimde
        // access modifier ve static keyword'u dikkate alinmalidir
        // static class uyelerini obje uzerinden kullanmaya gerek yoktur
        // illa da obje uzerinden kullanmak isterseniz7
        // class uyesinin ismini yazmaniz gerekir

        System.out.println(obj1.isimDefaultStatic); // Sevilay
        System.out.println(D.isimDefaultStatic); // Sevilay

        D.isimDefaultStatic="Mehmet";

        obj1.defaultStaticMethod(); // default access modifier'li static olmayan method calisti
        D.defaultStaticMethod(); // default access modifier'li static olmayan method calisti
    }
}
