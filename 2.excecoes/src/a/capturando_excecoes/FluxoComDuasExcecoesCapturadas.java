package a.capturando_excecoes;

public class FluxoComDuasExcecoesCapturadas {

    public static void main(String[] args) {
        System.out.println("Start of main");
        method1();
        System.out.println("End of main");
    }


    private static void method1() {
        System.out.println("Start of method2");
        for(int i = 1; i <= 8; i++) {
            System.out.println(i);

            /*
                If criado apenas para fins didáticos para lançar dois tipos de exceções diferentes
             */
            try {
                if (i % 2 == 0) {
                    Conta conta = null;
                    conta.saca();
                } else {
                    int lancandoExcecao = 1/0;
                }
            } catch (ArithmeticException | NullPointerException ex) {
                System.out.println("=== Capturou a exceção: " + ex);
            }

        }

        System.out.println("End of method2");
    }

}
