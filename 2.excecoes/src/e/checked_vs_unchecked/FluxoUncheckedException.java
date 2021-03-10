package e.checked_vs_unchecked;

/*
    As checked exceptions te obrigam a tratar ou lançar a exceção.
    São exceptions que herdam diretamente da classe Exception.
 */
public class FluxoUncheckedException {

    public static void main(String[] args) throws CheckedException {
        System.out.println("Start of main");

        method1();

        System.out.println("End of main");
    }

    private static void method1() throws CheckedException {
        System.out.println("Start of method1");
        method2();
        System.out.println("End of method1");
    }

    private static void method2() throws CheckedException {
        System.out.println("Start of method2");

        throw new CheckedException();
    }
}
