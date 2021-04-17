# Introdução ao Java 8

## Features abordadas
#### - Default e Static Methods em Interfaces.

### *Default e Static Methods*

*Default Methods* são métodos que possuem implementação dentro de uma interface. Quando queremos adicionar 
um método a uma interface sem obrigar que todas as implementações daquela interfacem implementem o novo método, fazemos
uso do dos *default methods*. 

*Static Methods* em interfaces funcionam de maneira igual aos métodos estáticos de uma classe. Eles estão atrelados a 
interface e não as classes que implementam aquela interface. É possível invocar métodos estáticos dentro de *default 
methods* em uma interface.

https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
https://www.baeldung.com/java-static-default-methods

### Lambda

Sintaxe especial que fornece uma implementação a interfaces funcionais.

    jogadores.sort(new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
        }
    });

Em vez de criar uma função anônima como definido anteriormente, podemos substituir isso por funções lambda.

    jogadores.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

As classes anônimas e as funções lambda são compiladas de uma forma diferente dentro da memória do Java, mas de forma
prática, podemos substiuir a implementação sem problemas.