package bucles1condicionales2funciones3.bucles;

public class ASAFS {
    public static void main(String[] args) {

        System.out.println("--- Tablas de Multiplicar del 1 al 5 ---");

        // 1. BUCLE EXTERIOR: Controla QUÉ tabla estamos haciendo (del 1 al 5).
        for (int tabla = 1; tabla <= 5; tabla++) {

            System.out.println("\n*** TABLA DEL " + tabla + " ***");

            // 2. BUCLE INTERIOR: Controla las 12 multiplicaciones de esa tabla (del x1 al x12).
            for (int multiplicador = 1; multiplicador <= 12; multiplicador++) {

                int resultado = tabla * multiplicador;

                // Imprime la operación: (ej: 3 x 4 = 12)
                System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            }
            // Cuando el bucle interior termina, el exterior avanza a 'tabla = 2'.
        }
    }
}

