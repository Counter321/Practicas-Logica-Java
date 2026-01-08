package unidad2.funciones.ejemplos;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;


public class Ejemplo3Llamada {

    public static void main(String[] args) {

        // --- DATOS DEL JUGADOR (Variables de entrada) ---
        String username = "PixelAvenger92";
        String nombreReal = "David";
        int edad = 28;
        int puntosXP = 1480; // Prueba a cambiar esto por 850 para ver cómo cambia el IF

        // --- VARIABLES PARA GUARDAR LOS RESULTADOS ---
        String bioDelUsuario;
        int nivelDelUsuario;

        // --- TAREA: Completa las 4 tareas ---

        // 1. Llama a la función 'imprimirBienvenida'.
        //    Recibe 'username' como argumento.
        //    (Esta función es 'void', no devuelve nada, solo llámala).
        // TU CÓDIGO AQUÍ (Línea 1)

        imprimirBienvenida(username);

        // 2. Llama a la función 'calcularNivel'.
        //    Pásale la variable 'puntosXP' como argumento.
        //    Esta función devuelve un int.
        //    Guarda el resultado en la variable nivelDeLUsuario
        // TU CÓDIGO AQUÍ (Línea 2)
        nivelDelUsuario= calcularNivel(puntosXP);


        // 3. Llama a la función 'crearBio' con los parámetros que necesita
        //    Pásale las variables 'nombreReal' y 'edad' como argumentos (en ese orden).
        //    Esta función devuelve un String,
        //    Guarda lo que devuelve en la variable 'bioDelUsuario'.
        // TU CÓDIGO AQUÍ (Línea 3)
        bioDelUsuario= crearBio(nombreReal, edad);



        // 4. ¡NUEVA TAREA! Queremos saber si el jugador puede competir.
        //    Escribe un 'if' que llame directamente a la función 'esAptoParaCompeticion'.
        //esa función recibe un parámetro de tipo int (pásale la variable nivelDelUsuario)
        //    (que calculaste en el paso 2).
        //    Si la función esAptaParaCompetición devuelve 'true', imprime "¡Puedes competir!".
        //    Si devuelve 'false', imprime "Sigue subiendo de nivel para competir.".
        //

            if ( esAptoParaCompeticion(nivelDelUsuario) ) {

                System.out.println("¡Puedes competir!");
            } else {
                System.out.println("Sigue subiendo de nivel para competir.");
            }


        // --- IMPRESIÓN DE RESULTADOS  ---
        // DESCAMENTA Y si no hay errores, ¡lo has hecho bien!)
        System.out.println("Bio: " + bioDelUsuario);
        System.out.println("Nivel: " + nivelDelUsuario);

    }
        /**
         * --- ÁREA DE FUNCIONES (NO MODIFICAR) ---
         */

        /**
         * Función VOID: No devuelve nada. Solo ejecuta una acción (imprimir).
         */
        public static void imprimirBienvenida(String nombreUsuario) {
            System.out.println("===================================");
            System.out.println("¡Bienvenido, " + nombreUsuario + "! Cargando tu perfil...");
            System.out.println("===================================");
        }

        /**
         * Función con retorno String: Recibe datos y DEVUELVE un texto.
         */
        public static String crearBio(String nombre, int edad) {
            return "Bio: " + nombre + " | " + edad + " años | Apasionado de los RPG.";
        }

        /**
         * Función con retorno int: Recibe un número y DEVUELVE otro número.
         */
        public static int calcularNivel(int puntosExperiencia) {
            // Lógica simple: 1 nivel por cada 100 puntos de experiencia
            return puntosExperiencia / 100;
        }

        /**
         * (NUEVA FUNCIÓN)
         * Función con retorno boolean: Recibe un nivel y DEVUELVE true (si es apto) o false (si no).
         */
        public static boolean esAptoParaCompeticion(int nivel) {
            // La regla es que se necesita ser nivel 10 o más.
            if (nivel >= 10) {
                return true;
            } else {
                return false;
            }
        }

}
