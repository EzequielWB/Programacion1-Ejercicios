package Practico5;

public class Ejercicio15 {
    public static void main(String[] args) { //MAIN
        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};


        mostrarArreglo(arreglo);
        System.out.println("Corrido a la derecha.");
        corrimientoDerecha(arreglo, 6);
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

    public static void corrimientoDerecha(int[] arreglo, int posicion){
        for(int i = arreglo.length-1; i>posicion ; i--){
            arreglo[i] = arreglo[i-1];
        }
    }
}
