package Practico5;

public class Ejercicio12 {
    public static void main(String[] args) {
        final int MAXA = 10;
        final int MAXB = 5;
        int arregloA[] = {1,2,3,4,5,6,7,8,9,10};
        int arregloB[] = new int[MAXB];   
        
        cargarArregloRandom(arregloB,MAXA);
        System.out.println("El total es: "+calcularSumaValores(arregloA, arregloB, MAXB));
    }

    public static void cargarArregloRandom(int arreglo[], int MAXA){
        for (int i = 0;i<arreglo.length;i++){
            int valorRandom = (int) (Math.random() * MAXA);
            arreglo[i] = valorRandom;
        }
    }

    public static int calcularSumaValores(int arregloA[], int arregloB[], int MAXB){
        int suma = 0;
        for(int i = 0;i<MAXB;i++){
            suma += arregloA[arregloB[i]];
        }
        return suma;
    }
}
