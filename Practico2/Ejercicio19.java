package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio19 {
    public static void main(String[] args) {
        int valorIngresado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese mes valido del año: ");
        try{    
            valorIngresado = Integer.valueOf(entrada.readLine());

                if (valorIngresado >= 1 && valorIngresado <= 12){
                    switch(valorIngresado){
                        case 1,3,5,7,8,10,12: 
                            System.out.println(" Tiene 31 dias");
                        break;
                        case 2 :
                            System.out.println("Ingrese año entre 2000 y 2024: ");
                            valorIngresado = Integer.valueOf(entrada.readLine());
                                if ((valorIngresado >= 2000 && valorIngresado <= 2024)){
                                    if ( (valorIngresado % 4 == 0 && valorIngresado % 100 != 0) || (valorIngresado % 400 == 0) ) {
                                        System.out.println("Año bisiesto, tiene 29 dias febrero");
                                    }else{
                                        System.out.println ("Tiene 28 dias");
                                    } 
                                }else{
                                    System.out.println ("Error. año fuera de rango.");
                                }
                        break;
                        default:
                                System.out.println("Tiene 30 dias");
                        break;
                    }
                }else{
                    System.out.println("Error. Ingrese mes valido");
                }
        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}
