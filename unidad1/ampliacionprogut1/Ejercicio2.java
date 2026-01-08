package unidad1.ampliacionprogut1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un par de números: ");
        int numero1 = sc.nextInt();
        int numero11 =sc.nextInt();
        System.out.println("Ingresar otro par de números:");
        int numero2 = sc.nextInt();
        int numero22 =sc.nextInt();
        double distanciapuntoplano = Math.sqrt(Math.pow(numero2-numero1,2)+Math.pow(numero22-numero11,2)) ;
        System.out.println("La distancia entre dos puntos en el plano:"+ distanciapuntoplano);

    }
}
