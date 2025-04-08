package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio14 {
    public static void main(String[] args) {
        int valorIngresado, contadorPares = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            for (int i = 0; i < 10;i++){
                System.out.println("Ingrese valor entero positivo: Contador: "+i);
                valorIngresado = Integer.valueOf(entrada.readLine());
                if (valorIngresado > 0){
                    if (valorIngresado % 2  == 0){
                        contadorPares++;
                    }
                }else{
                    System.out.println("Error: no ingreso valor entero positivo");
                    i--; //reducir contador para poder seguir la logica
                }
            }
            System.out.println("El total de pares que escribio es: "+contadorPares);

        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }    
    }
}
