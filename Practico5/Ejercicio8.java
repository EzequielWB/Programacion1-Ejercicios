package Practico5;

public class Ejercicio8 {
    public static void main(String[] args) {
        int arregloCargado[] = {1,2,3,4,5,6,7,8,9};

        if (verificarAscendente(arregloCargado)) {
            System.out.println("Hay ascendencia.");
        } else{
            System.out.println("No hay ascendencia.");
        }
    }

    public static boolean verificarAscendente(int arreglo[]){
            for(int i = 0;i<arreglo.length - 1;i++){
                if ( arreglo[i] > arreglo[i+1]) {
                    return false;
                }
        }
        return true;
    }
}
