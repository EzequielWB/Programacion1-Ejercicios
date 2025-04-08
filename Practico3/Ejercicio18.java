package Practico3;

public class Ejercicio18 {
    public static void main(String[] args) {
        final int valorINICIO = 2;
        final int valorFINAL = 10000; 

            for(int i = valorINICIO;i<valorFINAL;i++){
                mostrarPerfectos(i);
            }

    }

    public static void mostrarPerfectos(int valor){
        int sumatoria = 0;
        for(int i=1 ; i<=valor/2 ; i++){ // "Ningun divisor propio sera mayor a la mitad del numero" | mi solucion: (int i=1; i<valor;i++)
            if (valor % i == 0) {
                sumatoria += i;
            }
        }
        if (sumatoria == valor) {
            System.out.println("Numero perfecto: "+valor);
        }
    }
}
