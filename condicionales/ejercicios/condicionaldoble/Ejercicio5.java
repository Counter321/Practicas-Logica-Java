package unidad2.condicionales.ejercicios.condicionaldoble;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numero = entrada.nextInt();
        System.out.println("Ingresa otro numero entero");
        int numero2 = entrada.nextInt();
        if (numero2 > numero) {
            System.out.println(numero2);
            System.out.println(numero);
        } else {
            System.out.println(numero);
            System.out.println(numero2);
        }

    }

}
