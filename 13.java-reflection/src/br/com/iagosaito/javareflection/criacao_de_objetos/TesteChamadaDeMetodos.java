package br.com.iagosaito.javareflection.criacao_de_objetos;

import br.com.iagosaito.javareflection.Jogador;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TesteChamadaDeMetodos {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        final Class<Jogador> jogadorClass = Jogador.class;

        // Métodos públicos da classe e das subclasses
        Arrays.stream(jogadorClass.getMethods()).forEach(System.out::println);

        System.out.println();

        // Métodos públicos e privados apenas da classe
        Arrays.stream(jogadorClass.getDeclaredMethods()).forEach(System.out::println);

        System.out.println();

        final Constructor<Jogador> jogadorClassConstructor = jogadorClass.getConstructor();
        jogadorClassConstructor.setAccessible(true);

        final Jogador jogador = jogadorClassConstructor.newInstance();

        // Invoca o método privado adicionarGols() passando 100 gols como argumento.
        final Method adicionarGolsMethod = jogadorClass.getDeclaredMethod("adicionarGols", int.class);
        adicionarGolsMethod.setAccessible(Boolean.TRUE);
        adicionarGolsMethod.invoke(jogador, 100);

        // Invoca o método público getGolsMarcados()
        final Method getGolsMarcadosMethod = jogadorClass.getMethod("getGolsMarcados");
        System.out.println("Gols Marcados..." + getGolsMarcadosMethod.invoke(jogador));

    }
}
