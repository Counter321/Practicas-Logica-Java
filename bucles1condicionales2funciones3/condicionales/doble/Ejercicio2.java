package bucles1condicionales2funciones3.condicionales.doble;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un primer caracteres ");
        char palabra = sc.next().charAt(0);
        System.out.println("Dame un segundo caracter");
        char palabra2 = sc.next().charAt(0);
        if (palabra==palabra2) {
            System.out.println("Los dos caracteres son iguales");
        } else {
            System.out.println("Los dos caracteres no son iguales");
        }
    }
}
