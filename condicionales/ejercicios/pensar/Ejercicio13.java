    package unidad2.condicionales.ejercicios.pensar;

    import java.util.Scanner;

    public class Ejercicio13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame un numero entre 0 y 9999");
            int n = sc.nextInt();
            sc.nextLine();
            String numeroentexto = String.valueOf(n);
            char c1 = numeroentexto.charAt(0);
            char c2 = numeroentexto.charAt(1);
            char c3 = numeroentexto.charAt(2);
            char c4 = numeroentexto.charAt(3);
           if ((0<=n && n<=9999)&& (c1==c4 && c2==c3)) {
               System.out.println("El numero capicua es: " + n);
           }
           else if(c1==c3 )  {
               System.out.println("El numero capicua es: "+n);

           }
           else if(c1==c2 )  {
                    System.out.println("El numero es: "+n);
               }

           else if(0<=n && n<10) {
               System.out.println("Todos los numeros de 1 cifra son capicuas");
           }

           else {
               System.out.println("El numero no esta entre los valores pedidos");
           }

       } }
