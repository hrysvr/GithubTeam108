package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1999,10,27);
        LocalDate bugun = LocalDate.now(); // P23Y1M24D

        Period yas = Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P23Y1M23D
        System.out.println(yas.getYears()); // 23

        LocalDate baslangic = LocalDate.of(2010,8,5);
        LocalDate bitis = LocalDate.of(2015,7,20);

        Period sure = Period.between(baslangic,bitis);
        System.out.println(sure); // P4Y11M15D


    }
}
