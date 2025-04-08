package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) {

        char caracter = '-';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese caracter: ");
        try{
            caracter = entrada.readLine().charAt(0);
        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
        
        while(caracter != '*'){
            if (Character.isDigit(caracter)) {
              System.out.println("Es digito");  
            } else{
                switch(caracter){
                    case 'a','e','i','o','u' : 
                        System.out.println("Es una vocal minuscula");
                    break;
                    default:
                        System.out.println("No es ni digito ni vocal minuscula");
                    break;
                }
            }
            System.out.println("Ingrese otro caracter: ");
            try{
                caracter = entrada.readLine().charAt(0);
            }catch (Exception exc){
                System.out.println("Error: "+exc);
            }
        }
        System.out.println("Programa terminado.");       
    }    
}
