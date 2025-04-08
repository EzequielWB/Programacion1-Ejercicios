package Practico5;

public class Ejercicio29_IMPORTANTE {
  public static void main(String[] args) {
    int arreglo[] = {0, 2, 3, 5, 0, 1, 4, 8, 0, 9, 8, 7, 5, 0, 6, 7, 0, 2, 3, 0};

    mostrarArreglo(arreglo);
    System.out.println("\nEliminando secuencias descendentes...");
    eliminarSecuenciasDescendentes(arreglo);
    mostrarArreglo(arreglo);
  }  

  // METODOS
  public static void mostrarArreglo(int arreglo[]) {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print("[" + arreglo[i] + "] ");
    }
    System.out.println();
  }

  public static boolean esDescendente(int[] arreglo, int inicio, int fin) {
    for (int i = inicio; i < fin; i++) {
      if (arreglo[i] <= arreglo[i + 1]) {
        return false; // Si algún número no es descendente, no es una secuencia válida
      }
    }
    return true; // Si todos los números son descendentes, retornamos true
  }

  public static void corrimientoIzquierda(int arreglo[] ,int posicion){
    for(int i = posicion;i<arreglo.length-1;i++){
        arreglo[i] = arreglo[i+1];
    }
  }

  public static void eliminarSecuenciasDescendentes(int[] arreglo) {
    int i = 0;
    while (i < arreglo.length) {
      if (arreglo[i] != 0) {
        int fin = i;
        while (fin < arreglo.length && arreglo[fin] != 0) {
          fin++;
        }
        fin--; // Ajustar para obtener la última posición de la secuencia

        if (esDescendente(arreglo, i, fin)) {
          int tam = fin - i + 1; // Tamaño de la secuencia
          for (int j = 0; j < tam; j++) {
            corrimientoIzquierda(arreglo, i); // Eliminamos desde la posición i
          }
        } else {
          i = fin + 1; // Si no era descendente, avanzamos al próximo bloque
        }
      } else {
        i++;
      }
    }
  }
}
