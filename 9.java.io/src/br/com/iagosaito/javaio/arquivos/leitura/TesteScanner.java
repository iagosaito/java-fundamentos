package br.com.iagosaito.javaio.arquivos.leitura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("jogadores.csv"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
