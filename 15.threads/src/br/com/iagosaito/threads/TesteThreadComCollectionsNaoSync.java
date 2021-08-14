package br.com.iagosaito.threads;

public class TesteThreadComCollectionsNaoSync {

    public static void main(String[] args) throws InterruptedException {

        final Lista lista = new Lista();

        for (int i = 0; i < 2; i++) {
            new Thread(new ListaAdicionaElemento(lista, i)).start();
        }

        new Thread(new TarefaImprimirElemento(lista)).start();
    }

    private static class TarefaImprimirElemento implements Runnable {

        private final Lista lista;

        public TarefaImprimirElemento(final Lista lista) {
            this.lista = lista;
        }

        @Override
        public void run() {

            synchronized (lista) {
                try {
                    lista.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i < lista.tamanho(); i++) {
                    System.out.println(i + " - " + lista.pegaElemento(i));
                }
            }
        }
    }
}

class ListaAdicionaElemento implements Runnable {

    private final Lista list;
    private final int numeroDaThread;

    ListaAdicionaElemento(final Lista list, final int numeroDaThread) {
        this.list = list;
        this.numeroDaThread = numeroDaThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            list.adicionaElemento("Thread " + numeroDaThread + " - " + i);
        }
    }
}

class Lista {

    private final String[] elementos = new String[200];
    private int indice;

    public synchronized void adicionaElemento(final String elemento) {
        this.elementos[indice] = elemento;
        this.indice++;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (indice == elementos.length) {
            this.notify();
        }
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

}