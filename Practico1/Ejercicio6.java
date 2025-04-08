package Practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6 { // class crearFacturas
    
    public static void main(String[] args) {
        
        String nombre,producto1, producto2,factura;
        int numero;
        Float importe1,importe2,total;

        try{

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese nombre: ");
            nombre = String.valueOf(entrada.readLine());

            System.out.println("Ingrese tipo factura: ");
            factura = String.valueOf(entrada.readLine());

            System.out.println("Ingrese numero: ");
            numero = Integer.valueOf(entrada.readLine());

            System.out.println("ingrese primer producto: ");
            producto1 = String.valueOf(entrada.readLine());

            System.out.println("Ingrese importe: ");
            importe1 = Float.valueOf(entrada.readLine());

            System.out.println("ingrese segundo producto: ");
            producto2 = String.valueOf(entrada.readLine());

            System.out.println("Ingrese importe: ");
            importe2 = Float.valueOf(entrada.readLine());

            total = importe1 + importe2;

            System.out.println("Factura: " +factura+ "N"+numero);
            System.out.println("Nombre: "+nombre);
            System.out.println("Producto            Importe");
            System.out.println(producto1+"          "+importe1);
            System.out.println(producto2+"          "+importe2);
            System.out.println("Importe total:"+total);

        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
