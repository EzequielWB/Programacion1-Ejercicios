package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio11 {
    public static void main(String[] args) {
        char caracter;
        int cuentaVocales = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un caracter letra minuscula: ");
        try{
            caracter = entrada.readLine().charAt(0);
            
            while (Character.isLowerCase(caracter)){
                if(caracter == 'a'|| caracter == 'e'|| caracter == 'i'|| caracter == 'o'|| caracter == 'u'){
                    cuentaVocales++;
                }  
                System.out.println("Ingrese otro caracter: ");
                caracter = entrada.readLine().charAt(0);
            }
            System.out.println("El total de caracteres vocales fue: "+cuentaVocales);
        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}
