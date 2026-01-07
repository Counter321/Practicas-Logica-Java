package bucles1condicionales2funciones3.condicionales.doble;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Los dos numeros son iguales");
        } else {
            System.out.println("Los dos numeros no son iguales");
        }
    }
}
