package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter;

        System.out.println("Ingrese caracter letra minuscula: ");
        try {
            caracter = entrada.readLine().charAt(0);
            
            while (caracter >= 'a' && caracter <= 'z') {
                mostrarTablaDel9();
                System.out.println("Ingrese otro caracter letra minuscula: ");
                caracter = entrada.readLine().charAt(0);
            }
            System.out.println("Cerrando programa.");

        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    public static void mostrarTablaDel9(){
        for (int i=1;i<=10;i++){
            System.out.println(i+" x 9: "+ (i*9) );
        }
    }
}


// Ingreso caracter letra minuscula
//comprobacion caracter letra minuscula
//mientras letra minuscula
    //metodo void mostrarTablaDel9()
//otro ingreso de letra

//Metodo mostrarTablaDel9()
// Desde 0 a 9
// mostrar primer valor con el 2do