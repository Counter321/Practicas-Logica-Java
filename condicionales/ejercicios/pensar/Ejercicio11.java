package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el aforo máximo del local?");
        int aforo = sc.nextInt();
        System.out.println("Dime el precio por la entrada:");
        double precio = sc.nextDouble();
        System.out.println("Dime el numero de entradas vendidas");
        int entrada = sc.nextInt();
        double veinte = aforo*0.20; //el 20% del aforo q se tiene q superar//
        double cincuenta = aforo*0.50; /*el 50% del aforo q se tiene q superar en caso sea menor a 50 pero mayor q el
        20 por cineto*/


        if(entrada>=cincuenta ) {
            System.out.println("El dinero recaudado es: " + (entrada*precio)+"€");
        }
        else if(veinte<=entrada && entrada<=cincuenta) {
            double rebajat = precio-(precio*0.25);
            System.out.println("El dinero recaudado es:"+(rebajat*entrada)+"€");
        } else if (entrada<=20) {

            System.out.println("Se cancela el concierto y la recaudación es de 0 euros");
        }

    }
}
/*Ejercicio 11.- Programa que calcule el dinero recaudado en un concierto. La aplicación
solicitará el aforo máximo del local, el precio por entrada (todas las entradas cuestan lo mismo)
y el número(cantidad) de entradas vendidas. Hay que tener en cuenta que si el número de
entradas vendidas no supera el 20% del aforo, se cancela el concierto por lo que la
recaudación es de 0 euros. Si el número de entradas vendidas no supera el 50% del aforo del
local, se realiza una rebaja del 25% del precio de la entrada.*/
