package br.com.iagosaito.threads.api_concurrency;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Client {

    public static void main(String[] args) throws Exception {

        final Socket socket = new Socket("localhost", 12345);

        System.out.println("Conectando no servidor...");

        final OutputStream outputStream = socket.getOutputStream();
        outputStream.write("q1".getBytes(StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        outputStream.close();
        socket.close();

    }
}
