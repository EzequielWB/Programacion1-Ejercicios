package Practico5;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo = {12,321,432,21,756,4,55,87,98,334};
        int contador = 0, acumulacion = 0;

        for (int i = 0; i<10;i++){
            acumulacion += arreglo[i];
            contador++;
        }
        System.out.println("Promedio del arreglo: "+calcularPromedio(contador, acumulacion));
    }

    public static int calcularPromedio(int contador, int acumulacion){
        return acumulacion/contador;
    }
}
