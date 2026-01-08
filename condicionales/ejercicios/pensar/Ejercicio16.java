package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio16 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame un numero comprendido entre 1 y 99");
            int n = sc.nextInt();
            int decenas =n/10;
            int unidades = n%10;
            if (n >= 1 && n <= 99) {
                if (n<20){
                    switch (n) {
                        case 1:
                            System.out.println("Uno");
                            break;
                        case 2:
                            System.out.println("Dos");
                            break;
                        case 3:
                            System.out.println("Tres");
                            break;
                        case 4:
                            System.out.println("Cuatro");
                            break;
                        case 5:
                            System.out.println("Cinco");
                            break;
                        case 6:
                            System.out.println("Seis");
                            break;
                        case 7:
                            System.out.println("Siete");
                            break;
                        case 8:
                            System.out.println("Ocho");
                            break;
                        case 9:
                            System.out.println("Nueve");
                            break;
                        case 10:
                            System.out.println("Diez");
                            break;
                        case 11:
                            System.out.println("Once");
                            break;
                        case 12:
                            System.out.println("Doce");
                            break;
                        case 13:
                            System.out.println("Trece");
                            break;
                        case 14:
                            System.out.println("Catorce");
                            break;
                        case 15:
                            System.out.println("Quince");
                            break;
                        case 16:
                            System.out.println("Dieciseis");
                            break;
                        case 17:
                            System.out.println("Diecisiete");
                            break;
                        case 18:
                            System.out.println("Dieciocho");
                            break;
                        case 19:
                            System.out.println("Diecinueve");
                            break;

                    }

                } else if (unidades==0) {
                    switch(decenas) {
                        case 2:
                            System.out.println("veinte");
                            break;
                        case 3:
                            System.out.println("treinta");
                            break;
                        case 4:
                            System.out.println("cuarenta");
                            break;
                        case 5:
                            System.out.println("cincuenta");
                            break;
                        case 6:
                            System.out.println("sesenta");
                            break;
                        case 7:
                            System.out.println("setenta");
                            break;
                        case 8:
                            System.out.println("ochenta");
                            break;
                        case 9:
                            System.out.println("noventa");
                            break;

                    }
                } else if (unidades != 0) {
                    String textoDecenas = "";
                    String textoUnidades = "";
                    switch (decenas) {
                        case 2:
                            textoDecenas = "veinti";
                            break;
                        case 3:
                            textoDecenas = "treinta y ";
                            break;
                        case 4:
                            textoDecenas = "cuarenta y ";
                            break;
                        case 5:
                            textoDecenas = "cincuenta y ";
                            break;
                        case 6:
                            textoDecenas = "sesenta y ";
                            break;
                        case 7:
                            textoDecenas = "setenta y ";
                            break;
                        case 8:
                            textoDecenas = "ochenta y ";
                            break; 
                        case 9:
                            textoDecenas = "noventa y ";
                            break;
                    }

                    switch (unidades) {
                        case 1:
                            textoUnidades = "uno";
                            break;
                        case 2:
                            textoUnidades = "dos";
                            break;
                        case 3:
                            textoUnidades = "tres";
                            break;
                        case 4:
                            textoUnidades = "cuatro";
                            break;
                        case 5:
                            textoUnidades = "cinco";
                            break;
                        case 6:
                            textoUnidades = "seis";
                            break;
                        case 7:
                            textoUnidades = "siete";
                            break;
                        case 8:
                            textoUnidades = "ocho";
                            break;
                        case 9:
                            textoUnidades = "nueve";
                            break;
                    }
                    System.out.println(textoDecenas + textoUnidades);
                }

            } else {
                System.out.println("El numero no esta comprendido entre 1 y 99");
            }
        }
    }

