package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter;
        int valorPrimero, valorSegundo;

        System.out.println("Ingrese un numero entero: ");
        try {
            valorPrimero = Integer.parseInt(entrada.readLine());
            System.out.println("Ingrese segundo valor entero: ");
            valorSegundo = Integer.parseInt(entrada.readLine());
            System.out.println("Ingrese caracter para seleccionar opcion (a. suma | b. resta | c. multiplicar | d. división)");
            caracter = entrada.readLine().charAt(0);

            switch (caracter) {
                case 'a':
                    System.out.println("Resultado: "+sumaValores(valorPrimero, valorSegundo));
                 break;
                
                case 'b':
                    System.out.println("Resultado: "+restaValores(valorPrimero, valorSegundo));
                break;

                case 'c':
                    System.out.println("Resultado: "+multValores(valorPrimero, valorSegundo));
                break;
                
                case 'd':
                    if (valorSegundo != 0){
                        System.out.println("Resultado: "+divisionValores(valorPrimero, valorSegundo));
                    } else{
                        System.out.println("Error, no se puede dividir por 0");
                    }
                break;
                default:
                    System.out.println("Error, valor no reconocido.");
                break;
            }

        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }

    public static int sumaValores (int valorPrimero, int valorSegundo){
        return valorPrimero + valorSegundo;
    }
    public static int restaValores (int valorPrimero, int valorSegundo){
        return valorPrimero - valorSegundo;
    }
    public static int multValores (int valorPrimero, int valorSegundo){
        return valorPrimero * valorSegundo;
    }
    public static double divisionValores (int valorPrimero, int valorSegundo){
        return (double)valorPrimero / valorSegundo;
    }
}
