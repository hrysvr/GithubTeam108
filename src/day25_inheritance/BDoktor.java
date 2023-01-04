package day25_inheritance;

public class BDoktor extends APersonel{

    /* Olusturdugumuz Doktor class'inda isim soyisim gibi
        Personel class'inda olusturulan tum ozelliklerin olmasini istiyoruz
        Bu durumda 2 tercih var
             1- istenen tum ozellikleri Doktor class'inda yeniden olusturabilirsiniz
             2- Doktor class'ini Personel'in child'i yapmak

           Doktor class'ini Personel class'inin child'i yaptigimizda
           Doktor class'indan olusturlan objeler
           sadece kendi class'larindaki ozelliklere sahip olmaz
           ayni zamanda parent class'i olan Personel'deki
           ozelliklere de sahip olurlar

           Bir child class'dan obje olusturdugumuzda
           o objenin ozelliklerini belirlerken
           once kendi class'ina bakilir ve o ozellik varsa kullanilir
           eger kendi class'inda yoksa parent class'a bakilir


          Bir class extends keyword kullanarak baska bir class'i
          kendisine parent edilirse
          1- parent class'daki tum ozellikleri direk kullanabilir
             (isim,soyisim,telefon,ozelsigorta)
          2- isterse parent class'da olan bir ozelligi kendisine uyarlayabilir
             (maas)
          3- isterse parent class'da olmayan kendisine ozel yeni ozellikler olusturabilir
             (nobet)
     */

    public static void main(String[] args) {

        BDoktor dok1 = new BDoktor();
        dok1.isim ="Kemal";
        dok1.soyIsim ="Bulut";

        System.out.println(dok1.isim + "," + dok1.soyIsim + "," + dok1.telefon);
        // Kemal,Bulut,Telefon atanmadi
        dok1.maas(); // Doktor maasi 30 * 8 * 25 : 6000
        dok1.ozelSigorta(); // Tum personelin ozel saglik sigortasi yaptirilir
        dok1.nobet(); // Doktorlar haftada 1 gun nobet tutar

    }

    public void maas(){
        System.out.println("Doktor maasi 30 * 8 * 25 : " + 6000);
    }

    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutar");
    }
}
