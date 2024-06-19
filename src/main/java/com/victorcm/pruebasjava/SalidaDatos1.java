package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Salida de datos 1
 */
public class SalidaDatos1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        String nombre, apellido1, apellido2;
        double nota;
        
        // Código
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Apellido 1: ");
        apellido1 = entrada.nextLine();
        System.out.println("Apellido 2: ");
        apellido2 = entrada.nextLine();
        System.out.println("Nota: ");
        nota = entrada.nextDouble();
        
        // Condiciones
        if (nota >= 5) {
            final boolean aprobado = true;
            System.out.printf("Nombre: %s\nApellidos: %s %s\nNota: %.2f\n¿Aprobado? %b", nombre, apellido1, apellido2, nota, aprobado);
        }
        else {
            final boolean aprobado = false;
            System.out.printf("Nombre: %s\nApellidos: %s %s\nNota: %.2f\n¿Aprobado? %b", nombre, apellido1, apellido2, nota, aprobado);
        }
    } 
}