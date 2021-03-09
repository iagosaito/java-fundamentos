package b.lancando_excecoes;

public class FluxoLancandoExcecao {

    public static void main(String[] args) {
        System.out.println("Start of main");

        try {
            method1();
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("=== Capturando exceção lançada: " + ex);
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

//        ArithmeticException ex = new ArithmeticException();
//        throw ex;

        throw new ArithmeticException("Lancei a exceção");
    }

}
