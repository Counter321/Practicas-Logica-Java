package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del rectangulo");
        int base= sc.nextInt();
        System.out.println("Introduzca la altura del rectangulo");
        int altura= sc.nextInt();
        int perimetro = base+altura+altura+base;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        System.out.println("El area del rectangulo es: "+base*altura);

    }
}
