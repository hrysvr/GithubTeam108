package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {

    public static void main(String[] args) {

        // Map'deki soyisimleri buyuk harfe ceviren bir method olusturun

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap= MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);

        // 11. siniflari yazdir

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11"); // 101 Ali CAN MF
                                                                  // 103 Ali CEM TM
                                                                  // 105 Sevgi CEM TM



    }
}
