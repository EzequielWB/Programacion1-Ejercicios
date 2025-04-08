package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio16 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorIngresado;

        try {
            while (true) {
                System.out.println("Ingrese mes del año: ");
                valorIngresado = Integer.parseInt(entrada.readLine());

                if (valorIngresado < 1 || valorIngresado > 12) {
                    System.out.println("Fuera de rango. Cerrando programa.");
                    break;
                }
                System.out.println("Los dias del mes son: "+obtenerDiasMes(valorIngresado));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int obtenerDiasMes(int mes){
            if (mes == 2) {
                return 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return 30;
            } else {
                return 31;
            }
        }
    }
