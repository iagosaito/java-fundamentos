package br.com.iagosaito.generics.javaio.arquivos;

import java.io.*;

public class TesteEntradaSaidaDeDados {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FileOutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String line = bufferedReader.readLine();

        while (line != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
