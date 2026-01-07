package bucles1condicionales2funciones3.bucles;

public class Ejercicio54 {
    public static void main(String[] args) {
        int numeros = 1;

        for (int i = 0; i <= 12; i++) {
            System.out.println(i + " x " + 1 + "= " + i * 1);

            if (i == 12) {

                for (int j = 0; j <= 12; j++) {
                    System.out.println(j + " x " + 2 + "= " + j * 2);
                    if (j == 12) {
                        for (int c = 0; c <= 12; c++) {
                            System.out.println(c + " x " + 3 + "= " + c * 3);
                            if(c==12){
                                for (int d = 0; d <= 12; d++) {
                                    System.out.println(c + " x " + 4 + "= " + c * 4);
                                }
                        }


                    }
                }
            }
        }
    }
} }