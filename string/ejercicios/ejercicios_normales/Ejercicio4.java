package string.ejercicios.ejercicios_normales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase ");
        String frase = sc.nextLine();
        String[] caracter = frase.split(" ");
        int contador =1;
        for (String cadena: caracter) {
            System.out.println(contador+".- "+cadena);
            contador++;

        }

    }

}
