package br.com.iagosaito.javaio.arquivos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestePrintWriter {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("lorem2.txt");

        printWriter.print("Escrevendo num arquivo com PrintWriter");
        printWriter.println();
        printWriter.println();
        printWriter.print("Continuando a escrever...");


        printWriter.close();
    }
}
