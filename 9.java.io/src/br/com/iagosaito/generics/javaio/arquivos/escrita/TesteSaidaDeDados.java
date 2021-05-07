package br.com.iagosaito.generics.javaio.arquivos.escrita;

import java.io.*;

public class TesteSaidaDeDados {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Esta linha está sendo criada pelo Java\n");
        bufferedWriter.newLine();
        bufferedWriter.write("E esta também!!");

        bufferedWriter.close();

    }

}
