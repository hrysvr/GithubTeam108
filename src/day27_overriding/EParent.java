package day27_overriding;

public class EParent extends DGrandParent{


    @Override
    protected void method1() {
        System.out.println("P method1");
    }

    // @override rotasyonu overridden method ile overriding method'u ilisiklendirir
    // eger overridden method'da bu iliskiyi bozacak bir degisiklik yapilirsa
    // @override CTE verir



    protected void method2(){
        System.out.println("P method2");
    }


    private void method3(){
        System.out.println("P method3");
    }
}
