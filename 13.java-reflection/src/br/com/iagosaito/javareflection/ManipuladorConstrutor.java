package br.com.iagosaito.javareflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorConstrutor {

    private Constructor<?> constructor;

    public ManipuladorConstrutor(Constructor<?> constructor) {
        this.constructor = constructor;
    }

    public Object invocar() {
        try {
            return constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao construir a partir do construtor", e);
        }
    }
}
