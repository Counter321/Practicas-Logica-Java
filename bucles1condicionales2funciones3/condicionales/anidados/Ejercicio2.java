package bucles1condicionales2funciones3.condicionales.anidados;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("Dame el tercer numero ");
        int numero3 = sc.nextInt();
        double resultadoraiz = ((Math.pow(numero2,2))-(4*numero1*numero3));
        if (resultadoraiz<0){
            System.out.println("Esta ecuacion no tiene soluciones reales");
        } else if (resultadoraiz>0){
            double resultadofinal = (-numero2+Math.sqrt(resultadoraiz))/(2*numero1);
            double resultadofinal2 =(-numero2-Math.sqrt(resultadoraiz))/(2*numero1) ;
                if (resultadofinal==resultadofinal2){
                    System.out.println("El resultado tiebe una unica solucion");
                }  else {
                    System.out.println("El resultado tiene dos  soluciones");
                    System.out.println(resultadofinal);
                    System.out.println(resultadofinal2);
                }
        }
    }
}
