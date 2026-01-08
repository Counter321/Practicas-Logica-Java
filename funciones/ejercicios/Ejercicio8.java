package unidad2.funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer precio");
        double prim = sc.nextDouble();
        double preciofinal1 = precioconIVA(prim)+prim;

        System.out.println("Dame el segundo precio");
        double seg = sc.nextDouble();
        double preciofinal2 = precioconIVA(seg)+seg;
        System.out.println("Dame el tercero precio");
        double ter = sc.nextDouble();
        double preciofinal3 = precioconIVA(ter)+ter;

        System.out.println("Dame el cuatro precio");
        double cuar = sc.nextDouble();
        double preciofinal4 = precioconIVA(cuar)+cuar;
        System.out.println("Dame el cinco precio");
        double cin = sc.nextDouble();
        double preciofinal5 = precioconIVA(cin)+cin;

        System.out.println("el precio de venta del primero es: "+preciofinal1+" €");
        System.out.println("el precio de venta del segundo es: "+preciofinal2+" €");
        System.out.println("el precio de venta del tercero es: "+preciofinal3+" €");
        System.out.println("el precio de venta del cuarto es: "+preciofinal4+" €");
        System.out.println("el precio de venta del quinto es: "+preciofinal5+" €");
    }

    private static double precioconIVA(double precio) {
        return precio * 1.21;

    }
}
