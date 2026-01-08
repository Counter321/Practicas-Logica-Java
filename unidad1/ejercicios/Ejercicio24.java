package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas respuestas tenias correctas?");
        int correctas = sc.nextInt();
        int correctas2 = correctas*5;
        System.out.println("¿Cuántas respuestas incorrectas?");
        int incorrectas = sc.nextInt();
        int incorrectas2 = incorrectas*(-1);
        System.out.println("¿Cuántas no respondiste?");
        int no_respondiste = sc.nextInt();
        int no_respondiste2 = no_respondiste*0;
        int notafinal = correctas2 + incorrectas2 + no_respondiste2;
        System.out.println("La nota final que has obtenido es:"+ notafinal);
    }
}
