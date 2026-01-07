package bucles1condicionales2funciones3.condicionales.pensar;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entre 0 y 9999");
        int numero = sc.nextInt();
        sc.nextLine();
        String texto = String.valueOf(numero);
        int longitud = texto.length();
        char primero = texto.charAt(0);
        char segundo = texto.charAt(1);
        char tercero = texto.charAt(2);
        char quarter = texto.charAt(3);
        boolean capicua = false;
        if(numero<0 || numero>9999){
          capicua = false;
        }
        else if ((numero>=1000 && numero<=9999) && (primero==quarter && segundo==tercero)){
            capicua = true;
        } else if ((numero>=100 && numero<=999)&& (primero==tercero)){
            capicua = true;
        } else if ((numero>=10 && numero<=99)&& (primero==segundo)){
            capicua = true;
        } else {
            capicua = true;
        }
        if(capicua){
            System.out.println("Este numero es capicua");
        } else {
            System.out.println("Valor mal introducido");
        }

    }
}
