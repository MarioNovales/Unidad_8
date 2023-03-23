/*
    Realiza un programa para calcular el área de un triángulo según su base y su altura.
    La interfaz debe ser como la que se muestra a continuación y responder de un modo análogo:
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        Ejercicio1InterfazGrafica.interfazGrafica();
    }



    public static int areaTriandulo(int base, int altura){
        int salida;

        salida = (base * altura)/2;

        return salida;

    }
}
