package unidad2.condicionales.ejercicios.condicionaldoble;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce un segundo numero: ");
        int numero2 = sc.nextInt();
        if (numero1>numero2) {
            System.out.println("El numero 1 es mayor que numero 2");
    } else   {
            System.out.println("El numero 2 es mayor que numero 1");}
    }
}
