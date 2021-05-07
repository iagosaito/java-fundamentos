package br.com.iagosaito.encoding_e_charset;

import java.io.UnsupportedEncodingException;

public class TestEncodingCharset {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String[] codes = { "ISO-8859-1", "UTF-8", "UTF-16" };
        String palavra = "ç";

        for (String encoding : codes) {
            byte[] b = palavra.getBytes(encoding);
            System.out.printf("%10s\t%d\t", encoding, b.length);
            for (byte value : b) {
                String hex = Integer.toHexString((value + 256) % 256);
                if (hex.length() == 1)
                    hex = "0" + hex;
                System.out.print(hex);
            }
            System.out.println();
        }

    }
}
