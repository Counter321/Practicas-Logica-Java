package string.ejercicios.ejercicios_normales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        String[] caracter = frase.split(" ");
        int contador =1;
        for (String cadena : caracter) {
            if (cadena.length() <=4) {
                System.out.println(contador+".- "+cadena.toUpperCase());
            } else if (cadena.length() >4) {
                System.out.println(contador+".- "+cadena.toLowerCase());
            }
            contador++;
        }

    }
}


