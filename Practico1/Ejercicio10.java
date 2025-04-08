package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio10 {
    
    public static void main (String[]args){

        int valor1,valor2;
        boolean verMayor, verMultiplo;

        try{

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese primer valor: ");
            valor1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese segundo valor: ");
            valor2 = Integer.valueOf(entrada.readLine());

            verMayor = (valor1 > valor2);

            verMultiplo = ( (valor1 % 2 == 0) && (valor2 % 2 == 0) );

            System.out.println("El primer valor es mayor al segundo?: " +verMayor);
            System.out.println("Son multiplos de 2?: " +verMultiplo);

        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
