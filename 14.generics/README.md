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

Referencias...

https://docs.oracle.com/javase/tutorial/java/generics/index.html
https://docs.oracle.com/javase/tutorial/extra/generics/index.html