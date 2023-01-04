package day29_final_abstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("Parent class'daki mecburi override edilecek method1'i override ettik");
    }

    @Override
    public void method2() {
        System.out.println("Parent class'daki mecburi override edilecek method2'i override ettik");
    }


     /*
         Klasik inheritance ile parent-child iliskisi olusturdugunuzda
         Parent class'daki tum ozellikleri otomtik olarak kazaniriz
         Ancak methodlari override etme MECBURIYETI YOKTUR

         Iste override edip kendimize ozellestiriririz
         Istersek de parent class'daki haliyle kullaniririz.
     */

    public static void main(String[] args) {

        // DParent obj1= new DParent();
        // 'DParent' is abstract; cannot be instantiated
        // Abstract class'larin constructor'lari vardir ama OBJE URETILEMEZ


        EChild chld1= new EChild();
        chld1.method1(); // Parent class'daki mecburi override edilecek method1'i override ettik
        chld1.method2(); // Parent class'daki mecburi override edilecek method2'i override ettik
        chld1.method3(); // Parent class'daki method 3 calisti


        DParent chld2=new EChild();
        chld2.method1();
        chld2.method2();
        chld2.method3();

    }
}
