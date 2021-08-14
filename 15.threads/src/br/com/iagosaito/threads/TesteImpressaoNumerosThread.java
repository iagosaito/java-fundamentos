package br.com.iagosaito.threads;

public class TesteImpressaoNumerosThread {
    public static void main(String[] args) {

        final int numeroFinal = 1000;

        /*
            A cada execução a ordem é alterada. Não é possível garantir a ordem de execução.
         */
        new Thread(new ImprimirNumerosThread(numeroFinal)).start();
        new Thread(new ImprimirNumerosThread(numeroFinal)).start();
        new Thread(new ImprimirNumerosThread(numeroFinal)).start();
        new Thread(new ImprimirNumerosThread(numeroFinal)).start();
        new Thread(new ImprimirNumerosThread(numeroFinal)).start();
        new Thread(new ImprimirNumerosThread(numeroFinal)).start();
    }
}

class ImprimirNumerosThread implements Runnable {


    private final int numeroFinal;

    ImprimirNumerosThread(int numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

    @Override
    public void run() {

        final long threadId = Thread.currentThread().getId();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("ID: %s - Num: %d\n", threadId, i);
        }
    }
}