package bucles1condicionales2funciones3.bucles;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int contadorpares=0;
        do {
            System.out.println("Dime un numero que sea menor que el segundo");
            a = sc.nextInt();
            System.out.println("Dime un numero que sea mayor q el primero");
            b = sc.nextInt();


        } while (b<=a);
        for (int i = a; i <=b ; i++) {
            if(i%2==0){
                System.out.print(" "+ i);
                contadorpares++;
            }
        }
        System.out.println(" La canitdad de pares son: "+contadorpares);


    }
}
