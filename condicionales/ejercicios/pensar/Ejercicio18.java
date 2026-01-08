package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio18 {

        public  static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Minutos de la llamada: ");
            int minutos = sc.nextInt();
            sc.nextLine();
            System.out.print("¿La llamada fue domingo? (si/no): ");
            String esDomingo = sc.nextLine().trim().toLowerCase(); //trim elimina los espacios y tolowercase lo convierte a minuscula//
            System.out.print("Turno (mañana/tarde): ");
            String turno = sc.nextLine().trim().toLowerCase();
            //Cobro por tramo//
            double importeTramos;
            if (minutos <= 0) {
                importeTramos = 0.0;
            } else if (minutos <= 5) {
                importeTramos = 1.00;
            } else if (minutos <= 8) {
                importeTramos = 1.00 + 0.80;
            } else if (minutos <= 10) {
                importeTramos = 1.00 + 0.80 + 0.70;
            } else {
                int extra = minutos - 10;
                importeTramos = 1.00 + 0.80 + 0.70 + extra * 0.50;
            }
            //Aplicando impuestos//
            double tasaimpuesto;
            if (esDomingo.equals("si") || esDomingo.equals("s")) {
                tasaimpuesto = 0.03;
            } else  {
                if(turno.equals("mañana") || turno.equals("manana")){
                    tasaimpuesto = 0.15;
                } else {
                    tasaimpuesto = 0.10;
                }
            }
            //definimos los impuestos//
            double impuesto = importeTramos*tasaimpuesto;
            double total = impuesto + importeTramos;
            System.out.println("Total a pagar: "+total+"€");
        }
    }

