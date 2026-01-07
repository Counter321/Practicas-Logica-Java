package bucles1condicionales2funciones3.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Random r = new Random();
       int suma=0;
       int numerodesumascorrectas=0;
       int resultado=0;
       while(suma==resultado ) {
           int aleauno =r.nextInt(100)+1;
           int aleados =r.nextInt(100)+1;
           suma=aleauno+aleados;

           System.out.println("Los dos numeros son: "+aleauno+" y: "+aleados);
           System.out.println("Dime la suma");;
           resultado = sc.nextInt();
           if(resultado==suma) {
               numerodesumascorrectas++;
           } else if(resultado==-1) {
               break;
           }
       }
        System.out.println("TU NUMERO DE ACIERTOS FUERON: "+ numerodesumascorrectas);
    }
}
