package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio20 {
    public static void main(String[] args) {
        int valorIngresado, valorAscIngresado, valorAlmacenado = 0,comprobacionAscendente = 0;
        char caracter;
        Double valorPrimero, valorSegundo;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero entero positivo distinto de 0");
            try {
                valorIngresado = Integer.valueOf(entrada.readLine());

                while (valorIngresado != 0 && valorIngresado > 0){
                    System.out.println("Ingrese caracter (a,b,c): ");
                    caracter = entrada.readLine().charAt(0);

                    switch (caracter) {

                        case 'a':
                            System.out.println("Escriba un texto libre: ");
                            String textoLibre = String.valueOf(entrada.readLine());
                            System.out.println(textoLibre);
                        break;

                        case 'b':
                            System.out.println("Ingrese 5 numeros positivos: ");
                            for (int i=0;i<5;i++){
                            valorAscIngresado = Integer.valueOf(entrada.readLine());
                                if(valorAscIngresado >0){
                                    if(valorAscIngresado > valorAlmacenado){
                                        comprobacionAscendente++;
                                        valorAlmacenado = valorAscIngresado;
                                    }
                                } else{
                                    System.out.println("Error numero ingresado. No es positivo");
                                    i--;
                                }
                            }
                            if (comprobacionAscendente == 5){
                                System.out.println("Fueron ingresados en orden ascendente.");
                            }else{
                                System.out.println("No fueron ingresados en orden ascendente.");
                            }
                            valorAlmacenado = 0;
                            comprobacionAscendente = 0;
                        break;

                        case 'c':
                            System.out.println("Ingrese un numero entero negativo");
                            valorPrimero = Double.valueOf(entrada.readLine());
                            System.out.println("Ingrese otro numero entero negativo");
                            valorSegundo = Double.valueOf(entrada.readLine());

                            if(valorPrimero <0 && valorSegundo<0){
                                System.out.println("La raiz cuadrada es: "+(Math.sqrt(valorPrimero/valorSegundo)));
                            }else{
                                System.out.println("Error, un numero no es entero negativo");
                            }
                        break;

                        default:
                            System.out.println("Error. Ingrese otro caracter");
                        break;
                    }
                    System.out.println("Ingrese un numero entero positivo distinto de 0");
                    valorIngresado = Integer.valueOf(entrada.readLine());
                }
            } catch (Exception e) {
                System.out.println("Error" +e);
            }
    }
}
