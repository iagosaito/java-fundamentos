package br.com.iagosaito.threads.api_concurrency;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Client {

    public static void main(String[] args) throws Exception {

        final Socket socket = new Socket("localhost", 12345);

        System.out.println("Conectando no servidor...");

        final Thread transmissorDeMensagensThread = transmissorDeMensagens(socket);
        final Thread recebedorMensagensThread = recebedorMensagens(socket);

        transmissorDeMensagensThread.start();
        recebedorMensagensThread.start();

        transmissorDeMensagensThread.join();

        socket.close();
    }

    private static Thread transmissorDeMensagens(Socket socket) {
        return new Thread(() -> {
            try (OutputStream outputStream = socket.getOutputStream()) {
                Scanner scanner = new Scanner(System.in);

                while (scanner.hasNextLine()) {
                    final String command = scanner.nextLine();

                    if (command.equals("")) {
                        break;
                    }

                    outputStream.write(command.getBytes(StandardCharsets.UTF_8));
                    outputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
                    outputStream.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static Thread recebedorMensagens(Socket socket) {
        return new Thread(() -> {
            System.out.println("Recebendo respostas do Servidor...");
            try (Scanner scannerServer = new Scanner(socket.getInputStream())) {
                while (scannerServer.hasNextLine()) {
                    System.out.println("Servidor: " + scannerServer.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
