package br.com.iagosaito.threads.api_concurrency;

import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args) throws Exception {

        System.out.println("----- Iniciando servidor -------");
        ServerSocket serverSocket = new ServerSocket(12345);

        while (true) {
            final Socket socket = serverSocket.accept();
            new Thread(new DelegadorDeTarefas(socket)).start();
        }
    }
}
