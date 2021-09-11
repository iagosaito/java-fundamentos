package br.com.iagosaito.threads.api_concurrency;

import java.io.PrintStream;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.Callable;

class AcessaBancoDeDados implements Callable<String> {

    private final PrintStream printStream;

    public AcessaBancoDeDados(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public String call() throws Exception {

        printStream.println("Servidor recebeu comando C2 - Banco de Dados");

        Thread.sleep(Duration.ofSeconds(10).toMillis());

        int bancoDeDadosId = new Random().nextInt(100) + 1;

        return Integer.toString(bancoDeDadosId);
    }

}
