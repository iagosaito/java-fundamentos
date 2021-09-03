package br.com.iagosaito.threads.volatille_and_atomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class ServidorDeTeste {

    private AtomicBoolean estaRodando = new AtomicBoolean(false);

    public static void main(String[] args) throws InterruptedException {
        ServidorDeTeste servidor = new ServidorDeTeste();
        servidor.rodar();
        servidor.alterandoAtributo();
    }

    private void rodar() {
        new Thread(() -> {
            System.out.println("Servidor começando, estaRodando = " + estaRodando );

            while(!estaRodando.get()) {}

            System.out.println("Servidor rodando, estaRodando = " + estaRodando );

            while(estaRodando.get()) {}

            System.out.println("Servidor terminando, estaRodando = " + estaRodando );
        }).start();
    }

    private void alterandoAtributo() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Main alterando estaRodando = true");
        this.estaRodando.set(true);

        Thread.sleep(5000);
        System.out.println("Main alterando estaRodando = false");
        this.estaRodando.set(false);
    }
}