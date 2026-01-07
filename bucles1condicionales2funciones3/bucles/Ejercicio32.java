package bucles1condicionales2funciones3.bucles;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int contador=0;
        for (int i = 1; i <=5; i++) {
            System.out.println("Dame el "+i+" numero");
            n = sc.nextInt();
            if(n>0) {
                contador++;

            }

        }
        System.out.println("La cantidad de numeros positivos es: "+contador);
        sc.close();
    }

}
