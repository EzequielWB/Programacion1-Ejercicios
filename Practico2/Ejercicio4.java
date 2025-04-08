package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        int numero, calculo;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Ingrese numero entre 0 y 999: ");
            numero = Integer.valueOf(entrada.readLine());
            calculo = numero/10;

                if(numero >= 0 && numero <1000){
                    if (calculo >= 10){
                        System.out.println("Es un numero de 3 digitos, el valor es: "+numero);
                    } else if (calculo < 10 && calculo >= 1){
                        System.out.println("Es un numero de 2 digitos");
                    }else{
                        System.out.println("Es un numero de 1 digito");
                    }
                } else {
                    System.out.println("Error con numero ingresado");
                }

        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}
