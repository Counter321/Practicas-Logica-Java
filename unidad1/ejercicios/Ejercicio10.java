package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad del producto que quiere comprar: ");
        int cantidad = sc.nextInt();
        System.out.println("El precio total de la compra es: " + precio*cantidad + "€");

    }
}
