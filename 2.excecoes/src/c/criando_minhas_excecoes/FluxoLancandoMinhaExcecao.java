package c.criando_minhas_excecoes;

public class FluxoLancandoMinhaExcecao {

    public static void main(String[] args) {
        System.out.println("Start of main");

        try {
            method1();
        } catch (ArithmeticException | NullPointerException | MinhaException ex) {
            System.out.println("=== Capturando a exceção: " + ex);
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

        throw new MinhaException("Lançando minha primeira exceção!");
    }
}
