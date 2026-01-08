package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos amigos vienen a la fiesta?");
        int numero = sc.nextInt();
        System.out.println("Escribe el precio de cada refresco");
        double precio = sc.nextDouble();
        System.out.println("El precio para comprar un refresco para todos es:" + precio*numero);



    }
}
