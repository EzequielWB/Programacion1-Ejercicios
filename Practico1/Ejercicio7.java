package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio7 {

    public static void main (String[]args){

        Float num1, num2, num3, resultado, verificacion;

        try{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese primer valor: ");
        num1 = Float.valueOf(entrada.readLine());
        System.out.println("Ingrese segundo valor: ");
        num2 = Float.valueOf(entrada.readLine());
        System.out.println("Ingrese tercer valor: ");
        num3 = Float.valueOf(entrada.readLine());

        verificacion = resultado = num1 / num2;
        resultado = resultado - num3;

        System.out.println("El resultado es: "+resultado);
        System.out.println("El valor antes de restarlo era: "+verificacion);

        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
