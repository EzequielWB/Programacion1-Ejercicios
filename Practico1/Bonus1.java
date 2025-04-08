package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bonus1 {

    public static void main(String[]args){

        String fecha, hora, cuit, dni, ticket;
        
        final String cajero = "Luis Mercado";
        final char caja = '8';

        try{

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la fecha del dia: ");
            fecha = String.valueOf(entrada.readLine());
            System.out.println("Ingrese la hora: ");
            hora = String.valueOf(entrada.readLine());
            System.out.println("Ingrese cuit: ");
            cuit = String.valueOf(entrada.readLine());
            System.out.println("Ingrese DNI: ");
            dni = String.valueOf(entrada.readLine());
            System.out.println("Ingrese Ticket Nro.: ");
            ticket = String.valueOf(entrada.readLine());

            System.out.println("--------------------");
            System.out.println(fecha+" - "+hora+"       Ticket Nro. "+ticket);
            System.out.println("        CUIT: "+cuit+"      ");
            System.out.println("Cajero: "+cajero+"      Caja: "+caja);
            System.out.println("DNI: "+dni+"            'El precio lo pone el cliente' ");
            System.out.println("--------------------");

        }catch (Exception exc){
            System.out.println(exc);
        }
    }
    
}
