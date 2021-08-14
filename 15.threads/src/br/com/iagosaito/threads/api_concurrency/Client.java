package br.com.iagosaito.threads.api_concurrency;

import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {

        final Socket socket = new Socket("localhost", 12345);
        socket.close();

    }
}
