package fundamentoslogicos.ampliacion;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        // interacción con el usuario
        Scanner sc=new Scanner(System.in);
        System.out.println("El primer un numero");
        int a=sc.nextInt();
        System.out.println("El segundo  numero");
        int b=sc.nextInt();
        System.out.println("El tercer numero");
        int c=sc.nextInt();
        System.out.println("El cuarto numero");
        int d=sc.nextInt();
        double distanciapuntoplano = Math.sqrt(Math.pow(b-a,2)+Math.pow(d-c,2)) ;
        System.out.println(distanciapuntoplano);
    }
}
