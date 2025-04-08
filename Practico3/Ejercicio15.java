package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio15 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorUsuario;

        System.out.println("Ingrese un valor para sacar su sumatoria: ");
        try {
            valorUsuario = Integer.parseInt(entrada.readLine());
            System.out.println("El total de la sumatoria es: "+sumatoria(valorUsuario));
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    public static int sumatoria(int valorIngresado){
        return (valorIngresado * (valorIngresado + 1)) / 2;
    }
}
