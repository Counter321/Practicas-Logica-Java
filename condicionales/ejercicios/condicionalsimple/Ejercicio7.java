package unidad2.condicionales.ejercicios.condicionalsimple;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame una primer palabra: ");
        String palabra = entrada.nextLine();
        System.out.println("Dame una segunda palabra:   ");
        String segunda = entrada.nextLine();
        if (palabra.equals(segunda) ) {
            System.out.println("Las dos palabras son iguales");

        }
    }
}
