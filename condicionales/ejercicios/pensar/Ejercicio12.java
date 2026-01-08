package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String tipoa= "A";
        final String tipob= "B";
        final String tamano1= "1";
        final String tamano2= "2";

        System.out.println("Dime el precio inicial");
        double precioinicial = sc.nextInt();
        System.out.println("Dime si la uva es tipo A o B");
        sc.nextLine();
        String tipo = sc.nextLine();
        System.out.println("Dime si la uva es tamaño 1 o 2");
        String tama = sc.nextLine();
        if (tipo.equals(tipoa) && tama.equals(tamano1)) {
            double agregado1 = precioinicial + 0.20;
             System.out.println("La ganancia total del vinicultor es: " + agregado1+"€");
        } else if (tipo.equals(tipoa) && tama.equals(tamano2)) {
            double agregado2 = precioinicial + 0.30;
            System.out.println("La ganancia total del vinicultor es: " + agregado2+"€");
        }

        else if (tipo.equals(tipob) && tama.equals(tamano1)){
            double agregado3 = precioinicial -0.30 ;
            System.out.println("\"La ganancia total del vinicultor es:" + agregado3+"€");
        }
        else if (tipo.equals(tipob) && tama.equals(tamano2)){
            double agregado4 = precioinicial - 0.50;
            System.out.println("\"La ganancia total del vinicultor es:" + agregado4+"€");
        } else {
            System.out.println("No existe esta uva ");
        }







    }
}







