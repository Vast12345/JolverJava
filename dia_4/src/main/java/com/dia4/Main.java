package com.dia4;

import java.util.ArrayList;
import java.util.Arrays;

/*
Arrays are basic structures with fast access but fixed size, Lists offer flexibility and are part of Java's Collection Framework with various implementations, and ArrayLists combine the efficiency of arrays with the dynamism of lists, making them a popular choice for many applications.
*/


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Backend");
        list.add(0, "Fundamentos");
        
        list.set(0, "Programacion web");
        boolean contains = list.contains("MySQL");
        System.out.println(contains);
        //-------------
        int index = list.indexOf("Postgres");
        System.out.println(index);
        //--------------
        list.add("MySQL");
        int lastIndex = list.lastIndexOf("MySQL");
        System.out.println(lastIndex);
        //---------------
        Object[] skills = list.toArray();
        System.out.println(Arrays.toString(skills));
        //-----------------------------------
        System.out.println(Arrays.asList("Python"));
        ArrayList<String> otraLista = new ArrayList<>(Arrays.asList("Python", "Pseint"));
        //-----------------------------------
        list.addAll(otraLista);
        System.out.println(list);
        //-----------------------------------
        list.addAll(0, otraLista);
        System.out.println(list);
        //-----------------------------------
        list.removeAll(otraLista);
        System.out.println(list);
        //-----------------------------------
        list.retainAll(Arrays.asList("Python"));
        System.out.println(list);
        //-----------------------------------
    }
}