package bucles1condicionales2funciones3.funciones;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos likes tiene tu video?");
        int n1 = sc.nextInt();
        boolean viral = EsViral(n1);
        if(viral){
            System.out.println("Eres viral");
        } else {
            System.out.println("No eres viral bro");
        }
    }

    private static boolean EsViral(int n1) {
        return n1>100000;
    }
}
