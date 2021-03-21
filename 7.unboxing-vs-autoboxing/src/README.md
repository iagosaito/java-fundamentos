#Autoboxing vs Unboxing


## Autoboxing

Em Java nós podemos representar todo os tipos primitivos em objetos utilizando classes especiais. Essas classes 
especiais possuem o nome de classes *Wrapper*.

O termino Autoboxing é utilizado quando convertemos um primitivo para o seu respectivo objeto da classe *Wrapper*. O
compilador Java faz isso automaticamente, por exemplo:

    Integer i = 10;

Nesse caso, o valor 10 representa um número literal do tipo *int*. O Java "automaticamente" faz um "boxing" desse
elemento para a referência de um objeto de sua classe *Wrapper* que é Integer.

Internamente seria como se o Java fizesse o seguinte:

    Integer i = Integer.valueOf(10);

Outro exemplo...

    public void funcaoQualquer(Integer numero) {
        System.out.println("Faz qualquer coisa");
    }

    funcaoQualquer(100);

Nesse caso o autoboxing ocorre no argumento 100 passado para a função que recebe um Integer.

## Unboxing

Unboxing ocorre quando convertemos um objeto de uma classe *Wrapper* num tipo primitivo. Resumindo, funciona exatamente
de forma oposta ao Autoboxing.

Exemplo:

    Integer i = new Integer(10);
    int num = i;

Neste caso a variável de referência i foi convertida automaticamente para a variável primitiva num.