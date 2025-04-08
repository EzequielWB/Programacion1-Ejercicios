package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio11 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorPrimero, valorSegundo;
        final int valorMAX = 20;


        try {
            for (int i=0;i<valorMAX;i++){
                System.out.println("Ingrese primer valor:");
                valorPrimero = Integer.parseInt(entrada.readLine());

                System.out.println("Ingrese segundo valor: ");
                valorSegundo = Integer.parseInt(entrada.readLine());

                System.out.println("El valor mas alto fué: " +valoresMayores(valorPrimero, valorSegundo));
            }

        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }

    public static int valoresMayores(int valorPrimero, int valorSegundo){
        int valorGuardado;
        if (valorPrimero>valorSegundo) {
            valorGuardado = valorPrimero;
        }else{
            valorGuardado = valorSegundo;
        }
        return valorGuardado;
    }
}
