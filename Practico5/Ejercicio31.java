package Practico5;

public class Ejercicio31 {
    public static void main(String[] args) {
        int arregloA[] = {0, 3, 3, 5, 0, 2, 3, 0, 3, 2, 4, 0, 1, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 7};

        System.out.println("Arreglo original:");
        mostrarArreglo(arregloA);
        
        invertirUltimaSecuencia(arregloA);
        
        System.out.println("Arreglo con última secuencia invertida:");
        mostrarArreglo(arregloA);
    }

    // Método para mostrar el arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print("[" + num + "] ");
        }
        System.out.println();
    }

    // Método que encuentra el inicio y fin de la última secuencia y la invierte
    public static void invertirUltimaSecuencia(int[] arreglo) {
        int inicio = -1, fin = -1;

        // Buscar el inicio de la última secuencia
        for (int i = arreglo.length - 1; i >= 0; i--) {
            if (arreglo[i] == 0 && i != arreglo.length - 1) {
                inicio = i + 1;
                break;
            }
        }

        // Buscar el final de la última secuencia
        for (int i = inicio; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                fin = i - 1;
                break;
            }
        }

        // Si no encontró un cero al final, la secuencia llega hasta el final del arreglo
        if (fin == -1) {
            fin = arreglo.length - 1;
        }

        // Invertir la secuencia usando dos punteros
        while (inicio < fin) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;
            inicio++;
            fin--;
        }
    }
}
