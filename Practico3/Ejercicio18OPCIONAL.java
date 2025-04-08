package Practico3;

public class Ejercicio18OPCIONAL {
    public static void main(String[] args) {
        final int valorINICIO = 2;
        final int valorFINAL = 10000; 

        for (int i = valorINICIO; i < valorFINAL; i++) {
            if (esPerfecto(i)) {  // Ahora se usa un método que retorna un booleano
                System.out.println("Número perfecto: " + i);
            }
        }
    }

    public static boolean esPerfecto(int valor) {
        int sumatoria = 0;
        for (int i = 1; i <= valor / 2; i++) {  // Iteración optimizada
            if (valor % i == 0) {
                sumatoria += i;
            }
        }
        return sumatoria == valor;  // Devuelve true si el número es perfecto
    }
}
