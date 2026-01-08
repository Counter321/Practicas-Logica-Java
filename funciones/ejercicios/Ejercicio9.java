package unidad2.funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el ancho de un rectangulo");
        double anchura = sc.nextDouble();

        System.out.println("Dame el alto de un rectangulo");
        double altura = sc.nextDouble();
        System.out.println("Su perimetro es: "+perimetroRectangulo(anchura, altura));
        System.out.println("Su area es : "+arearectangulo(anchura, altura));

    }

    private static double perimetroRectangulo(double ancho, double alto) {
        return (2 * ancho)+ (2 * alto);

    }

    private static double arearectangulo(double ancho, double alto) {
        return ancho * alto;
    }
}
