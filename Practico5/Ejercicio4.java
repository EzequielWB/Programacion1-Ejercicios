package Practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char arreglo[] = {'a','e','h','j','f','d','r','y','u','f'};
        char caracterIngresado;
        boolean existeValor = false;

        System.out.println("Ingrese un valor a buscar en el arreglo: ");
        try {
            caracterIngresado = entrada.readLine().charAt(0);
            for (int i=0;i<arreglo.length;i++){
                if (caracterPresente(caracterIngresado, arreglo, i)) {
                    System.out.println("Está presente en la posición: [" +i+"]");
                    existeValor = true;
                }
            }
            if (!existeValor) {
                System.out.println("No se encontró el valor en el arreglo.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static boolean caracterPresente(char caracterIngresado, char arreglo[],int i){

        return arreglo[i] == caracterIngresado;
    }
}
