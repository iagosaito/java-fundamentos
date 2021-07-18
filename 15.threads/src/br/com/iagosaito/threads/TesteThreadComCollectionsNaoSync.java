package br.com.iagosaito.threads;

import java.util.ArrayList;
import java.util.List;

public class TesteThreadComCollectionsNaoSync {

    public static void main(String[] args) throws InterruptedException {

        final List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            new Thread(new ListaAdicionaElemento(list, i)).start();
        }

        Thread.sleep(3000);

        list.forEach(System.out::println);
    }

}

class ListaAdicionaElemento implements Runnable {

    private final List<String> list;
    private final int numeroDaThread;

    ListaAdicionaElemento(final List<String> list, final int numeroDaThread) {
        this.list = list;
        this.numeroDaThread = numeroDaThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            list.add("Thread " + numeroDaThread + " - " + i);
        }
    }
}
