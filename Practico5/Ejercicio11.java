package Practico5;

public class Ejercicio11 {
    public static void main(String[] args) {
        int arregloA[] = {1,2,3};
        int arregloB[] = {2,2,3,1,5};       

        if (recorrerArreglo(arregloA, arregloB)) {
            System.out.println("Existen todos los valores de arreglo A en arreglo B.");
        } else{
            System.out.println("No existen todos los valores de arreglo A en el arreglo B.");
        }
    }

    public static boolean recorrerArreglo(int arregloA[], int arregloB[]){
        int incidencia = 0;

        for(int i =0;i<arregloA.length;i++){
            for(int j = 0;j<arregloB.length;j++){
                if (arregloA[i] == arregloB[j]){
                    incidencia++;
                    j = arregloB.length -1;
                }
            }
        }
        return hayIncidencia(incidencia, arregloA.length);
    }

    public static boolean hayIncidencia(int incidencia, int largoArreglo){
        if (incidencia == largoArreglo) {
            return true;
        }else{
            return false;
        }
    }
}
