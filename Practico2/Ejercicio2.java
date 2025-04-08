package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        String mes;
        int anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese mes del año: ");
            mes = String.valueOf(entrada.readLine());

            switch(mes) {
                case "enero","marzo","mayo","julio","agosto","octubre","diciembre":
                    System.out.println("El mes tiene 31 dias");
                break;
                case "febrero":
                    System.out.println("Ingrese año: ");
                    anio = Integer.valueOf(entrada.readLine());
                        if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                            System.out.println("Es año bisiesto, Febrero tiene 29 dias");
                        }else{
                            System.out.println("No es año bisiesto, por tanto febrero tiene 28 dias");
                        }
                break;
                case "abril","junio,","septiembre","noviembre":
                    System.out.println("El mes tiene 30 dias");
                break;
                default : 
                    System.out.println("Error mes invalido");
                break;
            }

        } catch (Exception exc){
            System.out.println ("Ocurrio un error" +exc);
        }
    }

}
