package f.criando_catch_generico;

public class FluxoCatchGenerico {

    public static void main(String[] args) {
        System.out.println("Start of main");

        /*
            Como vimos na hierarquia de classes de exceção, todas herdam da classe Exception. Sendo assim,
            podemos criar um catch genérico capturando a classe Exception.
         */
        try {
            method1();
        } catch (Exception ex) {
            System.out.println("=== Capturando exceção com catch genérico: " + ex);
        }

        System.out.println("End of main");
    }

    private static void method1() {
        System.out.println("Start of method1");
        method2();
        System.out.println("End of method1");
    }

    private static void method2() {
        System.out.println("Start of method2");

        throw new ArithmeticException("Exceção lançada");
    }

}
