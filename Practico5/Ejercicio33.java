package Practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio33 {
    
    public static void main(String[] args) {
        int arreglo[] = {0, 0, 3, 5, 0, 2, 3, 0, 3, 2, 4, 0, 1, 0, 0, 1, 2, 9, 3, 0, 0};
        int arregloVacio[] = new int[20];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorUsuario;
        
        
        System.out.println("Ingrese valor: ");
        try {
            valorUsuario = Integer.parseInt(entrada.readLine());
            encontrarSecuencias(arreglo,arregloVacio, valorUsuario);
            mostrarArreglo(arregloVacio);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print("[" + num + "] ");
        }
        System.out.println();
    }

    public static int contarLargoSecuencia(int arreglo[], int valorInicial){
        int i = valorInicial;
        int largoSecuencia = 0;

            while(i < arreglo.length){
                if (arreglo[i] != 0) {
                    i++;
                    largoSecuencia ++;
                } else{
                    i = arreglo.length;
                }
            }
                
        return largoSecuencia;
    }

    public static void encontrarSecuencias(int arreglo[],int arregloVacio[], int valorUsuario){
        int i = 0;
        
        while (i < arreglo.length) {
            int largoSecuencia = contarLargoSecuencia(arreglo, i);
            int fin = devolverPosicionFinalSecuencia(arreglo, i);
                if (largoSecuencia == valorUsuario) {
                    reemplazarArreglos(arreglo, arregloVacio, i, fin);   
                    i = fin;
                }
                i++;              
            }
    }

    public static void reemplazarArreglos(int arreglo[], int arregloVacio[], int valorInicial, int valorFinal){
        int j = 0;
        while (arregloVacio[j] != 0) {
            j++;
        }

        for(int i = valorInicial; i <= valorFinal; i++){
            arregloVacio[j] = arreglo[i];
            j++;
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
