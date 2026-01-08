package unidad1.ampliacionprogut1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingre su velocidad del vehiculo 1:");
        double v1 = sc.nextDouble();
        System.out.println("Ingre su velocidad del vehiculo 2:");
        double v2 = sc.nextDouble();
        System.out.println("Ingrese la distancia entre ellos:");
        double d = sc.nextDouble();
        double tiempo = d/(v2-v1); //distancia en km, v2 y v1 en km/h//
        System.out.println("El tiempo en que alcanza el primero al segundo:"+ tiempo);
        double tiempofinal = tiempo*60; //El (int) es para que obligue a leer la letra como número//
        System.out.println("El tiempo en minutos:"+tiempofinal);


    }
}
