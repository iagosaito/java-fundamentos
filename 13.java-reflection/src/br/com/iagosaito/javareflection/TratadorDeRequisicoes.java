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

//        final Class<?> controllerClass = Class.forName(PACOTE_BASE + "." + request.getRecurso() + "Controller");
//        final Constructor<?> constructorController = controllerClass.getConstructor();
//
//        final Object controller = constructorController.newInstance();

        System.out.println(controller instanceof PessoaController);
    }
}
