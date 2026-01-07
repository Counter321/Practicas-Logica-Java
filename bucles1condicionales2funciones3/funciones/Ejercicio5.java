package bucles1condicionales2funciones3.funciones;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad ");
        int edad = sc.nextInt();
        boolean mayor=esMayorEdad(edad);
        System.out.println(mayor);

    }

    public static boolean esMayorEdad(int edad) {
        boolean resultado;
        if(edad>=18) {
            resultado= true;
        } else {
            resultado= false;
        }
        return resultado;

    }
}
