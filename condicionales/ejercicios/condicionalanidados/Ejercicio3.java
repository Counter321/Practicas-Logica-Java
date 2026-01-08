package unidad2.condicionales.ejercicios.condicionalanidados;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero cualquiera:");
        Scanner sc = new Scanner(System.in);
        int numero= sc.nextInt();
        if(10000<=numero && numero<=99999) {
            System.out.println("El número de cifras es 5 ");
        } else if (1000<=numero && numero<=9999) {
            System.out.println("El numero de cifras es 4");
        }
        else if (100<=numero && numero<=999) {
            System.out.println("El numero de cifras es 3");
        }
        else if (10<=numero && numero<=99) {
            System.out.println("El numero de cifras es 2");
        }
        else if (0<=numero && numero<=9) {
            System.out.println("El numero de cifras es 1º");
        }


    }

}
