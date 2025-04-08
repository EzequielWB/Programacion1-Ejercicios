package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) {
        int valorIngresado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println ("Ingrese valor entero distinto de 0: ");
        try {
            valorIngresado = Integer.valueOf(entrada.readLine());
            while(valorIngresado != 0){
                System.out.println(sumatoria200Naturales());
                System.out.println("Ingrese un nuevo valor: ");
                valorIngresado = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }

    public static int sumatoria200Naturales(){
        //int totalSumatoria = 0;
            //for(int i=1;i<=200;i++){
                //totalSumatoria = totalSumatoria + i;
            //}
        return (200 * 201)/2;
    }
}
