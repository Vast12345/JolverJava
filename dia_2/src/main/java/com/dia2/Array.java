package com.dia2;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Backend Java");
        list.add(0, "Fundamentos"); // Sets the first element (0) to be "Fundamentos"
        //System.out.println(list);
        //----------------------------
        String elemento = list.get(0);
        list.set(0, "Programacion web");
        //-----------------
        //----------------
        String eliminado = list.remove(1);
        //---------------------------
        list.add("Pasteleria");
        boolean result = list.remove("Pasteleria");
        //---------------------------
        System.out.println(elemento);
        System.out.println(list);
        System.out.println(eliminado);
        System.out.println(result);
        // list.clear();
    }
}
