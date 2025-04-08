package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        int numeroIngresado = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese valor entero distinto de 0: ");
        try{
           numeroIngresado = Integer.valueOf(entrada.readLine());

        while (numeroIngresado != 0) {
            System.out.println("El valor es: "+numeroIngresado+", ingrese otro numero: ");
            numeroIngresado = Integer.valueOf(entrada.readLine());
        }
        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}
