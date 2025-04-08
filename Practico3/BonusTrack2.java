package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
        String dia;
        int cantidad = 10;
        int id_producto = 1;

        System.out.println("Ingrese dia de la semana: ");
        try {
            dia = String.valueOf(entrada.readLine());
            if (dia.equals ("lunes")) {
                System.out.println("Ingrese ID del producto: ");
                id_producto = Integer.parseInt(entrada.readLine());
                System.out.println("ingrese cantidad: ");
                cantidad = Integer.parseInt(entrada.readLine());
                actualizarStock(cantidad,id_producto);
                System.out.println("Stock actualizado.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int actualizarStock(int cantidad, int id_producto){
        int stock = cantidad;
        eliminarPedido(id_producto);
        return stock;
    }

    public static void eliminarPedido(int id_producto){
        //Aca habria codigo que elimina.
    }
}
