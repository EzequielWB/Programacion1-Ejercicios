package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio12 {
    
    public static void main (String[]args){

        int valor1,valor2;

        try{

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese primer valor");
            valor1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo valor");
            valor2 = Integer.valueOf(entrada.readLine());

            System.out.println("El primer valor es: "+valor1+ " ese valor incrementado en 1 es: "+ (++valor1) );
            System.out.println("El segundo valor es: "+valor2+ " ese valor decrementado en 1 es: "+ (--valor2) );

        }catch(Exception exc){
            System.out.println(exc);
        }
    }

}
