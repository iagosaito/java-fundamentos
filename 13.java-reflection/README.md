# Java Reflection e Metaprogramação

Existem tem maneira de criamos um instância de um objeto Class<?>: *.class, getClass() e Class.forName(FQN)*; 

 

    1 -> Class<Pessoa> pessoaClass1 = Pessoa.class;
    
    2 -> Pessoa pessoa2 = new Pessoa("Messi", 30);
         Class<? extends Pessoa> jogadorClass2 = pessoa2.getClass();

    3 -> Class<?> pessoaClasse3 = Class.forName("br.com.iagosaito.javareflection.Pessoa");

Depois que temos o nosso objeto *Class<?>* podemos criar uma instância de um objeto de uma maneira: 

    1 -> Pessoa pessoa = pessoaClass1.newInstance(); // Maneira depreciada

    2 -> Constructor<Pessoa> constructor = pessoaClass.getConstructor();
         Pessoa pessoa = constructor.newInstance(); // Maneira correta

Ao utilizar a classe *Constructor* temos acesso a 4 métodos distindos que nos dão acesso aos construtores privados e
públicos da classe. 

- pessoaClass.getConstructor();
- pessoaClass.getConstructors();
- pessoaClass.getDeclaredConstructors();
- pessoaClass.getDeclaredConstructor();

A diferença entre os métodos *declared* é que por meio deles temos acessos aos construtores privados da classe. Mas
CUIDADO: Para que os métodos privados sejam acessíveis, primeiro é preciso alterar a acessibilidade da classe.