package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numeroTicket;
        final Double importeMAX = 3000.0;
        Double importe, descuento;
        String dia;
        
        System.out.println("Ingrese importe: ");
        try {
            importe = Double.valueOf(entrada.readLine());
            if (importe < 0){
                System.out.println("No puede ingresar un importe negativo.");
            }
            System.out.println("Ingrese dia de la semana:");
            dia = (String.valueOf(entrada.readLine())).toLowerCase();

            switch (dia) {
                case "martes":
                    if (importe <= 13000) {
                        System.out.println("No valido para descuento.");
                    }else{
                        if(importe > 13000 && importe<20000){
                            descuento = 0.05;
                            System.out.println("El total con descuento aplicado es de: "+ (importe - (importe * descuento)) );
                        } else{
                            descuento = 0.075;
                            System.out.println("El total con el descuento de 7.5% es de: "+(importe - (importe * descuento)));
                        }
                    }
                    
                break;

                case "jueves":
                    if (importe <=25000){
                        System.out.println("No es valido para descuento.");
                        
                    } else {
                        descuento = 0.1;
                        Double descuentoAplicado = (importe * descuento);
                    
                        if (descuentoAplicado > importeMAX) {
                            descuentoAplicado = importeMAX;
                        }
                        System.out.println("El total con el descuento de 10% (tope de reintegro 3000$): "+(importe - descuentoAplicado)); 
                    }                                
                break;

                case "viernes", "sabado":
                    if (importe < 15000){
                        System.out.println("No aplicable para descuento");
                    }else{
                        System.out.println("Ingrese numero de ticket: ");
                        numeroTicket = Integer.valueOf(entrada.readLine());
                        System.out.println("Ingrese numero de DNI: ");
                        String DNI = String.valueOf(entrada.readLine());
                        char ultimoDigitoDNI = DNI.charAt(DNI.length() - 1);

                        descuento = 0.08;

                        if ( (numeroTicket % 2 == 0) && ( ((int)ultimoDigitoDNI) % 2 == 0) ){
                            System.out.println("El total con el descuento del 8% es: "+(importe - (importe * descuento)));
                        } else{
                            System.out.println("No aplica descuento");
                        }
                }
                break;
                    
                default:
                    System.out.println("Ese dia no es valido o no tiene descuento.");
                break;
            }

        } catch (Exception exc) {
            System.out.println("Error: "+exc);
        }
    }
}
