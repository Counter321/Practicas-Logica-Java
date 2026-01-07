package bucles1condicionales2funciones3.condicionales.simples;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un primer caracter");
        char c1 = sc.nextLine().charAt(0);
        System.out.println("Dame un segundo caracter");
        char c2 = sc.nextLine().charAt(0);
        if ((c1>='a' && c1<='z') && (c2>='a' && c2<='z')) {
            System.out.println("El primer caracter es minuscula");
        }


    }
}
