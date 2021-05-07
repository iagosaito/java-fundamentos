package br.com.iagosaito.generics.javareflection.inversao_de_controle_e_injecao_de_dependencias;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ContainerIoc {

    public Object gerarInstancia(Class<?> classe) {
        final Constructor<?>[] constructors = classe.getDeclaredConstructors();

        final Optional<Constructor<?>> construtorPadrao = Arrays.stream(constructors)
                .filter(constructor -> constructor.getParameterCount() == 0)
                .findAny();

        if (construtorPadrao.isPresent()) {
            try {
                return construtorPadrao.get().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException("Erro ao construir com construtor padrão");
            }
        } else {
            final Constructor<?> constructor = constructors[0];

            final List<Object> parameters = new ArrayList<>();
            for (Parameter parameter : constructor.getParameters()) {
                Object o = gerarInstancia(parameter.getType());
                parameters.add(o);
            }

            try {
                return constructor.newInstance(parameters.toArray());
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        throw new RuntimeException("Erro ao construir uma instância!");
    }
}
