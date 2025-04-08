package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio15 {
    public static void main(String[] args) {
        int valorIngresado, valorMasAlto = Integer.MIN_VALUE, valorMasBajo=Integer.MAX_VALUE, suma = 0, contador = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese valor entero. Ingrese 0 para cerrar: ");
        try{
            valorIngresado = Integer.valueOf(entrada.readLine());

                while(valorIngresado != 0){
                    suma += valorIngresado;
                    contador++;

                    if (valorIngresado >= valorMasAlto){
                        valorMasAlto = valorIngresado;
                              
                    }if (valorIngresado <= valorMasBajo){
                        valorMasBajo = valorIngresado;

                    }
                System.out.println("Ingrese valor entero. Ingrese 0 para cerrar: ");
                valorIngresado = Integer.valueOf(entrada.readLine());
                }
                System.out.println("El promedio de "+suma+"/"+contador+" es : "+(suma / contador));
                System.out.println("El valor mas alto fue: "+valorMasAlto+", el valor mas bajo fué: "+valorMasBajo);
        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}
