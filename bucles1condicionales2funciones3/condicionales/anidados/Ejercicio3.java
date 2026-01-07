package bucles1condicionales2funciones3.condicionales.anidados;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero cualquiera");
        int num1 = sc.nextInt();
        if (num1<0 || num1>99999) {
            System.out.println("Esta fuera del rango ");
        }
        if (num1>=0 && num1<10) {
            System.out.println("El numero tiene 1 cifra");
        } else if (num1>=10 && num1<100) {
            System.out.println("El numero tiene 2 cifras");
        } else if (num1>=100 && num1<1000) {
            System.out.println("El numero tiene 3 cifras");
        } else if (num1>=1000 && num1<10000) {
            System.out.println("El numero tiene 4 cifras");
        } else  if (num1>=10000 && num1<100000) {
            System.out.println("El numero tiene 5 cifras");
        }
    }
}
