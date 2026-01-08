package unidad2.condicionales.ejercicios.condicionalanidados;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame un numero");
        int numero = entrada.nextInt();
        System.out.println("Dame otro numero");
        int numero2 = entrada.nextInt();
        if (numero > numero2) {
            System.out.println("El primer numero es mayor que el segundo numero");
        }
        else if (numero == numero2) {
            System.out.println("Los dos números son iguales");
        }
        else   {
            System.out.println("El segundo número es mayor que el primer numero");

            }

    }
}
