package bucles1condicionales2funciones3.condicionales.doble;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int segundo=sc.nextInt();
        if (numero>segundo) {
            System.out.println(numero);
            System.out.println(segundo);
        } else  {
            System.out.println(segundo);
            System.out.println(numero);
        }
    }
}
