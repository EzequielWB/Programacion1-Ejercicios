package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack4 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean finalizarTurnoUsuario = false, finalizarTurno = false; 
        int acumulacionUsuario = 0; 
        int acumulacionComputadora = 0;
        try{
                while (finalizarTurnoUsuario == false) {
                    int valorAleatorio = (int)(Math.random()*10)+1;
                    System.out.println("Desea seguir? (1. Si | 2. No) lleva acumulado: "+acumulacionUsuario);
                    int respuestaUsuario = Integer.valueOf(entrada.readLine());
    
                    if(respuestaUsuario == 1){
                        acumulacionUsuario = acumulacionUsuario + valorAleatorio;
                        if (acumulacionUsuario > 21) {
                            System.out.println("Perdiste! superaste los 21 puntos.");
                            finalizarTurnoUsuario = true;
                            acumulacionUsuario = 0;
                        }
                        if (acumulacionUsuario == 21){
                            finalizarTurnoUsuario = true;
                        }
                    }else{
                        finalizarTurnoUsuario = true;
                    }
                }
    
                while (finalizarTurno == false) {
    
                    while(acumulacionComputadora < 16) {
                        int valorAleatorio = (int)(Math.random()*10) +1;
                        acumulacionComputadora = acumulacionComputadora + valorAleatorio;
                    }
    
                    if (acumulacionComputadora > 21) {
                        System.out.println("¡Ganaste! La computadora se pasó con: " + acumulacionComputadora);
                    } else if (acumulacionComputadora > acumulacionUsuario) {
                        System.out.println("Gano la computadora! Sacó: " + acumulacionComputadora);
                    } else if (acumulacionComputadora < acumulacionUsuario) {
                        System.out.println("¡Ganaste! La computadora sacó: " + acumulacionComputadora);
                    } else {
                        System.out.println("Hubo empate!");
                    }
                    finalizarTurno = true;
                    
                }

                System.out.println("Fin del juego. ¡Gracias por jugar!");
        }catch (Exception exc){
            System.out.println("Error: " +exc);
        }

    }
}
