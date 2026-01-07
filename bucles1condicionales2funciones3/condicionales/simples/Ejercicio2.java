package bucles1condicionales2funciones3.condicionales.simples;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int numero = sc.nextInt();
        if(numero%10==0){
            System.out.println("El numero es divisible por 10");
        }
    }
}
