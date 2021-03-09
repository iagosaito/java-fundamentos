# Como uma pilha de execução da JVM funciona?


A JVM possui uma pilha que armazena os métodos que estão sendo executados. O método do topo da pilha sempre é o que está sendo executado no momento. A pilha também sabe quais os outros métodos que precisarão ser executados, que serão justamente os métodos abaixo do primeiro. 

