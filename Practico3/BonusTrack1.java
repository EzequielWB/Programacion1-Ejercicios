package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        final int limiteMAX = 20;
        int id = 0, cantidad = 0, cantidadVendida = 0;
        String nombre = " ", fecha = " ", hora = " ",prioridad = " ";
        boolean continuar = false;
        
        try {
            while(continuar == false){ //control de carga
                System.out.println("Ingrese ID del articulo: ");
                id = Integer.parseInt(entrada.readLine());
                System.out.println("Ingrese nombre del articulo: ");
                nombre = String.valueOf(entrada.readLine());
                System.out.println("Ingrese la fecha del dia de hoy: ");
                fecha = String.valueOf(entrada.readLine());
                System.out.println("Ingrese la hora: ");
                hora = String.valueOf(entrada.readLine());
                System.out.println("Ingrese la cantidad del producto: ");
                cantidad = Integer.parseInt(entrada.readLine());

                System.out.println("ID: "+id+
                "\nNombre: "+nombre+
                "\nFecha: "+fecha+
                "\nHora: "+hora+
                "\nCantidad: "+cantidad);
                System.out.println("Es esto correcto? (1. Si | 2. No): ");
                int validacion = Integer.parseInt(entrada.readLine());
                    if (validacion == 1 ) {
                        continuar = true;
                    }
            }

            if (verSiQuedaProducto(cantidad, limiteMAX)) {
                System.out.println("No hay mas unidades de producto ID: "+id+", Producto: "+nombre);
                cantidad = 0;
                System.out.println("Actualice la fecha: ");
                fecha = String.valueOf(entrada.readLine());
                System.out.println("Actualice la hora: ");
                hora = String.valueOf(entrada.readLine());

            }else if(superaCantidadMAX(cantidad, limiteMAX)){
                System.out.println("Supera el limite de seguridad.");
                prioridad = "Baja";
                System.out.println("ID: "+id+
                "\nNombre: "+nombre+
                "\nFecha: "+fecha+
                "\nHora: "+hora+
                "\nPrioridada: "+prioridad);
            } else{

                if (verificarLimiteSeguridadMedio(cantidad, limiteMAX)) {
                    prioridad = "Media";
                    System.out.println("Debajo del limite de seguridad del 30%");
                    System.out.println("Actualice la cantidad:");
                    cantidad = Integer.parseInt(entrada.readLine());
                    System.out.println("Actualice la fecha: ");
                    fecha = String.valueOf(entrada.readLine());
                    System.out.println("Actualice la hora: ");
                    hora = String.valueOf(entrada.readLine());
                }
                
                if(verificarLimiteSeguridadAlto(cantidad, limiteMAX)){
                    prioridad = "Alta";
                    System.out.println("Debajo del limite de seguridad del 70%");
                    System.out.println("Actualice la cantidad:");
                    cantidad = Integer.parseInt(entrada.readLine());
                    System.out.println("Actualice la fecha: ");
                    fecha = String.valueOf(entrada.readLine());
                    System.out.println("Actualice la hora: ");
                    hora = String.valueOf(entrada.readLine());
                }
            }

            getStock(cantidad, cantidadVendida);
            System.out.println("Ingrese cantidad vendida: ");
            cantidadVendida = Integer.parseInt(entrada.readLine());
            if (cantidadVendida > cantidad) {
                System.out.println("Supera la cantidad vendida, en stock queda: "+cantidad);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean superaCantidadMAX(int cantidad, int limiteMAX){
        boolean comprobacion = false;
        if (cantidad > limiteMAX) {
            comprobacion = true;
        }
        return comprobacion;
    }

    public static boolean verificarLimiteSeguridadMedio(int cantidad, int limiteMAX){
        boolean comprobacion = false;
        if (cantidad < (limiteMAX * 0.70)) {
            comprobacion = true;
        }
        return comprobacion;
    }

    public static boolean verificarLimiteSeguridadAlto(int cantidad, int limiteMAX){
        boolean comprobacion = false;
        if (cantidad < (limiteMAX * 0.30)) {
            comprobacion = true;
        }
        return comprobacion;
    }

    public static boolean verSiQuedaProducto(int cantidad, int limiteMAX){
        boolean comprobacion = false;
        if (cantidad == 0) {
            comprobacion = true;
        }
        return comprobacion;
    }

    public static int getStock(int id,int cantidad){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese ID de producto: ");
        try {
            id = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
           System.out.print(e);
        }
        return cantidad;
    }

}
