package unidad2.funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos me gustas tienes? ");
        int numerogustas = sc.nextInt();
        System.out.println("Tu publicacion es viral?: "+esViraltiktok(numerogustas));
    }

    private static boolean esViraltiktok(int i) {
        if (i >100000) {
            return true;
        } else  {
            return false;
        }
    }
}
