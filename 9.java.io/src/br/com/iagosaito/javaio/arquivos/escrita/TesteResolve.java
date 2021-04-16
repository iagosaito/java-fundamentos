package br.com.iagosaito.javaio.arquivos.escrita;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteResolve {

    public static void main(String[] args) {

        String bucket = "bank-slc-dev";
        String key = "BANK-CIP-DOMICILIO/LIQUIDATION-RETURN/DEV/IN/teste.txt";

        System.out.println(getS3Path(bucket, key));

    }

    public static Path getS3Path(String bucket, String key) {
        Path path = FileSystems.getDefault().getPath("s3://" + bucket);
        return key != null ? path.resolve(key) : path;
    }
}
