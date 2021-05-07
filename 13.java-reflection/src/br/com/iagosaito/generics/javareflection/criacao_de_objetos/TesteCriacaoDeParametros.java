package br.com.iagosaito.generics.javareflection.criacao_de_objetos;

import br.com.iagosaito.generics.javareflection.Pessoa;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteCriacaoDeParametros {

    public static void main(String[] args) throws Exception {

        final Class<Pessoa> pessoaClass = Pessoa.class;

        final Method[] methods = pessoaClass.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);

        final Method method = Arrays.stream(methods)
                .filter(m -> m.getParameterCount() > 0)
                .findAny()
                .get();

        final Parameter[] parameters = method.getParameters();

        System.out.println();
        System.out.println(method);
        Arrays.stream(parameters).forEach(parameter -> System.out.println(parameter.isNamePresent()));
        Arrays.stream(parameters).forEach(System.out::println);

        final List<Parameter> collect = Arrays.stream(methods)
                .flatMap(met -> Arrays.stream(met.getParameters()))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
