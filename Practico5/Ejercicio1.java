package Practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arregloDatos = new int[15];
        int valorIngresado;
        final int limiteBucle = 15;

        System.out.println("Ingrese valores entre 1 y 12: ");
        try {
            for(int i = 0;i<limiteBucle;i++){
                valorIngresado = Integer.parseInt(entrada.readLine());
                    if (valorIngresado >= 1 && valorIngresado <= 12) {
                        arregloDatos[i] = valorIngresado;
                    }else{
                        System.out.println("Fuera de rango, intente denuevo:");
                        i--;
                    }
            }
            mostrarArreglo(arregloDatos, limiteBucle);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void mostrarArreglo(int arreglo[],int limiteBucle){
        for(int i = 0;i<limiteBucle;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }
}
