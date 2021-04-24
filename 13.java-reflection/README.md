# Java Reflection e Metaprogramação

Existem tem maneira de criamos um instância de um objeto Class<?>: *.class, getClass() e Class.forName(FQN)*; 

 

    1 -> final Class<Pessoa> pessoaClass1 = Pessoa.class;
    
    2 -> Pessoa pessoa2 = new Pessoa("Messi", 30);
         final Class<? extends Pessoa> jogadorClass2 = pessoa2.getClass();

    3 -> final Class<?> pessoaClasse3 = Class.forName("br.com.iagosaito.javareflection.Pessoa");