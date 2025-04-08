package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio13 {
    public static void main(String[] args) {
        int valorIngresado;
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese caracter letra minuscula");
        try{
            caracter = entrada.readLine().charAt(0);
                while(Character.isLowerCase(caracter)){
                    System.out.println("Ingrese valor entre 1 y 5");
                    valorIngresado = Integer.valueOf(entrada.readLine());
                        if (valorIngresado >= 1 && valorIngresado <= 5){
                            System.out.println("Tabla de multiplicar de: "+valorIngresado);
                            for (int i = 1; i <= 10; i++ ){
                                System.out.println(valorIngresado+" x "+i+": "+(valorIngresado * i));
                            }
                        } else{
                            System.out.println("Ingreso un valor fuera de rango.");
                        }
                    System.out.println("Ingrese otro caracter letra minuscula: ");
                    caracter = entrada.readLine().charAt(0); 
                }
        } catch(Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}
