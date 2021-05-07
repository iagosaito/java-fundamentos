package br.com.iagosaito.generics.javareflection.criacao_de_objetos;

import java.lang.reflect.Field;
import java.util.Arrays;

import br.com.iagosaito.generics.javareflection.Pessoa;

public class TesteCriacaoDeAtributos {

    public static void main(String[] args) throws Exception {

        final Class<Pessoa> pessoaClass = Pessoa.class;
        final Pessoa pessoa = pessoaClass.getConstructor().newInstance();
        final Field[] declaredFields = pessoaClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        final Field fieldNome = pessoaClass.getDeclaredField("nome");
        fieldNome.setAccessible(true);
        System.out.println(fieldNome.getName());

        pessoa.setNome("Francisco");
        final Object nomePessoa = fieldNome.get(pessoa);
        System.out.println(nomePessoa);
        System.out.println(fieldNome);
    }
}
