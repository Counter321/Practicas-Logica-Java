package unidad2.condicionales.ejercicios.condicionalsimple;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero = sc.nextInt();
        if ((numero+ 100)>1000); {
            System.out.println("El numero supera 1000");
        }
    }
}
