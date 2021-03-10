package g.entendendo_finally;

public class FluxoComFinally {

    public static void main(String[] args) {
        System.out.println("Start of main");


        /*
            Para testar o finally, execute o código uma vez e depois comente a exceção lançada na linha 32
            e execute novamente.

            Perceba que o println será executado em ambos os casos.
         */
        try {
            method1();
        } catch (Exception ex) {
            System.out.println("=== Capturando exceção com catch genérico: " + ex);
        } finally {
            System.out.println("=== Este trecho vai ser executado caso a exceção seja lançada ou não");
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

        throw new RuntimeException("Exceção lançada");
    }
}
