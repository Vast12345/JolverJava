package com.dia4;

class Animal {
    String nombre;

    // Constructor de la clase base
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    String raza;

    // Constructor de la clase derivida
    public Perro(String nombre, String raza) {
        super(nombre); // Invocacion del constructor de la clase base
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    public void mostrarSonidos() {
        super.hacerSonido(); // Llama al metodo de la clase base
        hacerSonido(); // Llama al metodo de la clase derivada
    }
}

public class Abstraccion {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Labrador");
        System.out.println(perro.nombre); // Salida: Max
        System.out.println(perro.raza); // Salida: Labrador
        //----------------------
        perro.mostrarSonidos();
    }
}
