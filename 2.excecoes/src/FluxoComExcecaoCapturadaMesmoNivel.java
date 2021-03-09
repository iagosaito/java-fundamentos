public class FluxoComExcecaoCapturadaMesmoNivel {

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

    private static void method2() {
        System.out.println("Start of method2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                int lancandoExcecao = 1 / 0;
            } catch (ArithmeticException ex) {
                System.out.println("=== Capturei a exceção no mesmo nível em que ela foi lançada ===");
            }
        }

        System.out.println("End of method2");
    }
}