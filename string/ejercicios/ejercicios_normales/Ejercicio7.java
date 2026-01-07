package string.ejercicios.ejercicios_normales;

import java.util.Scanner;

public class Ejercicio7 {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String palabra = sc.nextLine();

        int letras=0;
        int  minusculas = 0;
        int  mayusculas=0;
        int digitos =0;
        int noalfanumericos=0;
        for (int i = 0; i <palabra.length() ; i++) {
            char caracter=palabra.charAt(i);
            if (Character.isLetter(caracter)) {
                letras++;

                if (Character.isLowerCase(caracter)) {
                    minusculas++;
                } else if (Character.isUpperCase(caracter)) {
                    mayusculas++;
                }
            }
                else if (Character.isDigit(caracter)) {
                    digitos++;
                } else {
                    noalfanumericos++;
                }

        }
        System.out.println("letras: "+letras);
        System.out.println("minusculas: "+minusculas);
        System.out.println("mayusculas: "+mayusculas);
        System.out.println("dígitos: "+digitos);
        System.out.println("noalfanumericos:  "+noalfanumericos);
    }
}
