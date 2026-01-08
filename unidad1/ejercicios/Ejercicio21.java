package unidad1.ejercicios;

public class Ejercicio21 {
    public static void main(String[] args) {
        String empl1 = "turnoMañana";
        String empl2 = "turnoTarde";
        String empl3 = "turnoNoche";
        //intercambio de turnos//
        String empl4 = empl1;
        empl1 = empl2;
        empl2 = empl3;
        empl3 = empl4;
        System.out.println("El empleado de la mañana pasa a:" +empl1);
        System.out.println("El empleado de la tarde pasa a:" +empl2);
        System.out.println("EL empleado de la noche pasa a:"+empl3);

    }
}
