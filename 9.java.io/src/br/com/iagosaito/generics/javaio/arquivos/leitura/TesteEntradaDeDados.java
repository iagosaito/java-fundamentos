package br.com.iagosaito.generics.javaio.arquivos.leitura;

import java.io.*;

public class TesteEntradaDeDados {

    public static void main(String[] args) throws IOException {

        File file = new File("lorem.txt");

        // Fluxo de entrada de um arquivo
        FileInputStream fileInputStream = new FileInputStream(file);

        // Ponte para fluxo de bytes para fluxo de caracteres.
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        // Lê caracteres a partir de um fluxo de caracteres
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
