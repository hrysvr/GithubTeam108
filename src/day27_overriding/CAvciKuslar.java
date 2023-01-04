package day27_overriding;

public class CAvciKuslar extends BKuslar {

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {


        CAvciKuslar krt1= new CAvciKuslar();

        krt1.hareket(); // CAvciKuslar'dan calisir / ucarlar
        krt1.beslenme(); // CAvciKuslar'dan calisir / et yerler
        krt1.pence(); // CAvciKuslar'dan calisir / pencelidir
        krt1.gaga(); // CAvciKuslar'dan calisir / sivri gagali

        krt1.kanat(); // BKuslar'dan calisir / kanatlidirlar
        krt1.solunum(); // BKuslar'dan calisir / akcigerle nefes alirlar
        krt1.cogalma(); // BKuslar'dan calisir / yumurtayla cogalirlar

        krt1.omur(); // AHayvanlar'dan calisir / yasar ve olurler

        // Eger constructor ile data turu ayni ise
        // ozelligin variable veya method olmasina bakilmaksizin
        // o class'a gidilir, o class veya parent class'larda
        // bulunan ILK DEGER kullanilir



        BKuslar krt2= new CAvciKuslar();

        krt2.hareket(); // CAvciKuslar'dan calisir / ucarlar
        krt2.beslenme(); // CAvciKuslar'dan calisir / et yerler
        // krt2.pence(); BKuslar veya parent class'da yok, CTE verir
        krt2.gaga(); // CAvciKuslar'dan calisir / sivri gagali

        krt2.kanat(); // BKuslar'dan calisir / kanatlidirlar
        krt2.solunum(); // BKuslar'dan calisir / akcigerle nefes alirlar
        krt2.cogalma(); // BKuslar'dan calisir / yumurtayla cogalirlar

        krt2.omur(); // AHayvanlar'dan calisir / yasar ve olurler



        AHayvanlar krt3= new CAvciKuslar();

        krt3.hareket(); // CAvciKuslar'dan calisir / ucarlar
        krt3.beslenme(); // CAvciKuslar'dan calisir / et yerler
        // krt3.pence(); AHayvanlar'da yok, CTE verir
        // krt3.gaga(); AHayvanlar'da yok, CTE verir

        // krt3.kanat(); AHayvanlar'da yok, CTE verir
        krt3.solunum(); // BKuslar'dan calisir / akcigerle nefes alirlar
        krt3.cogalma(); // BKuslar'dan calisir / yumurtayla cogalirlar

        krt3.omur(); // AHayvanlar'dan calisir / yasar ve olurler





    }
}
