package bucles1condicionales2funciones3.condicionales.doble;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un primer numero");
        int a  = sc.nextInt();
        System.out.println("Dame un segundo numero");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("El primer numero es mayor que el otro ");
        } else {
            System.out.println("El segundo numero es mayor que el otro ");
        }
    }
}
