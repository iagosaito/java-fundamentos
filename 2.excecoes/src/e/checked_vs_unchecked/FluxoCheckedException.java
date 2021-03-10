package e.checked_vs_unchecked;

/*
    As unchecked exceptions que NÃO te obrigam a tratar ou lançar a exceção.
    São exceptions que herdam diretamente da classe RuntimeException.
 */
public class FluxoCheckedException {

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

        throw new UncheckedException();
    }
}
