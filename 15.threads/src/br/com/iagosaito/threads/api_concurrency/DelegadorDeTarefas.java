package br.com.iagosaito.threads.api_concurrency;

import java.net.Socket;
import java.time.Duration;
import java.util.Scanner;

class DelegadorDeTarefas implements Runnable {

    private final Socket socket;

    public DelegadorDeTarefas(final Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("Cliente conectado na porta: " + socket.getPort());
        try {
            try (Scanner scanner = new Scanner(socket.getInputStream())) {

                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            }
            Thread.sleep(Duration.ofSeconds(20).toMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
