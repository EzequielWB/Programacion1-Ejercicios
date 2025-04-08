package Practico5;

public class Ejercicio28 {
    public static void main(String[] args) {
        int arreglo[] = {0, 2, 3, 5, 0, 1, 4, 8, 0, 9, 1, 2, 3, 0, 6, 7, 0, 2, 3, 0};
        int arregloReferencia[] = {9,1,2,3};

        borrarSecuenciaHallada(arreglo, arregloReferencia);
        mostrarArreglo(arreglo);

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
    }   

    public static boolean buscarSecuencia(int[]arreglo, int[]arregloReferencia){
        int contadorSecuencia = 0;
        boolean existeSecuencia = false;
        int j = 0;

        for(int i=0;i<arreglo.length;i++){
            if ((arreglo[i] == arregloReferencia[j])) {
                if (arreglo[i] == arregloReferencia[j]) {
                    contadorSecuencia++;
                    j++;
                    if (contadorSecuencia == arregloReferencia.length) {
                        existeSecuencia = true;
                        i = arreglo.length - 1;
                    }
                }
            }
        }
        return existeSecuencia;
    }

    public static void borrarSecuencia(int[] arreglo, int[]arregloReferencia, int posIni){
        int posicion = posIni;
        for(int i = 0; i<arregloReferencia.length;i++){
            corrimientoIzquierda(arreglo, posicion);
            posicion++;
        }
    }

    public static void borrarSecuenciaHallada(int[] arreglo, int[]arregloReferencia){
        int i=0;
        if (buscarSecuencia(arreglo, arregloReferencia)) {
            while(i<arreglo.length){
                if(arreglo[i] == arregloReferencia[0]){
                    borrarSecuencia(arreglo, arregloReferencia, i);
                    i = arreglo.length -1;
                }
                i++;
            }
        } else{
            System.out.println("No se encontró la secuencia.");
        }
    }
}
