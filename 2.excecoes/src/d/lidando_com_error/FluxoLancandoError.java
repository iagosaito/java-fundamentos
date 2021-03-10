package d.lidando_com_error;

public class FluxoLancandoError {

    public static void main(String[] args) {
        System.out.println("Start of main");
        method1();
        System.out.println("End of main");
    }

    private static void method1() {
        System.out.println("Start of method1");
        method2();
        System.out.println("End of method1");
    }

    /*
        Este método chama a si mesmo recursivamente de forma infinita. Isso vai
        ocasionar no famoso error StackOverFlowError.

        StackOverFlowError é um erro grave de sistema pensado para desenvolvedores da JVM.
     */
    private static void method2() {
        System.out.println("Start of method2");

        method2();

        System.out.println("End of method2");
    }
}
