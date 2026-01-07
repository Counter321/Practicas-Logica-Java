package bucles1condicionales2funciones3.condicionales.simples;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if (numero>0 && numero<9) {
            System.out.println("El numero esta entre 0 y 9");
        }
    }
}
