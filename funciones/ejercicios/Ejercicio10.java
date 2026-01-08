package unidad2.funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia(1-30)");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes(1-12)");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año");
        int ano = sc.nextInt();
        System.out.println("La fecha es: "+esFechacorrecta(dia,mes,ano));
    }

    private static boolean esFechacorrecta(int i, int j, int k) {
        if (1<=i && i<=30 && 1<=j && j<=12) {
            return true;
        }
         else {
            return false;
        }

    }
}
