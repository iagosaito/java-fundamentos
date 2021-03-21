# Modificadores de acesso

Existem 4 tipos de modificadores de acesso principais na linguagem Java. Segue a ordem dos mais restritivos para os 
menos restritivos: *private*, *default* (*package-private*), *protected* e *public*.

Vamos analisar as características dos 4 modificadores de acesso.

### Private
    
- Só são visíveis na mesmo classe em foram declarados.
- O modificador *private* pode ser utilizado em atributos, métodos e construtores, mas NÃO existem classes privadas.

### Default (package-private)

- São visíveis apenas para as classes do mesmo pacote, por isso o nome *package-private* (privado no pacote).
- Podem ser utilizados em atributos, métodos, construtores, classes e interfaces.
- Para declarar um atributo, método, construtor ou classe como default basta declarar sem modificador de acesso.

### Protected

- São visíveis na classe que foram declarados e nas sub-classes, ou seja, em todas as classes que herdam a classe 
principal. Atributos do tipo protected também são visíveis a todas as classes do mesmo pacote.
- Podem ser utilizados em atributos, métodos e construtores, mas NÃO existem classes protected.

### Public

- O mais "liberal" dos modificadores de acesso. São visíveis em todas as classes.
- Podem ser utilizadas em atributos, métodos, construtores, classes e interfaces.

    
