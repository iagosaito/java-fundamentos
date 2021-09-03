package br.com.iagosaito.threads.api_concurrency;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Server {

    private final ServerSocket serverSocket;
    private final ExecutorService threadPool;
    private boolean estaRodando;

    public Server() throws IOException {
        System.out.println("----- Iniciando servidor -------");
        this.serverSocket = new ServerSocket(12345);
        this.threadPool = Executors.newCachedThreadPool();
        this.estaRodando = true;
    }

    public void executarServidor() throws IOException {
        while (this.estaRodando) {
            System.out.println("Rodando...");
            final Socket socket = this.serverSocket.accept();
            System.out.println("Socket: " + socket.toString());
            this.threadPool.execute(new DelegadorDeTarefas(socket, this));
        }
    }

    public void finalizarServer() throws IOException {
        this.estaRodando = false;
        this.serverSocket.close();
        this.threadPool.shutdown();
    }

    public static void main(String[] args) throws Exception {

        Server server = new Server();

        server.executarServidor();
        server.finalizarServer();
    }

}
