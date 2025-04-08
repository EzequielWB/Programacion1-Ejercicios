package Practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio18 {
     public static void main(String[] args) { //MAIN
        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorIngresado;

        mostrarArreglo(arreglo);
        System.out.println("Ingrese valor: ");
        try {
            valorIngresado = Integer.parseInt(entrada.readLine());

            corrimientoIzquierda(arreglo, valorIngresado);
            mostrarArreglo(arreglo);

        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static void mostrarArreglo(int arreglo[]){
        for (int i = 0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }
    public static void corrimientoIzquierda(int arreglo[] ,int posicion){
        for(int i = posicion;i<arreglo.length-1;i++){
            arreglo[i] = arreglo[i+1];
        }
    }
}
