package br.com.iagosaito.javareflection;

import java.lang.reflect.Constructor;

public class ManipuladorClasse {

    private Class<?> classe;

    public ManipuladorClasse(Class<?> classe) {
        this.classe = classe;
    }

    public ManipuladorConstrutor getConstrutorPadrao() {

        try {
            final Constructor<?> constructor = classe.getDeclaredConstructor();

            return new ManipuladorConstrutor(constructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
