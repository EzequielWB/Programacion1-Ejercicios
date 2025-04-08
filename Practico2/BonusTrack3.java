package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numeroSecreto = (int)(Math.random() * 1000) % 100;
        int numeroIngresado = 1;
        int intentos = 0;
        boolean acerto = false;
        
        try {
            while(acerto == false){
                if (numeroIngresado < 0 || numeroIngresado > 99){
                    System.out.println("Ingrese un valor entre 0 y 99: ");
                    numeroIngresado = Integer.valueOf(entrada.readLine());

                    if (numeroIngresado > numeroSecreto) {
                        System.out.println("No acertó. El número ingresado es muy grande.");
                        intentos++;
                    } else if (numeroIngresado < numeroSecreto) {
                        System.out.println("No acertó. El número ingresado es muy chico.");
                        intentos++;
                    } else{
                        System.out.println("Felicitaciones! Acertaste! Total de intentos: "+intentos);
                        acerto = true;
                    }
                }else{  
                    System.out.println("Numero no valido. Intente denuevo");
                }
            }
        } catch (Exception exc) {   
            System.out.println("Error: "+exc);
        }
    }
}
