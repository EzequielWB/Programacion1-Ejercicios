package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bonus3 {
    
    public static void main(String[] args) {
        
        String DNI;
        char UltimoDigitoDNI;
        boolean descuento;
        int importe, dia, ticket;

        try{

            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese DNI: ");
            DNI = String.valueOf(entrada.readLine());
            UltimoDigitoDNI = (DNI.charAt(7)); //usamos un char para poder encontrar el valor del DNI

            System.out.println("Ingrese importe: ");
            importe = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese dia, 1 para viernes, 2 para sabado");
            dia = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese ticket");
            ticket = Integer.valueOf(entrada.readLine());

            descuento = ( (dia == 1 || dia == 2) && (ticket % 2 == 0) && (importe >= 15000) && (UltimoDigitoDNI % 2 != 0));

            System.out.println("Se aplica descuento?: "+descuento);

        }catch (Exception exc){
            System.out.println(exc);
        }

    }
}
