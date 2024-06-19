package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Fechas 1
 */
public class Fechas1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variable
        int mes, año, max_dias = 0;
        
        // Código
        System.out.println("Introduce un mes (1 - 12): ");
        mes = entrada.nextInt();
        System.out.println("Introduce un año: ");
        año = entrada.nextInt();
        
        // Decisión
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                max_dias = 31;
                break;
            case 4, 6, 9, 11:
                max_dias = 30;
                break;
            case 2:
                if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                    max_dias = 29;
                }
                else {
                    max_dias = 28;
                }
                break;
        }
        System.out.printf("Mes: %d\nAño: %d\nNúmero de días: %d", mes, año, max_dias);
    }
}