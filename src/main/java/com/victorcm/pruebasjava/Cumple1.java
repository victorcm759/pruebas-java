package com.victorcm.pruebasjava;
import java.util.Calendar;
import java.util.Scanner;
/**
 * @author Víctor
 * Cumpleaños 1
 */
public class Cumple1 {
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        Scanner entrada = new Scanner (System.in);
        // Variables
        String cumple;
        int dia, mes, dia_cumple, mes_cumple;
        
        // Código
        System.out.println("Introduce tu cumpleaños (dd/mm/aaaa): ");
        cumple = entrada.nextLine();
        
        // Calendario
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH) + 1;
        
        // Conversión
        if (cumple.length() == 5 && cumple.charAt(2) == '/') {
            dia_cumple = Integer.parseInt(cumple.substring(0, 2));
            mes_cumple = Integer.parseInt(cumple.substring(3, 5));
            if (dia_cumple == dia && mes_cumple == mes) {
                System.out.println("¡Feliz cumpleaños!");
            } else {
                System.out.println("Hoy no es tu cumpleaños\n");
            }
        } else {
            System.out.println("Formato de fecha inválido. Tiene que ser dd/mm/aaaa");
        }
    }  
}