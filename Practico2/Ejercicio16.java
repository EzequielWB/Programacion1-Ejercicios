package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio16 {
    public static void main(String[] args) {
        char caracter = ' ';
        int secuenciaMaxima = 0,secuenciaActual = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i=0;i<15;i++){
            System.out.println("Ingrese caracter: ");
            try{
                caracter = entrada.readLine().charAt(0);
            }catch(Exception exc){
                System.out.println("Error" +exc);
            }
            if (caracter == 'a'){
                secuenciaActual++;
                if (secuenciaActual > secuenciaMaxima){
                    secuenciaMaxima = secuenciaActual;
                }
            } else{
                secuenciaActual = 0;
            }
            
        }
        System.out.println("La mayor cantidad de caracteres 'a' fue: "+secuenciaMaxima);
            
    }
}
