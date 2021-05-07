package br.com.iagosaito.generics.javaio.teclado_e_console;

import java.io.*;

public class TesteEntradaSaidaConsole {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String line = bufferedReader.readLine();

        while (line != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
