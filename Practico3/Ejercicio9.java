package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valor=0;
        char caracter;

        System.out.println("Ingrese un valor entre 1 a 10");
        try{
            valor = Integer.valueOf(entrada.readLine());
                if(valor < 1 || valor > 10){
                    System.out.println("Fuera de rango, ingrese otro numero: ");
                    valor = Integer.valueOf(entrada.readLine());
                }
            while (valor >= 1 && valor <= 10){
                    System.out.println("Ingrese un caracter: ");
                    caracter = entrada.readLine().charAt(0);

                    if (esMinuscula(caracter)) {
                        System.out.println("Es caracter minuscula.");
                    } else if(esMayuscula(caracter)){
                        System.out.println("Es caracter mayuscula.");
                    } else if (esDigito(caracter)) {
                        System.out.println("Es un caracter digito.");
                    } else{
                        System.out.println("Es otro tipo de caracter.");
                    }
            }
        }catch (Exception exc){
            System.out.println("Error: "+exc);
        } 
    }

    public static boolean esMinuscula(char caracter){
        boolean esMinuscula = false;
            if(caracter >= 'a' && caracter <= 'z'){
                esMinuscula = true;
            }
        return esMinuscula;
    }
    public static boolean esMayuscula(char caracter){
        boolean esMayuscula = false;
            if(caracter >= 'A' && caracter <= 'Z'){
                esMayuscula = true;
            }
        return esMayuscula;
    }
    public static boolean esDigito (char caracter){
        boolean esDigito = false;
            if (Character.isDigit(caracter)){
                esDigito = true;
            }
        return esDigito;
    }
}
