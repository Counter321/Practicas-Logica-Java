package bucles1condicionales2funciones3.condicionales.simples;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num = sc.nextInt();
        if((num+100)>1000) {
            System.out.println("El numero es mayor a 1000");
        }
    }
}
