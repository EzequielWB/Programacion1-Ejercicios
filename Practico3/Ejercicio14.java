package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio14 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter;

        System.out.println("Ingrese un caracter distinto de * para continuar: ");
        try {
            caracter = entrada.readLine().charAt(0);
            while (caracter != '*') {
                esDigitoOMinuscula(caracter);
                System.out.println("Ingrese otro valor: ");
                caracter = entrada.readLine().charAt(0);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void esDigitoOMinuscula (char caracter){
        if (Character.isDigit(caracter)) {
            System.out.println("Es digito.");
        } else if(Character.isLowerCase(caracter)){
            if (esVocal(caracter)) {
                System.out.println("Es minuscula vocal.");
            } else {
                System.out.println("Es minuscula consonante.");
            }
        } else{
            System.out.println("No es ni digito ni minuscula.");
        }
    }

    public static boolean esVocal(char caracter){
        boolean esVocal = false;
            if (caracter == 'a' ||caracter == 'e' ||caracter == 'i' ||caracter == 'o' ||caracter == 'u') {
                esVocal = true;
            }
        return esVocal;
    }
}
