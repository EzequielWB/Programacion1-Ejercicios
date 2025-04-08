package Practico5;

public class Ejercicio16 {
    public static void main(String[] args) { //MAIN
        final int MAX = 10;
        int arreglo[] = new int[MAX];

        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);
        System.out.println("Corrido a la Izquierda.");
        corrimientoIzquierda(arreglo, 2);
        mostrarArreglo(arreglo);
    }

    public static void cargarArreglo(int arreglo[]){
        for(int i = 0;i<arreglo.length;i++){
            int valorRandom = (int)(Math.random()*10)+1;
            arreglo[i] = valorRandom;
        }
    }

    public static void mostrarArreglo(int arreglo[]){
        for (int i = 0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }

    public static void corrimientoIzquierda(int[] arreglo, int posicion){
        for(int i = posicion; i<arreglo.length-1 ; i++){
            arreglo[i] = arreglo[i+1];
        }
    }
}
