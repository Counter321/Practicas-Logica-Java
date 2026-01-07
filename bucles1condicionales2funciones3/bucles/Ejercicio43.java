package bucles1condicionales2funciones3.bucles;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etiqueta=0;
        double altura;
        double alturamasgrande=0;
        int etiquetamasalto=0;
        do {

            System.out.println("Dime la altura del árbol");
            altura = sc.nextDouble();
            if ((altura!=-1) && (altura>alturamasgrande)) {
               alturamasgrande=altura;
               etiquetamasalto=etiqueta;
            }
            etiqueta++;



        } while (altura!= -1);
        System.out.println("La altura mas grande del arbol es: "+alturamasgrande+" y su etiqueta es: "+etiquetamasalto);
        sc.close();
    }
    }

