package com.jolverjava;

import java.util.Scanner;
import java.text.MessageFormat;
public class Loops {
    public static void main(String[] args) {
        int valor = 0;
        int acu = 0;
        int nrosInv = 0;
        int nrosVal = 0;
        try (Scanner sc = new Scanner(System.in)) {
            /*while (valor >= 0) {
                System.out.println("Ingrese un valor mayor a cero(0): ");
                valor = sc.nextInt();
                sc.nextLine();
                acu += valor;
            }
            
            do {
            System.out.println("Ingrese un valor mayor a cero(0): ");
                valor = sc.nextInt();
                sc.nextLine();
                if(valor < 0) break;
                acu += valor;
             } while(valor >= 0);
            */
            for(int i=0; i<=3; i++){
                System.out.println("Ingrese un valor mayor a cero(0)");
                valor = sc.nextInt();
                sc.nextLine();
                if (valor < 0) {
                    nrosInv++;
                    continue;
                }
                nrosVal++;
                acu += valor;
            }
        }
        System.out.println(MessageFormat.format("La suma de los numero ingresados = {0} y se contaron {1} numeros negativos y {2} numeros positivos", acu, nrosInv, nrosVal));
    }
}
