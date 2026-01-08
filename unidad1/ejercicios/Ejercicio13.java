package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu dia de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Introduce tu año de nacimiento");
        int year = sc.nextInt();
        int numero = dia+year+mes;
        int numeroDeLaSuerte = sumarCifras(numero);
        System.out.println("Tu número de la suerte es: " + numeroDeLaSuerte);
        sc.close();


    }
    public static int sumarCifras(int numero) {
        int suma = 0;


        while (numero > 0) {

            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }

        return suma;
}
}
