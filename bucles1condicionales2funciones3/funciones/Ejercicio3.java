package bucles1condicionales2funciones3.funciones;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int num1 = sc.nextInt();
        eco(num1);
    }


    public static void eco(int a) {
            for (int i = 1; i <=a ; i++) {
                System.out.println("Eco");

            }
        }
        }



