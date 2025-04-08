package Practico5;

public class Ejercicio9 {
    public static void main(String[] args) {
        char arregloCargado[] = {'a','f','b','c','h','j'};

        if (existeCaracterRepetido(arregloCargado)) {
            System.out.println("Existe al menos un caracter repetido.");
        }else{
            System.out.println("No existe caracter repetido.");
        }
    }

    public static boolean existeCaracterRepetido(char arreglo[]){
        for(int i=0;i<arreglo.length;i++){
            for(int j = i + 1;j < arreglo.length;j++){
                if (arreglo[i] == arreglo[j]) {
                        return true;
                }
            }
        }
        return false;
    }
}
