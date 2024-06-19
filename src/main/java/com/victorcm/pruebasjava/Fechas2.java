package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Fechas 2
 */
public class Fechas2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        int dia, mes, año, max_dias = 0;
        
        // Código
        System.out.println("Introduce un día (1 - 31): ");
        dia = entrada.nextInt();
        System.out.println("Introduce un mes (1 - 12): ");
        mes = entrada.nextInt();
        System.out.println("Introduce un año: ");
        año = entrada.nextInt();
        
        // Verificación de fecha
        if (dia >= 1 && dia <= 31) {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    max_dias = 31;
                case 4, 6, 9, 11:
                    max_dias = 30;
                case 2:
                    if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                        max_dias = 29;
                    }
                    else {
                        max_dias = 28;
                    }
                default: 
                    System.out.println("Fecha incorrecta\nEl mes tiene que estar entre 1 y 12");
            }
        }
        else {
            System.out.println("Fecha incorrecta\nEl día tiene que estar entre 1 y 31");
        }
        System.out.printf("Fecha elegida: %02d/%02d/%4d", dia, mes, año);
    }   
}