package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Salida de datos 2
 */
public class SalidaDatos2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        String nombre, apellido1, apellido2, ciudad, pais;
        int edad;
        
        // Código
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Apellido 1: ");
        apellido1 = entrada.nextLine();
        System.out.println("Apellido 2: ");
        apellido2 = entrada.nextLine();
        System.out.println("Edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer
        System.out.println("Ciudad: ");
        ciudad = entrada.nextLine();
        System.out.println("País: ");
        pais = entrada.nextLine();
        
        // Resultado
        System.out.printf("Nombre: %s\nApellidos: %s %s\nEdad: %d\nCiudad: %s\nPaís: %s", 
                nombre, apellido1, apellido2, edad, ciudad, pais);
    }
}