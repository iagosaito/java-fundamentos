package br.com.iagosaito.threads.api_concurrency;

import java.net.Socket;
import java.time.Duration;
import java.util.Scanner;

class DelegadorDeTarefas implements Runnable {

    private final Socket socket;
    private final Server server;

    public DelegadorDeTarefas(final Socket socket, Server server) {
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
                            break;
                        case "c2":
                            System.out.println("Enviando comando c2");
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
