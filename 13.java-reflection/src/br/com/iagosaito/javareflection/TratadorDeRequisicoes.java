package br.com.iagosaito.javareflection;

public class TratadorDeRequisicoes {

    private static final String PACOTE_BASE = "br.com.iagosaito.javareflection";

    static void executa(final String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        final String[] recursoMaisMetodo = url.substring(1).split("/");
        final String recurso = Character.toUpperCase(recursoMaisMetodo[0].charAt(0)) + recursoMaisMetodo[0].substring(1);

        final Class<?> controllerClass = Class.forName(PACOTE_BASE + "." + recurso + "Controller");
        final Object controller = controllerClass.newInstance();

        System.out.println(controller instanceof PessoaController);
    }
}
