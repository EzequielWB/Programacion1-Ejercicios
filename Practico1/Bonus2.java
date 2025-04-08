package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bonus2 {
    
    public static void main(String[] args) {
        
        int importe, dia;
        boolean descuentoMartes5, descuentoMartes7, descuentoJueves10;

        try{

            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese importe: ");
            importe = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese dia, 1: martes | 2: jueves : ");
            dia = Integer.valueOf(entrada.readLine());

            descuentoMartes5 = ( (dia == 1) && (importe > 13000 && importe < 20000) );
            descuentoMartes7 = ( (dia == 1) && (importe > 20000) );
            descuentoJueves10 = ( (dia == 2) && (importe > 25000) );
        
            System.out.println("Aplica descuento del Martes 5%?: " +descuentoMartes5);
            System.out.println("Aplica descuento del Martes 7.5%?: " +descuentoMartes7);
            System.out.println("Aplica descuento Jueves 10%?: "+descuentoJueves10);
            
        }catch (Exception exc){
            System.out.println(exc);
        }

    }
}
