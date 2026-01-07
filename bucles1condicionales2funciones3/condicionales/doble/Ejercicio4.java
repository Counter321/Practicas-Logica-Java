package bucles1condicionales2funciones3.condicionales.doble;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        double numero = sc.nextDouble();
        if ((numero>0 && numero<1) ||(numero<0 && numero>-1)) {
            System.out.println("El numero es casi 0");
        } else {
            System.out.println("El numero no casi cero");
        }
    }
}
