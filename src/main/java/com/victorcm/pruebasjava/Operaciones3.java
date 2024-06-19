package com.victorcm.pruebasjava;
import java.util.Scanner;
/**
 * @author Víctor
 * Operaciones 3
 */
public class Operaciones3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables
        double consumo, litros, total;
        int distancia;
        
        // Código
        System.out.println("Introduce una distancia: ");
        distancia = entrada.nextInt();
        System.out.println("Introduce los litros que consume tu coche cada 100 km: ");
        consumo = entrada.nextDouble();
        
        // Operaciones
        litros = consumo * distancia;
        total = litros / 100;
        
        System.out.printf("Tienes que recorrer %d km y tu coche consume %.1f l por cada 100 km, en total consumirías %.2f litros", distancia, consumo, total);
    }
    
}
