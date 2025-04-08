package Practico5;

public class Ejercicio30 {
    public static void main(String[] args) {
        int arregloA[] = {0, 3, 3, 5, 0, 2, 3, 8, 0};
        int arregloP[] = {0, 2, 3};
        int arregloR[] = {9, 9, 9};

        System.out.println("Arreglo original:");
        mostrarArreglo(arregloA);
        
        reemplazarSecuencia(arregloA, arregloP, arregloR);
        
        System.out.println("\nArreglo modificado:");
        mostrarArreglo(arregloA);
    }

    // Método para mostrar el arreglo
    public static void mostrarArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
        System.out.println();
    }

    // Método para encontrar la posición de la primera aparición de arregloP en arregloA
    public static int devolverInicioSecuencia(int[] arregloA, int[] arregloP) {
        for (int i = 0; i <= arregloA.length - arregloP.length; i++) {
            boolean coincide = true;
            for (int j = 0; j < arregloP.length; j++) {
                if (arregloA[i + j] != arregloP[j]) {
                    coincide = false;
                    break;
                }
            }
            if (coincide) {
                return i; // Retorna la posición de inicio de la secuencia
            }
        }
        return -1; // Si no encuentra la secuencia, devuelve -1
    }

    // Método para reemplazar todas las apariciones de arregloP en arregloA por arregloR
    public static void reemplazarSecuencia(int[] arregloA, int[] arregloP, int[] arregloR) {
        int inicio = devolverInicioSecuencia(arregloA, arregloP);
        
        while (inicio != -1) { // Mientras haya una ocurrencia de la secuencia
            for (int i = 0; i < arregloR.length; i++) {
                arregloA[inicio + i] = arregloR[i]; // Reemplaza los valores
            }
            inicio = devolverInicioSecuencia(arregloA, arregloP); // Busca la siguiente ocurrencia
        }
    }
}
