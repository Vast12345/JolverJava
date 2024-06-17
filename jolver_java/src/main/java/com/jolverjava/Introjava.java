package com.jolverjava;

import java.text.MessageFormat;
import java.util.Scanner;

public class Introjava {

    public static void main(String[] args) {
        // Comentario linea
        /*
        Comentario bloque
        */
        int edad;
        @SuppressWarnings("unused")
        float precio = 23.5F;
        String nombre;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            nombre = sc.nextLine();
            sc.close();
        }
        
        System.out.println(nombre+" tiene "+edad+" años");
        System.out.println(MessageFormat.format("{0} tiene {1} años", nombre, edad));
    }
}
