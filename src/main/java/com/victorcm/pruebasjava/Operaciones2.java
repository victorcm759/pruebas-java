package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Operaciones 2
 */
public class Operaciones2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        int año;
        
        // Código
        System.out.println("Introduzca un año: ");
        año = entrada.nextInt();
        
        // Operaciones
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            System.out.println("Es un año bisiesto");
        }
        else {
            System.out.println("No es un año bisiesto");
        }
    }
}