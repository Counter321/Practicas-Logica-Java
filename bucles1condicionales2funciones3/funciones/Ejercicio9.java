package bucles1condicionales2funciones3.funciones;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el ancho de un rectangulo");
        double ancho = sc.nextDouble();
        System.out.println("Dame la altura  de un rectangulo");
        double altura = sc.nextDouble();
        double area = area(ancho,altura);
        double perimetro=perimetro(ancho,altura);
        System.out.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }

    public static double perimetro(double ancho, double altura) {
        double perimetro = (2*ancho)+(2*altura);
        return perimetro;
    }

    public static double area(double ancho, double altura) {
        double area = ancho*altura;
        return area;
    }
}
