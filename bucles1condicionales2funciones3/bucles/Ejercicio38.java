package bucles1condicionales2funciones3.bucles;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int edad;
        do{

            System.out.println("Dime tu edad ");
            edad = sc.nextInt();
            if(edad<18){
                System.out.println("No puedes pasar eres menor de edad");
            }
        } while (edad<18);
        System.out.println("¡Bienvenido!");

    }
}