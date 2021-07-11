package br.com.iagosaito.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteThreadBuscaEmArquivos {

    public static void main(String[] args) throws FileNotFoundException {
        final String palavraDeBusca = "A";

        final Thread th1 = new Thread(new BuscadorArquivo("assinaturas1.txt", palavraDeBusca));
        final Thread th2 = new Thread(new BuscadorArquivo("assinaturas2.txt", palavraDeBusca));
        final Thread th3 = new Thread(new BuscadorArquivo("autores.txt", palavraDeBusca));

        /*
            A ordem de execução não é garantida com Threads.
         */
        th1.start();
        th2.start();
        th3.start();
    }
}

class BuscadorArquivo implements Runnable {

    private final String filePath;
    private final String palavraDeBusca;

    public BuscadorArquivo(String filePath, String palavraDeBusca) {
        this.filePath = filePath;
        this.palavraDeBusca = palavraDeBusca;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            int numeroLinha = 1;

            while(scanner.hasNextLine()) {
                final String linha = scanner.nextLine();
                if (linha.contains(palavraDeBusca)) {
                    System.out.printf("%s -- Arquivo: %s - Palavra: %s - Linha número: %d%n", linha, filePath,
                            palavraDeBusca, numeroLinha);
                }

                numeroLinha++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
