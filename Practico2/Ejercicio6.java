package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        int valorIngresado = 2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese valor mayor a 1 y menor a 100");
        try{    
            valorIngresado = Integer.valueOf(entrada.readLine());
        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }

        while(valorIngresado > 1 && valorIngresado < 100){
                if ( valorIngresado % 2 == 0 && valorIngresado % 3 == 0 ){
                    System.out.println("Es multiplo de 2 y 3");
                } else {
                    System.out.println("No es multiplo de 2 y 3");
                }
                System.out.println("Ingrese otro valor mayor a 1 y menor a 100");
                    try{
                        valorIngresado = Integer.valueOf(entrada.readLine());
                    }catch(Exception exc){
                        System.out.println("Error: "+exc);
                    }
        }
        System.out.println("Programa terminado.");      
    }
}
