package br.com.iagosaito.serializacao_e_deserializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteJogadorDeserializacao {

    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializacao.bin"));

        Jogador jogador = (Jogador) ois.readObject();

        System.out.println(jogador);
    }
}
