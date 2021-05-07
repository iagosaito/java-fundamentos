package br.com.iagosaito.generics.javaio.arquivos.escrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TesteTmpFile {

    public static void main(String[] args) throws IOException {

        final Path testes = Files.createTempFile("TMP_FILE", null);

        System.out.println(testes.toString());

    }
}
