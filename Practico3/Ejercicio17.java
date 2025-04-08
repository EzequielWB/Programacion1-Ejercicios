package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio17 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter;
        int valorUsuario;

        try {

            System.out.println("Ingrese caracter letra minuscula: ");
            while (Character.isLowerCase ( (caracter = entrada.readLine().charAt(0))) ) {
                System.out.println("Ingrese valor entre 1 y 5 para ver su tabla: ");
                valorUsuario = Integer.parseInt(entrada.readLine());
                
                if (valorUsuario >= 1 && valorUsuario <= 5) {     
                    mostrarTablas(valorUsuario);
                }else{
                    System.out.println("Fuera de rango, tiene que ser entre 1 y 5");
                }

                System.out.println("Ingrese caracter letra minuscula: ");
            }
            System.out.println("No es caracter letra minuscula, saliendo del programa.");    

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void mostrarTablas(int valor){
        for(int i=1;i<=10;i++){
            System.out.println(valor+" x "+i+" = "+valor*i);
        }
    }
}
