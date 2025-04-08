package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        String nombre, ocupacion;
        int edad;
        float altura;

        try {

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese su Nombre: ");
            nombre = String.valueOf(entrada.readLine());

            System.out.println("ingrese edad: ");
            edad = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese altura");
            altura = Float.valueOf(entrada.readLine());

            System.out.println("Ingrese ocupación:");
            ocupacion = String.valueOf(entrada.readLine());

            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Altura: "+altura);
            System.out.println("Ocupación: "+ocupacion);

        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
