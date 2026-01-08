package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el  numero: ");
        int numero = sc.nextInt();

        int primera = numero/10000;
        int segunda = numero/1000;
        int tercera = numero/100;
        int cuarta = numero/10;
        int quinta = numero;


        System.out.println(primera);
        System.out.println(segunda);
        System.out.println(tercera);
        System.out.println(cuarta);
        System.out.println(quinta);


    }
}
