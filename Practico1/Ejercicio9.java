package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio9 {
    
    public static void main (String[] args) {

        int valorIngresado;

        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un valor entero: ");
            valorIngresado = Integer.valueOf(entrada.readLine());

            System.out.println("El cociente de "+valorIngresado+" / 2 es: " +(valorIngresado/2) );
            System.out.println("El cociente de "+valorIngresado+" / 3 es: " +(valorIngresado/3) );
            System.out.println("El cociente de "+valorIngresado+" / 4 es: " +(valorIngresado/4) );

        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
