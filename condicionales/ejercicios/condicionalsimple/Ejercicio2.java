package unidad2.condicionales.ejercicios.condicionalsimple;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        if (numero % 10 == 0) {
            System.out.println("El numero es divisible por 10");
        }
    }
}
