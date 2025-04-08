package Practico5;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arreglo = {12,321,432,21,756,4,55,87,98,334};
        int contador = 0, acumulacion = 0, promedio;

        for (int i = 0; i<10;i++){
            acumulacion += arreglo[i];
            contador++;
        }
        promedio = calcularPromedio(contador, acumulacion);
        System.out.println("Promedio del arreglo: "+promedio);
        
        for (int i = 0; i<10;i++){
            contador = contarEncimaDelPromedio(arreglo, i, promedio);
        }
        System.out.println("En total hay: "+contador+" valores encima del promedio.");

    }

    public static int calcularPromedio(int contador, int acumulacion){
        return acumulacion/contador;
    }
    
    public static int contarEncimaDelPromedio (int arreglo[],int iterador,int promedio){
        int contador = 0;
        if (arreglo[iterador] > promedio){
            contador++;
        }
        return contador;
    }
}
