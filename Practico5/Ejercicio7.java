package Practico5;

public class Ejercicio7 {
    public static void main(String[] args) {

        int arregloCargado[] = {1,2,3,4,5,6,7,4,9,10};
        final int N = 4;
        final int M = 10;
        
        int vecesValorEnArreglo = totalValorEnArreglo(arregloCargado, N);
        int arregloVacio[] = new int[vecesValorEnArreglo];

        cargarPosiciones(arregloCargado, arregloVacio, N);
        multiplicarIncidencias(arregloCargado, M, N);
        mostrarArreglo(arregloCargado);

    }   

    public static int totalValorEnArreglo(int arreglo[], int N){
        int incidencia = 0;
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i] == N){
                incidencia++;
            }
        }
        return incidencia;
    }

    public static void cargarPosiciones(int arreglo[],int arregloVacio[],int N){
        int posicion = 0;
        for(int i=0;i<arreglo.length;i++){
            if (arreglo[i] == N) {
                arregloVacio[posicion] = i;
            }
        }
    }

    public static void multiplicarIncidencias(int arreglo[],int M,int N){
        for(int i=0;i<arreglo.length;i++){
            if (arreglo[i] == N) {
                arreglo[i] = N*M;
            }
        }
    }

    public static void mostrarArreglo(int arreglo[]){
        for(int i=0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }
}   
