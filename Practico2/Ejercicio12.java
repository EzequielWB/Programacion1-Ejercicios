package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        char caracterIngresado, caracterMayor, caracterMenor;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese caracter letra minuscula: ");
        try{
            caracterIngresado = entrada.readLine().charAt(0);
            caracterMayor = caracterIngresado; //ponemos los valores ingresados para tener una base al comparar
            caracterMenor = caracterIngresado;

                while (caracterIngresado >= 'a' && caracterIngresado <= 'z'){

                        if (caracterIngresado > caracterMayor){
                            caracterMayor = caracterIngresado;
                        }
                        if (caracterIngresado < caracterMenor){
                            caracterMenor = caracterIngresado;
                        }

                    System.out.println("Ingrese otro caracter letra minuscula: ");
                    caracterIngresado = entrada.readLine().charAt(0);
                }
                System.out.println("El caracter mas grande fue: "+caracterMayor+" ,el mas pequeño fue: "+caracterMenor);

        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }    
}
