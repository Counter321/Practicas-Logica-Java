package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String texto = sc.nextLine();
        System.out.println("Hola, " + texto + "¿Cómo estás?");
    }
}
