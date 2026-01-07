package fundamentoslogicos.ampliacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //intercambio de valores
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int a=sc.nextInt();
        System.out.println("Ingrese un segundo numero");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;


        System.out.println("valor de a: "+a);
        System.out.println("valor de b: "+b);
    }
}
