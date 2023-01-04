package day23_dateTime_varargs;

public class C07_Varargs {

    public static void main(String[] args) {

        // Kac tane string adrgument yazilirsa yazilsin
        // Argumentlerin en uzun olanini yazdiran bir method olusturun
        // Not : en uzun kelime olarak birden fazla kelime varsa, ilkini yazdirin


        enUzunuYazdir ("Ilyas","Berivan","Murat");
        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer","Kerime");

    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enuzunKelime = kelimeler[0];

        for (String eachKelime: kelimeler
            ) {

            if (eachKelime.length()>enuzunKelime.length()){
                enuzunKelime=eachKelime;
            }
        }

        System.out.println(enuzunKelime); // Berivan
                                          // Mehmet 

    }
}
