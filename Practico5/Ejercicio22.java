package Practico5;

public class Ejercicio22 {
     public static void main(String[] args) { //MAIN
        int MAX = 10;
        int arreglo[] = new int[MAX];

        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);
        System.out.println("");
        buscarPares(arreglo);
        System.out.println("Arreglo sin pares:");
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
    public static void corrimientoIzquierda(int arreglo[] ,int posicion){
        for(int i = posicion;i<arreglo.length-1;i++){
            arreglo[i] = arreglo[i+1];
        }
        arreglo[arreglo.length - 1] = 0;
    }
    public static void buscarPares(int[] arreglo){
        int i =0;
        while(i<arreglo.length){
            if ( (esPar(arreglo[i])) && arreglo[i] != 0) {
                corrimientoIzquierda(arreglo, i);
            }else{
                i++;
            }
        }
    }

    public static boolean esPar(int valor){
        return (valor % 2 == 0);
    }
}
