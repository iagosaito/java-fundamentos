package br.com.iagosaito.javareflection.criacao_de_objetos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TesteCriacaoDeAnotacoes {

    public static void main(String[] args) {

        final Class<Pais> paisClass = Pais.class;
        final Anotacao anotacao = paisClass.getDeclaredAnnotation(Anotacao.class);
        System.out.println(anotacao.value());

    }

}

@Anotacao("pais")
class Pais {

    private String capital;
    private int populacao;

}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@interface Anotacao {
    public String value();
}


