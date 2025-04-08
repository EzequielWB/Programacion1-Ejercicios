package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorIngresado;

        System.out.println("Ingrese un valor entre 1 y 10: ");
        try {   
            valorIngresado = Integer.parseInt(entrada.readLine());
            while (valorIngresado >=1 && valorIngresado <= 10) {

                if (esMultiplo(valorIngresado, 3)) {
                    System.out.println("Ingrese un caracter: ");
                    char caracter = entrada.readLine().charAt(0);
                        if (esMinuscula(caracter)) {
                            System.out.println("Letra minuscula.");
                        }else if(esMayuscula(caracter)){
                            System.out.println("Letra mayuscula.");
                        }else if(esDigito(caracter)){
                            System.out.println("Es digito.");
                        } else{
                            System.out.println("Otro");
                        }
                }

                if (esMultiplo(valorIngresado, 5)) {
                    tablaMultiplicar(valorIngresado);
                }

                System.out.println("Ingrese otro valor (menor a 1 o mayor 10 para salir): ");
                valorIngresado = Integer.parseInt(entrada.readLine());
            }    
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    public static void tablaMultiplicar(int valorIngresado){
        System.out.println("Tabla de multiplicar de "+valorIngresado+": ");
        for(int i=1;i<=10;i++){
            System.out.println(valorIngresado+" x "+i+": "+(valorIngresado * i));
        }
    }
    
    public static boolean esMultiplo(int valorComparado, int valorMultiplo){
            return valorComparado % valorMultiplo == 0;
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
