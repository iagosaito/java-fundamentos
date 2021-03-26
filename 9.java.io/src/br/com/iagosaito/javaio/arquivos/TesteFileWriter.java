package br.com.iagosaito.javaio.arquivos;

import java.io.*;

public class TesteFileWriter {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        FileWriter fileWriter = new FileWriter("lorem2.txt");
        fileWriter.write("Uma linha escrita com File Writer");
        fileWriter.write(System.lineSeparator());

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Esta linha está sendo criada pelo Java\n");
        bufferedWriter.newLine();
        bufferedWriter.write("E esta também!!");

        bufferedWriter.close();
        fileWriter.close();
    }
}
