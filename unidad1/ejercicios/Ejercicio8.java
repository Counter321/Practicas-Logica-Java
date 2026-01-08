package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        System.out.println("El doble es ---> " + doble);
        System.out.println("El triple es --->" + triple);
        //(numero*2) y (numero*3): otra forma de hacerla//

    }
}
