package com.victorcm.pruebasjava;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Víctor
 */
public class Fechas4 {
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        Scanner entrada = new Scanner(System.in);
        // Variables
        String cumple;
        int dia, mes, año, 
                dia_cumple, mes_cumple, año_nacimiento, 
                dias_año = 0, edad, dias_mes = 0, 
                a = 0, b = 0, c = 0, total, meses_a, meses_b, años;
        // Código
        System.out.println("Introduce tu cumpleaños (dd/mm/aaaa): ");
        cumple = entrada.nextLine();

        // Calendario
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH) + 1;
        año = fecha.get(Calendar.YEAR);

        // Conversión
        if (cumple.length() == 10 && cumple.charAt(2) == '/' && cumple.charAt(5) == '/') {
            dia_cumple = Integer.parseInt(cumple.substring(0, 1));
            mes_cumple = Integer.parseInt(cumple.substring(3, 4));
            año_nacimiento = Integer.parseInt(cumple.substring(6, 10));
            if (dia_cumple == dia && mes_cumple == mes) {
                edad = año - año_nacimiento;
                System.out.println("¡Feliz cumpleaños! Hoy cumples " + edad + " años.");
            } else {
                System.out.println("Hoy no es tu cumpleaños.\n");
                // Días máximos por mes
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12 ->
                        dias_mes = 31;
                    case 4, 6, 9, 11 ->
                        dias_mes = 30;
                    case 2 -> {
                        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                            dias_mes = 29;
                        } else {
                            dias_mes = 28;
                        }
                    }
                }
                // Operaciones
                // Días hasta el 31/12
                if (dia <= dias_mes) {
                    a = dias_mes - dia;
                } else if (dia <= dias_mes || mes <= 12){
                    meses_a = 12 - mes;
                    a = dias_mes - dia;
                }
                else if (dia == 31 && mes == 12) {
                    a = 0;
                }
                // Años hasta el actual
                años = año - año_nacimiento;
                // Cálculo de días
                // Años bisiestos
                b = dias_año * años;
//                if (año % 4 == 0 || (año != 100 && año % 400 == 0)) {
//                    dias_año = 366;
//                }
//                else {
//                    dias_año = 365;
//                }
                // Dias desde el 01/01
                if (dia <= 31) {
                    c = 31 - dia; 
                } else if (dia <= 31 || mes <= 12){
                    meses_b = 12 - mes;
                    c = 31 - dia;
                }
                else if (dia == 01 && mes == 01) {
                    c = 0;
                }
                // Suma total
                total = a + b + c;
                System.out.println("Días que quedan para tu próximo cumpleaños: " + total);
            }
        } else {
            System.out.println("Formato de fecha inválido. Tiene que ser dd/mm/aaaa");
        }
    }
}