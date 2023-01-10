package day32_sets_maps;

import java.util.Map;

public class C07_SoyIsimIleOgrenciArama {

    // ogrenci map'de aradigimiz soyisimdeki ogrencilerin
    // Isim, soyisim, sinif ve sube bilgilerini
    // bir tablo olarak yazdiran bir method olusturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Cem");

    }


}
