package bucles1condicionales2funciones3.funciones;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero doble");
        double n1 = sc.nextDouble();
        System.out.println("Dime otro numero doble");
        double n2 = sc.nextDouble();
        System.out.println("el reslultado de multplicarlos es: "+multiplicacion(n1,n2));
    }

    public static double multiplicacion(double n1, double n2) {
        return n1*n2;
    }
}
