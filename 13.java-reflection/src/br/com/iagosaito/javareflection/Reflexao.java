package br.com.iagosaito.javareflection;

public class Reflexao {
    public ManipuladorClasse refletirClasse(final String pacoteBase, final String recurso) {

        try {
            final Class<?> classe = Class.forName(pacoteBase + "." + recurso + "Controller");

            return new ManipuladorClasse(classe);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
