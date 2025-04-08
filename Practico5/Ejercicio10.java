package Practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) {
        int arregloCargado[] = new int[100];
        int N;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        cargarArregloRandom(arregloCargado);
        mostrarArreglo(arregloCargado);

        System.out.println("Ingrese valor de numeros primos: ");
        try {
            N = Integer.valueOf(entrada.readLine());
            if (verificarPrimos(arregloCargado, N)) {
                System.out.println("Se encuentra esa cantidad en primos.");
            }else{
                System.out.println("No se encuentra o sobrepasa esa cantidad en primos.");
            }
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static void cargarArregloRandom(int arreglo[]){
        for (int i = 0;i<arreglo.length;i++){
            int valorRandom = (int) (Math.random() * 101);
            arreglo[i] = valorRandom;
        }
    }
    public static void mostrarArreglo(int arreglo[]){
        for (int i = 0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }

    public static boolean verificarPrimos(int arreglo[],int topeUsuario){
        int contadorPrimos = 0;
        for (int i = 0;i<arreglo.length;i++){
            if (esPrimo(arreglo[i])) {
                contadorPrimos++;
            }
        }
        if (contadorPrimos >= topeUsuario) {
            return true;
        }
        System.out.println("Total de primos: "+contadorPrimos);
        return false;
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
