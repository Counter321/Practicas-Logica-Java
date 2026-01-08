package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos likes tiene tu publicación de tik tok?");
        double likes = sc.nextDouble();
        if (likes > 10000) {
            System.out.println("Tu publicación es viral");

        } else {
            System.out.println("Puede que esto no sea lo tuyo");
        }
    }
}
