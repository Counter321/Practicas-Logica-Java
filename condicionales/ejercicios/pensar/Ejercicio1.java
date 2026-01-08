package unidad2.condicionales.ejercicios.pensar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();
        if (numero > 0 ) {
            System.out.println("El número es positivo");
        } else if (numero <0 ) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
    }
}
