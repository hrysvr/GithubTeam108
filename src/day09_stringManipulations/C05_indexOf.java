package day09_stringManipulations;

public class C05_indexOf {

    public static void main(String[] args) {

        String str = "Java ile kodlama cok kolay";

        // str "cok" iceriyor mu ?

        System.out.println(str.contains("cok")); // true

        //kullanicidan aldigimiz cumle "cok" kelimesiyle bitiyor mu ?
        System.out.println(str.endsWith("cok")); // false

        // indexOf bize karakterin integer degerini yani sirasini dondurur, yazdirir

        System.out.println(str.indexOf('a')); // 1
        System.out.println(str.indexOf("v")); // 2

        System.out.println(str.indexOf("cok")); // 17 (bu paketin basladigi index'i yazdirir)

        System.out.println(str.indexOf("a", 5)); // 13

        // 2.o'nun index'ini yazdirin
        // once ilk o'nun index'ini buluruz
        // sonra o index'ten sonrasinda 2.o'yu aratiriz
        // "Java ile kodlama cok kolay"

        int ilkOindexi= str.indexOf("o"); // 10
        int ikinciOindexi= str.indexOf("o",ilkOindexi+1);

        System.out.println(ilkOindexi+ " " + ikinciOindexi);


    }
}
