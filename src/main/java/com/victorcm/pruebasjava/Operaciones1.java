package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Operaciones 1
 */
public class Operaciones1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        int numero;
        
        // Código
        System.out.println("Introduzca un número: ");
        numero = entrada.nextInt();
        
        // Operación
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
    }
    
}
