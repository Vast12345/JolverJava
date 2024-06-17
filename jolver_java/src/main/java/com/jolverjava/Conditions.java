package com.jolverjava;

import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Persona mayor de edad");
        }
    }
}
