package unidad2.condicionales.ejercicios.condicionaldoble;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero decimal");
        double num = sc.nextDouble();
        if ((0<num || num<0 ) && (num<=0.99)) {
            System.out.println("Este número es casi cero");
        } else  {
            System.out.println("Este número no es casi cero");
        }
    }
}
