package br.com.iagosaito.threads.api_concurrency;

import java.net.Socket;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

class DelegadorDeTarefas implements Runnable {

    private final ExecutorService threadPool;
    private final Socket socket;
    private final Server server;

    public DelegadorDeTarefas(ExecutorService threadPool, final Socket socket, Server server) {
        this.threadPool = threadPool;
        this.socket = socket;
        this.server = server;
    }

    @Override
    public void run() {
        System.out.println("Cliente conectado na porta: " + socket.getPort());
        try {
            try (Scanner scanner = new Scanner(socket.getInputStream())) {
                while (scanner.hasNextLine()) {
                    final String comando = scanner.nextLine();

                    switch (comando) {
                        case "c1":
                            System.out.println("Enviando comando c1");
                            threadPool.execute(new ComandoC1());
                            break;
                        case "c2":
                            System.out.println("Enviando comando c2");
                            threadPool.execute(new ComandoC2(threadPool, socket));
                            break;
                        case "fim":
                            System.out.println("Encerrando servidor");
                            server.finalizarServer();
                            break;
                        default:
                            System.out.println("Comando aleatório");
                            break;
                    }
                }
            }
            Thread.sleep(Duration.ofSeconds(5).toMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
