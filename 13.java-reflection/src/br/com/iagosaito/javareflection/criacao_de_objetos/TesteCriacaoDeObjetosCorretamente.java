package br.com.iagosaito.javareflection.criacao_de_objetos;

import br.com.iagosaito.javareflection.Pessoa;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteCriacaoDeObjetosCorretamente {

    public static void main(String[] args) throws Exception {
        final Class<Pessoa> pessoaClass = Pessoa.class;
        final Constructor<Pessoa> constructor = pessoaClass.getConstructor();
        System.out.println(constructor);
        final Pessoa pessoa = constructor.newInstance();
        System.out.println(pessoa);

        final Constructor<Pessoa> privateConstructor = pessoaClass.getDeclaredConstructor(String.class);
        System.out.println(privateConstructor);
        privateConstructor.setAccessible(Boolean.TRUE);
        final Pessoa pessoa1 = privateConstructor.newInstance("Iago");
        System.out.println(pessoa1);

        final Constructor<?>[] declaredConstructors = pessoaClass.getDeclaredConstructors();
        final List<Integer> collect = Arrays.stream(declaredConstructors)
                .map(Constructor::getParameterCount)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
