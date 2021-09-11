package br.com.iagosaito.threads.api_concurrency;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.*;

class ComandoC2 implements Comando {

    private final ExecutorService threadPool;
    private final Socket socket;
    private final PrintStream printStream;
    private Future<String> webServiceRequest;
    private Future<String> bancoDeDadosRequest;

    public ComandoC2(ExecutorService threadPool, Socket socket) throws IOException {
        this.threadPool = threadPool;
        this.socket = socket;
        this.printStream = new PrintStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            System.out.println("Executando comando c2... (Este aqui é demorado)");
            this.webServiceRequest = threadPool.submit(new WebService(new PrintStream(socket.getOutputStream())));
            this.bancoDeDadosRequest = threadPool.submit(new AcessaBancoDeDados(new PrintStream(socket.getOutputStream())));

            final String requestBancoDeDadosId = bancoDeDadosRequest.get(10, TimeUnit.SECONDS);
            final String requestWebServiceId = webServiceRequest.get(20, TimeUnit.SECONDS);

            this.printStream.printf("Resultado do comando c2: WebService = %s, Banco de dados = %s%n",
                    requestWebServiceId, requestBancoDeDadosId);

            System.out.println("Comando c2 executado!!");

        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Timeout! Cancelando o comando C2");

            this.printStream.println("Comando C2 falhou! Timeout");

            webServiceRequest.cancel(true);
            bancoDeDadosRequest.cancel(true);
        }
    }

}
