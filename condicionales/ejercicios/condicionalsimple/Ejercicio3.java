package unidad2.condicionales.ejercicios.condicionalsimple;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        if (numero == 0) {
            System.out.println("El numero es igual a 0");
        }
    }
}
