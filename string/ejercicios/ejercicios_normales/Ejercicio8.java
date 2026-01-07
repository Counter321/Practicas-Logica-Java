package string.ejercicios.ejercicios_normales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una frase");
        String frase = sc.nextLine();
        System.out.println(frase);
        String espacio = frase.replace(" ", "  ");
        System.out.println(espacio);
    }
}
