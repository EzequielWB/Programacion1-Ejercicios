package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        int valorIngresado = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un valor mayor a 1 y menor a 10: ");
        try{
            valorIngresado = Integer.valueOf(entrada.readLine());
            if (valorIngresado > 1 && valorIngresado < 10){
                System.out.println("\nCuenta regresiva:");
                while (valorIngresado >= 0){
                    System.out.println(valorIngresado);
                    valorIngresado--;
                }
            } else {
                System.out.println("Error en valor ingresado.");
            }
        }catch (Exception exc){
            System.out.println("Error:"+exc);
        }
    }
}