package Practico5;

public class Ejercicio6 {
    public static void main(String[] args) {

        int arregloCargado[] = {1,2,3,4,5,6,7,8,9,10};

        mostrarArreglo(arregloCargado);
        System.out.println("Cantidad de pares: "+buscarParesEnArreglo(arregloCargado));
    }

    public static void mostrarArreglo(int arreglo[]){
        for(int i=0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }

    public static int buscarParesEnArreglo(int arreglo[]){
        int contadorPares = 0;
        for(int i=0;i<arreglo.length;i++){
            if (arreglo[i] % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }
}   
