package com.dia2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arrayloops {
    public static void main(String[] args) {
        ArrayList<Estudiante> listStudents = new ArrayList<>();
        Estudiante student = new Estudiante();
        //--------------------------
        while (JOptionPane.showConfirmDialog(null, "Quiere Agregar un estudiante?", "informacion",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Ingrese el nombre del estudiante");
                student.setNombre(sc.nextLine());
                System.out.println("Ingrese el Apellido del estudiante");
                student.setApellido(sc.nextLine());
                System.out.println("Ingrese la edad del estudiante");
                student.setEdad(sc.nextInt());
                listStudents.add(student);
            } 
        }
        for(String item : listStudents) {
            System.out.println(item.getNombre()); // Unfinished
        }
    }
}
