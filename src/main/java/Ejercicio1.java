/*
    Realiza un programa para calcular el área de un triángulo según su base y su altura.
    La interfaz debe ser como la que se muestra a continuación y responder de un modo análogo:
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        Ejercicio1InterfazGrafica.interfazGrafica();
    }



    public static String areaTriandulo(String base, String altura){
        int salida;

        int base1 = Integer.parseInt(base);
        int altura1 = Integer.parseInt(altura);
        
        salida = (base1 * altura1)/2;

        return String.valueOf(salida);

    }
}
