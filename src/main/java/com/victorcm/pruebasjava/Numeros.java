package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Números
 */
public class Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        int num1, num2;
        
        // Código
        System.out.println("Introduzca un número: ");
        num1 = entrada.nextInt();
        System.out.println("Introduzca otro número: ");
        num2 = entrada.nextInt();
        
        // Operadores
        if (num1 > num2) {
            System.out.printf("%d es mayor que %d", num1, num2);
        }
        else if (num2 > num1) {
            // (num1 < num2)
            System.out.printf("%d es menor que %d", num1, num2);
        }
        else {
            System.out.println("Los dos números son iguales");
        }
    }   
}