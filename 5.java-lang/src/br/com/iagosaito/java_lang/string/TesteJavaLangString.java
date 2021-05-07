package br.com.iagosaito.java_lang.string;

/*
    As classes do pacote java.lang são especiais porque são as únicas que não precisam ser importadas.
    String e System são exemplos de classes que fazem parte do pacote lang
 */
public class TesteJavaLangString {

    public static void main(String[] args) {

        /*
            Object Literal = Sintaxe especial para criação de objetos sem utilizar o
            operador 'new'.
         */
        String novaString = "Aprendendo sobre String";

        /*
            É possível declarar uma variável como CharSequence.

            CharSequence é uma interface implementada pela própria classe String.
         */
        CharSequence mesmaString = "Aprendendo sobre String";
    }

}
