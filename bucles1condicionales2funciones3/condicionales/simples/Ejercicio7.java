package bucles1condicionales2funciones3.condicionales.simples;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una primera palabra");
        String palabra = sc.nextLine();
        System.out.println("Dame una segunda palabra");
        String palabra2 = sc.nextLine();
        if (palabra.equalsIgnoreCase(palabra2)) {
            System.out.println("Estas dos palabras son iguales");
        }
    }
}
