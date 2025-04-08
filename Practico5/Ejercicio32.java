package Practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio32 {
    public static void main(String[] args) {
        int arreglo[] = {0, 0, 3, 5, 0, 2, 3, 0, 3, 2, 4, 0, 1, 0, 0, 1, 2, 9, 3, 0, 0};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorUsuario;

        System.out.println("Ingrese posición de arreglo para buscar la secuencia (Entre 0 - 19): ");
        try {
            valorUsuario = Integer.parseInt(entrada.readLine());
                while ((valorUsuario <0 || valorUsuario >= arreglo.length) || (arreglo[valorUsuario] == 0)) {
                    System.out.println("Error en valor, ingrese denuevo: ");
                    valorUsuario = Integer.parseInt(entrada.readLine());
                }

                if (devolverPosicionInicialSecuencia(arreglo, valorUsuario) != -1) {
                    System.out.println("Inicio en: "+devolverPosicionInicialSecuencia(arreglo, valorUsuario));
                    System.out.println("Final en: "+devolverPosicionFinalSecuencia(arreglo, valorUsuario));
                } else{
                    System.out.println("No es secuencia.");
                }
                

        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public static int devolverCantSecuencias(int arreglo[]){
        boolean secuencia = false;
        int contador = 0;

        for (int i = 0;i<arreglo.length;i++){ //recorremos arreglo
            if (arreglo[i] != 0) { //si valor distinto de 0
                if (!secuencia) { // si secuencia es false
                    contador++; //sube contador total
                    secuencia = true; //secuencia verdadero
                }
            }else{ //al ver un valor igual a 0
                secuencia = false; //reiniciar secuencia
            }
        }
        
        return contador;
    }

    public static int devolverPosicionInicialSecuencia(int[] arreglo, int valorUsuario){
        int inicio = 0;
        int i = valorUsuario;

        if (arreglo[valorUsuario] != 0) {
            while (arreglo[i] != 0) {
                inicio = i;    
                i--;
            }
            return inicio;
        } else{
            return -1;
        }
        
    }

    public static int devolverPosicionFinalSecuencia(int[] arreglo, int valorUsuario){
        int fin = 0;
        int i = valorUsuario;
        
        while (arreglo[i] != 0) {
            fin = i;    
            i++;
        }
        return fin;
    }
}