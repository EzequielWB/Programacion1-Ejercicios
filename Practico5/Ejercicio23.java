package Practico5;

public class Ejercicio23 {
    public static void main(String[] args) {
        int MAX = 20;
        int arreglo[] = new int[MAX];
        int ceroIni, ceroFinal;

        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);
        System.out.println("");
        ceroIni = buscarPosicionCeroIni(arreglo);
        ceroFinal = buscarPosicionCeroFinal(arreglo, ceroIni);

        if (ceroIni != -1 && ceroFinal != -1) {
            System.out.println("Primera secuencia encontrada:");
            System.out.println("Inicio: pos " + ceroIni + ", Fin: pos " + ceroFinal);
        } else {
            System.out.println("No se encontraron secuencias distintas de ceros.");
        }
    }

    public static void cargarArreglo(int arreglo[]){ 
        for(int i = 0;i<arreglo.length;i++){
            int valorRandom = (int)(Math.random()*10);
            arreglo[i] = valorRandom;
        }
    }
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
}
