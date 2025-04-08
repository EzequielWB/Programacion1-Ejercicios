package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio18 {
    public static void main(String[] args) {
        double valorPrimero = 1, valorSegundo = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            try{      
                while (valorPrimero != 0) {
                    System.out.println("Ingrese primer valor: ");
                    valorPrimero = Double.valueOf(entrada.readLine());
                    System.out.println("Ingrese segundo valor: ");
                    valorSegundo = Double.valueOf(entrada.readLine());

                    if(valorSegundo != 0){
                        System.out.println("El resultado de la division es :"+(valorPrimero / valorSegundo));
                    } else{
                        System.out.println("Error, no se puede dividir por 0");
                    }
                }
            }catch (Exception exc){
                System.out.println("error: "+exc);
            }
    }
}
