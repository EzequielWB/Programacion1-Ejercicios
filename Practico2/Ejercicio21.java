package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio21 {
    public static void main(String[] args) {
        int valorIngresado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un número entero: ");
        try {
            valorIngresado = Integer.parseInt(entrada.readLine());

            // Verificar si el número es primo
            boolean esPrimo = true;
            if (valorIngresado <= 1) {
                esPrimo = false; // Los números menores o iguales a 1 no son primos
            } else {
                for (int i = 2; i <= Math.sqrt(valorIngresado); i++) {
                    if (valorIngresado % i == 0) {
                        esPrimo = false; // Si es divisible por algún número, no es primo
                        break;
                    }
                }
            }

            // Mostrar el resultado
            if (esPrimo) {
                System.out.println("El número ingresado es primo.");
            } else {
                System.out.println("El número ingresado NO es primo.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero válido.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
