## Generics

### Por que utilizar Generics?

- Elimina Casts
- Verificação do tipo em tempo de compilação em vez de tempo de execução.

### Tipos Genéricos

Um *Generic Type* é uma classe ou interface que é parametrizada por tipos. Por exemplo:
    
    public class br.com.iagosaito.generics.Box<T1, T2, ..., Tn>

Os tipos definidos dentro dos <> são chamadas de Type Parameters(Variable).
As *Type Variable* podem ser de qualquer tipo desde que não sejam não-primitivo.

Pode ser uma classe, uma interface, um array ou até outro *Type Variable*.

### Convenção de Type Variables

Os nomes de *Types Variables* mais utilizadas são:
- E - Elemento
- K - Key
- N - Número
- T - Tipo
- V - Value
- S,U,V - Segundo, Terceiro ou Quarto tipos

### Instanciando um tipo genérico

Para instanciar um tipo genérico fazemos da seguinte maneira:

    Box<Integer> integerBox = new Box<Integer>();

Sendo *Integer* o *type parameter* da classe Box. Podemos também criar uma classe com multiplos *type parameters*, ex:

    Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);

### Raw Types

Raw Types é uma classe Generica que tem o seu *Type Argument* omitido, ex:

    Box rawBox = new Box();

Nesse caso, é inferido que você possui um Box que te retornar Object. O problema da utilização de Raw Types é que é 
impossível realizar checkagem de tipo usando raw types em tempo de compilação, apenas em tempo de execução.

### Métodos Genéricos


Referencias...

https://docs.oracle.com/javase/tutorial/java/generics/index.html
https://docs.oracle.com/javase/tutorial/extra/generics/index.html