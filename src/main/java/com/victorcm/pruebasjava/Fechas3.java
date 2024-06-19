package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Fechas 3
 */
public class Fechas3 {
    public static void main(String[] args) {
        // Importación
        Scanner entrada = new Scanner(System.in);
        // Variables
        String fecha, mes_nombre;
        int dia, mes, año, max_dias;
        
        // Código
        System.out.println("Introduce una fecha (DD/MM/AAAA): ");
        fecha = entrada.nextLine();
        if (fecha.length() == 10 && fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {
            dia = Integer.parseInt(fecha.substring(0, 2));
            mes = Integer.parseInt(fecha.substring(3, 5));
            año = Integer.parseInt(fecha.substring(10));
            
            switch (mes) {
                default:
                    System.out.println("El mes tiene que estar entre 1 y 12");
                case 1:
                    mes_nombre = "enero";
                    max_dias = 31;
                    break;
                case 2:
                    mes_nombre = "febrero";
                    if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                        max_dias = 29;
                    }
                    else {
                        max_dias = 28;
                    }
                    break;
                case 3:
                    mes_nombre = "marzo";
                    max_dias = 31;
                    break;
                case 4:
                    mes_nombre = "abril";
                    max_dias = 30;
                    break;
                case 5:
                    mes_nombre = "mayo";
                    max_dias = 31;
                    break;
                case 6:
                    mes_nombre = "junio";
                    max_dias = 30;
                    break;
                case 7:
                    mes_nombre = "julio";
                    max_dias = 31;
                    break;
                case 8:
                    mes_nombre = "agosto";
                    max_dias = 31;
                    break;
                case 9:
                    mes_nombre = "septiembre";
                    max_dias = 30;
                    break;
                case 10:
                    mes_nombre = "octubre";
                    max_dias = 31;
                    break;
                case 11:
                    mes_nombre = "noviembre";
                    max_dias = 30;
                    break;
                case 12:
                    mes_nombre = "diciembre";
                    max_dias = 31;
                    break;
            }
            if (dia > max_dias) {
                System.out.printf("El día tiene que estar entre 1 y %d", max_dias);
            }
            System.out.printf("Fecha confirmada: %d/%d/%d\n", dia, mes, año);
            System.out.printf("%d de %s de %d", dia, mes_nombre, año);
        }
        else {
            System.out.println("Formato de fecha incorrecto. Tiene que ser DD/MM/AAAA");
        }
    }
    
}
