package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu numero de seguidores:");
        double numero = sc.nextDouble();
        if (numero>10000){
            System.out.println("Eres un influencer");
        } else {

            System.out.println("Eres un usuario normal ");


    }
}
}