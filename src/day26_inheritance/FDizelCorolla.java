package day26_inheritance;

public class FDizelCorolla extends  ECorolla {

    String motor= "1.6 dizel motor";
    String yakit= "Dizel";
    String guvenlik= "Abs";
    String renk= "renk belirtilmedi";


    public static void main(String[] args) {

        DToyota c3= new FDizelCorolla();

        System.out.println(c3.motor); // Toyota class'indan yazdirir
        System.out.println(c3.yakit); // Toyota class'indan yazdirir
        // System.out.println(c3.guvenlik); CTE verir
        // System.out.println(c3.renk); CTE verir


        System.out.println(c3.model); // Toyota class'indan yazdirir
        // System.out.println(c3.uretimYeri); CTE verir
        // System.out.println(c3.teker); CTE verir
        // System.out.println(c3.vites); CTE verir


        System.out.println(c3.marka); // Toyota class'indan yazdirir



        // Bazen child class'tan obje olusturmakla beraber
        // bu child class'in  parent class'indaki hangi ozellikleri
        // aldigini bilmek isteriz
        // Bu durumda data turunu, contructor'i kullanilan class'in
        // parent class'larindan secebiliriz



        ECorolla c2= new FDizelCorolla();

        System.out.println(c2.motor); // Toyota class'indan yazdirir
        System.out.println(c2.yakit); // Toyota class'indan yazdirir
        // System.out.println(c2.guvenlik); CTE verir
        // System.out.println(c2.renk); CTE verir


        System.out.println(c2.model); // Corolla class'indan yazdirir
        System.out.println(c2.uretimYeri); // Corolla class'indan yazdirir
        System.out.println(c2.teker); // Corolla class'indan yazdirir
        System.out.println(c2.vites); // Corolla class'indan yazdirir


        System.out.println(c2.marka); // Toyota class'indan yazdirir





        FDizelCorolla c1= new FDizelCorolla();


        System.out.println(c1.motor); // FDizelCorolla class'indan yazdirir
        System.out.println(c1.yakit); // FDizelCorolla class'indan yazdirir
        System.out.println(c1.guvenlik); // FDizelCorolla class'indan yazdirir
        System.out.println(c1.renk); // FDizelCorolla class'indan yazdirir


        System.out.println(c1.model); // Corolla class'indan yazdirir
        System.out.println(c1.uretimYeri); // Corolla class'indan yazdirir
        System.out.println(c1.teker); // Corolla class'indan yazdirir
        System.out.println(c1.vites); // Corolla class'indan yazdirir


        System.out.println(c1.marka); // Toyota class'indan yazdirir




    }
}
