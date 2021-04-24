package br.com.iagosaito.javareflection;

public class Request {

    private String recurso;

    public Request(final String url) {
        final String[] recursoMaisMetodo = url.substring(1).split("/");
        this.recurso = Character.toUpperCase(recursoMaisMetodo[0].charAt(0)) + recursoMaisMetodo[0].substring(1);
    }

    public String getRecurso() {
        return recurso;
    }
}
