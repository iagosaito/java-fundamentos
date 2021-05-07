package br.com.iagosaito.javaio.arquivos.leitura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("jogadores.csv"));

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            System.out.println(line);
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");

            while (lineScanner.hasNext()) {
                System.out.println(lineScanner.next().trim());
            }

        }
    }
}
