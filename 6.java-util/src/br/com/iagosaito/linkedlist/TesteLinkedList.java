package br.com.iagosaito.linkedlist;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Iago");
        list.add("Yara");
        list.add(1, "Saito");

        System.out.println(list.get(0));
    }
}
