package br.com.iagosaito.threads.api_concurrency;

import java.time.Duration;

class ComandoC1 implements Comando {

    @Override
    public void run() {

        try {
            System.out.println("Executando comando c1...");
            Thread.sleep(Duration.ofSeconds(5).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Comando c1 executado!!");
    }
}
