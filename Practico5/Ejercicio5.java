package Practico5;

public class Ejercicio5 {
    public static void main(String[] args) {
        final int MAX = 5;
        char arregloCargado[] = {'a','b','c','d','e'};
        
            mostrarArreglo(arregloCargado);
            invertirArreglo(arregloCargado);
            System.out.println("Arreglo invertido: ");   
            mostrarArreglo(arregloCargado);

    }
       
    public static void invertirArreglo(char arregloCargado[]){
        int inicio = 0;
        int fin = arregloCargado.length -1;
        while (inicio < fin) {
            char temp = arregloCargado[inicio];
            arregloCargado[inicio] = arregloCargado[fin];
            arregloCargado[fin] = temp;

            inicio++;
            fin--;
        }
    }
    public static void mostrarArreglo(char arreglo[]){
        for(int i = 0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }
}
