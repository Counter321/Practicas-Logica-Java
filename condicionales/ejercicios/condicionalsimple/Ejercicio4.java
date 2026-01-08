package unidad2.condicionales.ejercicios.condicionalsimple;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        if (((numero % 2) == 0) || ((numero % 3) == 0)) {
            System.out.println("Es múltiplo de 2 o de 3");
        }
    }
}
