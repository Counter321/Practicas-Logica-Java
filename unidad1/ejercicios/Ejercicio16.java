package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Dame el segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("Dame el tercer numero");
        double num3 = sc.nextDouble();
        double mediaritmetica = num1 + num2 + num3;
        System.out.println("La media arimética es: " + mediaritmetica/3);


    }
}
