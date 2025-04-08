package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio12 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        final int tiradas = 1000;
        int valorUsuario;

        System.out.println("Ingrese valor a comprobar, entre 1 y 6: ");
        try {
            valorUsuario = Integer.parseInt(entrada.readLine());
            while (valorUsuario< 1 || valorUsuario > 6) {
                System.out.println("Error, numero fuera de rango. Ingrese otro valor: ");
                valorUsuario = Integer.parseInt(entrada.readLine());
            }
            System.out.println ("El total de veces que salio el valor fué de: "+tiradaDado(valorUsuario, tiradas));
            
        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }

    public static int tiradaDado(int valorUsuario, int tiradas){
        int acumulacion = 0;
        for(int i=0;i<tiradas;i++){
            int valorRandom = (int)(6*Math.random()+1);
            if (valorRandom == valorUsuario){
                acumulacion++;
            }
        }
        return acumulacion;
    }
}
