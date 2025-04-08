package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio11 {
    
    public static void main (String[]args){

        int valorIngresado;
        boolean verMultiplo, verMayor, verCociente;

        try{

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese valor: ");
            valorIngresado = Integer.valueOf(entrada.readLine());

            verMultiplo = ( (valorIngresado % 6 == 0) && (valorIngresado % 7 == 0) );
            verMayor = ( ( (valorIngresado > 30) && (valorIngresado % 2 == 0) ) || (valorIngresado >= 30) );
            verCociente = ( (valorIngresado / 5) > 10 );
            
            System.out.println("Es multiplo de 6 y 7?: "+verMultiplo);
            System.out.println("Es mayor a 30 y multiplo de 2, o es menor igual a 30?: " +verMayor);
            System.out.println("El cociente de la division del numero por 5 es mayor a 10?: "+verCociente);

        }catch(Exception exc){
            System.out.println(exc);
        }
    }

}
