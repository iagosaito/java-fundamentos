package br.com.iagosaito.threads.api_concurrency;

import java.time.Duration;

class ComandoC2 implements Comando {

    @Override
    public void run() {
        try {
            System.out.println("Executando comando c2... (Este aqui é demorado)");
            Thread.sleep(Duration.ofSeconds(20).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Comando c2 executado!!");
    }

}
