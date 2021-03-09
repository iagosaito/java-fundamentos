# Exceptions em Java

### Características de uma exceção

- Exceções sempre possuem um nome.
- Exceções alteram o fluxo de execução tradicional (ver jvm-stack), caso não sejam tratadas.
- Em Java, múltiplas exceções podem ser tratadas de uma só vez.
- Exceções são como uma bomba que, se não tratadas, eliminam os métodos na pilha um por um. 
- Exceções podem ser lançadas utilizando a palavra reservada *throw*, depois de instanciá-la. Não são todos os objetos 
  que podem ser lançados, 
ou representar uma exceção.
  
### Error vs Exception

A classe error faz parte de uma hierarquia pensada passa os desenvolvedores da máquina virtual Java, geralmente cai na 
pilha de execução quando algo muito grave acontece. Nós, desenvolvedores,
não manipulamos essas classes diretamente, ex: StackOverFlowError. 

As exceptions são utilizadas para alterar o fluxo da nossa aplicação e podem fazer parte das nossas regras de negócio.

### Checked vs Unchecked

As exceções no Java dividem-se em dois tipos: 
- Checked: O desenvolvedor é obrigado a tratar a exceção ou relançá-la. Acontece quando herdamos **diretamente**
  da classe *Exception*.
- Unchecked: Não são obrigadaas a tratar e nem relançar. Acontece quando herdamos da classe *RuntimeException*.

Para mais informações, veja: https://blog.caelum.com.br/lidando-com-exceptions/.