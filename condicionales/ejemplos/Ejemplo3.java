package unidad2.condicionales.ejemplos;

import java.util.Scanner;
/**
 * Ejemplo de de estructura condicional  IF-ELSE
 */
public class Ejemplo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce num1: ");
        int num1 = sc.nextInt();

        if ((num1 % 4)==0) {
            System.out.println("El número es divisible por 4");
        } else {
            System.out.println("El número no es divisible por 4");
        }

    }
}
