package Practico5;

public class Ejercicio25 {
    public static void main(String[] args) {
        int arreglo[] = {0, 2, 3, 5, 0, 1, 4, 8, 0, 9, 1, 2, 3, 0, 6, 7, 0, 2, 3, 0};

        System.out.println("Secuencias: "+recorrerYContarArreglo(arreglo));
        buscarAnteultimaSecuencia(arreglo);

    } // METODOS

    public static void mostrarArreglo(int arreglo[]){
        for (int i = 0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }

    public static int buscarPosicionCeroIni(int[] arreglo){
        for(int i = 0;i<arreglo.length;i++){
            if (arreglo[i] != 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static int buscarPosicionCeroFinal(int[] arreglo, int posCeroIni){
        if (posCeroIni == -1) {
            return -1; //si no habia cero para empezar, no devuelve
        }
        for(int i = posCeroIni;i<arreglo.length;i++){
            if (arreglo[i] == 0) {
                return i - 1; //devuelve valor antes de 0
            }
        }
        return arreglo.length - 1; //llega a final de secuencia
    }

    public static int recorrerYContarArreglo(int[] arreglo){
        int contador = 0;
        int posIni = buscarPosicionCeroIni(arreglo);
        int i = posIni;

        while(i<arreglo.length){
            if (arreglo[i] == 0) {
                contador++;
            }
            i++;
        }
        return contador;
    }

    public static void buscarAnteultimaSecuencia(int[] arreglo){
        int contador = recorrerYContarArreglo(arreglo);
        int posIni = buscarPosicionCeroIni(arreglo);
        int vueltas = 0;
        int i = posIni;
        int posFinal = 0;

        while (vueltas<(contador - 1)) {
            if (arreglo[i] != 0) {
                posIni = i;
                while (arreglo[i] != 0) {
                    i++;
                    posFinal = i - 1;
                }
            }
            vueltas++;
            i++;
        }
        System.out.println("Posicion inicial: "+posIni+ " | Posicion Final: "+posFinal);
    }
}
