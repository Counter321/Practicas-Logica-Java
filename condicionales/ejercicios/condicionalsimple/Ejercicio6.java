package unidad2.condicionales.ejercicios.condicionalsimple;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un  numero: ");
        int numero = entrada.nextInt();
        if (numero >0 && numero <9) {
            System.out.println("Esta entre 9 y 0");
        }
    }
}
