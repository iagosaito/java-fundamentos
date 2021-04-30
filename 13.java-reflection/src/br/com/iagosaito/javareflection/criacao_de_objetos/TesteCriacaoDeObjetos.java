package br.com.iagosaito.javareflection.criacao_de_objetos;

import br.com.iagosaito.javareflection.Pessoa;

public class TesteCriacaoDeObjetos {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        final Class<Pessoa> pessoaClass1 = Pessoa.class;
        final Pessoa objetoPessoa1 = pessoaClass1.newInstance();

        Pessoa pessoa2 = new Pessoa("Messi", 30);
        final Class<? extends Pessoa> jogadorClass2 = pessoa2.getClass();
        final Pessoa objetoPessoa2 = jogadorClass2.newInstance();

        final Class<?> pessoaClasse3 = Class.forName("br.com.iagosaito.javareflection.Pessoa");
        final Object objetoPessoa3 = pessoaClasse3.newInstance();
        System.out.println(objetoPessoa3 instanceof Pessoa);
    }
}
