package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;  

public class Ejercicio3 {
    public static void main(String[] args) {
        int valor;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{

            System.out.println("Ingrese valor mayor a 50: ");
            valor = Integer.valueOf(entrada.readLine());

                if (valor > 50) {
                    if ( (valor % 2 == 0) || (valor % 3 == 0) ) {
                        System.out.println("El valor "+valor+" es multiplo de 2 o 3");
                    } else {
                        System.out.println("No es multiplo de 2 o 3");
                    }
                } else{
                    System.out.println("Valor menor a 50");
                }

        }catch (Exception exc) {
            System.out.println("Ocurrio un error: "+exc);
        }
    }
}
