package br.com.iagosaito.javareflection;

import java.lang.reflect.InvocationTargetException;

public class TratadorDeRequisicoes {

    private static final String PACOTE_BASE = "br.com.iagosaito.javareflection";

    static void executa(final String url) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Request request = new Request(url);

        final Object controller = new Reflexao()
                .refletirClasse(PACOTE_BASE, request.getRecurso())
                .getConstrutorPadrao()
                .invocar();

        System.out.println(controller instanceof PessoaController);
    }
}
