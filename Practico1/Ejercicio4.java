package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio4 { //public class IngresoEnterosMostrarInverso
    
    public static void main (String[]args) {

        int valor1, valor2, valor3, valor4, valor5 ;

    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese primer valor :");
        valor1 = Integer.valueOf(entrada.readLine());

        System.out.println("Ingrese segundo valor :");
        valor2 = Integer.valueOf(entrada.readLine());

        System.out.println("Ingrese tercer valor: ");
        valor3 = Integer.valueOf(entrada.readLine());

        System.out.println("Ingrese cuarto valor: ");
        valor4 = Integer.valueOf(entrada.readLine());

        System.out.println("Ingrese quinto valor: ");
        valor5 = Integer.valueOf(entrada.readLine());

        System.out.println("Valores originales: " +valor1+" , "+valor2+" , "+valor3+" , "+valor4+" , "+valor5);
        System.out.println("Valores invertidos: " +valor5+" , "+valor4+" , "+valor3+" , "+valor2+" , "+valor1);

    } catch (Exception exc){
        System.out.println(exc);
    }

    }
}
