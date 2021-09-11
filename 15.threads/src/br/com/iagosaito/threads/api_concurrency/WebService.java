package br.com.iagosaito.threads.api_concurrency;

import java.io.PrintStream;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.Callable;

class WebService implements Callable<String> {

    private final PrintStream printStream;

    public WebService(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public String call() throws Exception {

        printStream.println("Servidor recebeu comando C2 - Web Service");

        Thread.sleep(Duration.ofSeconds(15).toMillis());

        int webServerId = new Random().nextInt(100) + 1;

        return Integer.toString(webServerId);
    }

}
