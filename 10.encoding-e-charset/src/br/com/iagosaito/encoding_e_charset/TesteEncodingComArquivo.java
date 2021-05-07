package br.com.iagosaito.encoding_e_charset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TesteEncodingComArquivo {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("lorem.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.US_ASCII);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();

    }

}