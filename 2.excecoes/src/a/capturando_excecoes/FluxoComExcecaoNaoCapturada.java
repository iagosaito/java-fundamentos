package a.capturando_excecoes;

public class FluxoComExcecaoNaoCapturada {

    public static void main(String[] args) {
        System.out.println("Start of main");
        method1();
        System.out.println("End of main");
    }

    private static void method1() {
        System.out.println("Start of method2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Conta conta = null;
                conta.saca();
            } catch (ArithmeticException e) {
                System.out.println("=== Não vai executar ===");
            }
        }

        System.out.println("End of method2");
    }
}
