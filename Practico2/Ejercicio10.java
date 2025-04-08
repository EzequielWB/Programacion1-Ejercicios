package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero, suma = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese numero: ");
        try{
            numero = Integer.valueOf(entrada.readLine());
                
            while(numero >= 1 && numero <= 10){
                suma += numero;
                System.out.println("Ingrese otro numero: ");
                numero = Integer.valueOf(entrada.readLine());
            }
            System.out.println("El total es: "+suma);

        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}
