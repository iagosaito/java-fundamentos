package br.com.iagosaito.threads;

public class TesteThreadProcessamentoAssincrono {

    public static void main(String[] args) {

        System.out.println("Testando processamento assíncrono via Thread.Start()");

        new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Isso será executado por último, pois está numa thread separada com sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread Separada").start();

        System.out.println("Isso está na Thread do método main e por isso será executado primeiro");
    }
}
