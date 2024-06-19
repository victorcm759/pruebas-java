package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Salida de datos 3
 */
public class SalidaDatos3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        double distancia, velocidad, tiempo;
        
        // Código
        System.out.println("Introduce la distancia: ");
        distancia = entrada.nextDouble();
        System.out.println("Introduce la velocidad (km/h): ");
        velocidad = entrada.nextDouble();
        
        tiempo = distancia/velocidad;
        
        // Resultados
        System.out.printf("Distancia: %.2f km\nVelocidad: %.2f km/h\nTiempo: %.1f h\n", distancia, velocidad, tiempo);
        
        if (tiempo > 24) {
            final boolean dias = true;
            System.out.printf("¿Tardó más de un día? %b", dias);
        }
        else {
            final boolean dias = false;
            System.out.printf("¿Tardó más de un día? %b", dias);
        }
    }
}