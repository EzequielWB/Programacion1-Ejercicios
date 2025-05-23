package Practico5;

public class Ejercicio26 {
    public static void main(String[] args) {
        int arreglo[] = {0, 2, 3, 5, 0, 1, 4, 8, 0, 9, 1, 2, 3, 0, 6, 7, 0, 2, 3, 0};

        buscarMayorSecuencia(arreglo);
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

    public static void buscarMayorSecuencia(int[] arreglo){
        int posIni = buscarPosicionCeroIni(arreglo);
        int contadorSecuencia = 0, contadorFinal = 0;
        int i = posIni;
        int posFinal = 0;
        int finalGuardado = 0, inicioGuardado = 0;

        while (i<arreglo.length) {
            if (arreglo[i] != 0) {
                posIni = i;
                while (arreglo[i] != 0) {
                    contadorSecuencia++;
                    i++;
                    posFinal = i - 1;
                }
            }
            if (contadorSecuencia > contadorFinal) {
                contadorFinal = contadorSecuencia;
                finalGuardado = posFinal;
                inicioGuardado = posIni;
            }
            contadorSecuencia = 0;   
            i++;
        }
        System.out.println("Posicion inicial: "+inicioGuardado+ " | Posicion Final: "+finalGuardado+" | Largo : "+contadorFinal);
    }
}
