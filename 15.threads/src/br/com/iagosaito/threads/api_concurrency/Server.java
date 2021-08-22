package br.com.iagosaito.threads.api_concurrency;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Server {
    public static void main(String[] args) throws Exception {

        System.out.println("----- Iniciando servidor -------");
        ServerSocket serverSocket = new ServerSocket(12345);

        final ExecutorService threadPool = Executors.newCachedThreadPool();
    /*
        final ExecutorService threadPool = Executors.newCachedThreadPool();
        Quantidade fixa de Threads...
     */

        while (true) {
            final Socket socket = serverSocket.accept();
            threadPool.execute(new DelegadorDeTarefas(socket));
        }
    }
}
