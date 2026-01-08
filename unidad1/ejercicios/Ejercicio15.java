package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioPalomitas= 5.0;
        System.out.println("Dime el precio de la entrada del cine");
        double precio = sc.nextDouble();
        System.out.println("Dime la cantidad de entradas del cine");
        int cantidad = sc.nextInt();
        System.out.println("El importe de entrada es: " + (cantidad*precio));
        System.out.println("¿Quieres palomitas?");

        String palomitas = sc.next();
        if (palomitas.equalsIgnoreCase("si")) {
            System.out.println("El importa total es:"+(precioPalomitas+(precio*cantidad)));
        }
            else{
            System.out.println("El importa total es:"+(cantidad*precio));


        }
    }
}
