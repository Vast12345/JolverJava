package com.dia4;
import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import com.creativecode.hashtable.StaticClass.Variables;

public class Hashtables {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int valueNumber = 0;
        Hashtable <Integer, String> personas = new Hashtable<>();
        Variables.uniqueNumbers = new HashSet<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre: ");;
            personas.put(GenerationUnique(), sc.nextLine());
            //---------------GET--------------------
            System.out.println(personas.get(getLastNumber()));
            //------------containsKey--------------------------------
            System.out.println(personas.containKey(getLastNumber()));
            //--------------size--------------------------------
            System.out.println(personas.size());
            //------------keySet----------------------------
            System.out.println(personas.keySet());
            personas.keySet().forEach( keyValue -> {
                System.out.println(MessageFormat.format("Llave valor : {0}", keyValue));
            });
            //----------------values------------------
            System.out.println(personas.values());
            personas.values().forEach( valueData -> {
                System.out.println(MessageFormat.foramt("Valor : {0}", valueData));
            });
            //--------------------Enumeration-------------------
            Enumeration<Integer> claves = personas.keys();
            while (claves.hasMoreElements()) {
                int clave = clave.nextElement();
                System.out.println("Clave (con Enumeration)" + clave);
            }
        } catch(Exception e) {
            // TODO: handle exception
        }
    }
    public static int GenerationUnique() {
        int randomNumber = 0;
        randomNumber = ThreadLocalRandom.current().nextInt(Variables.max);
        Variables.uniqueNumbers.add(randomNumber);
        return randomNumber;
    }
    public static int getLastNumber() {
        List<Integer> numberList = new ArrayList<>(Variables.uniqueNumbers);
        return numberList.get(numberList.size()-1);
    }
}
