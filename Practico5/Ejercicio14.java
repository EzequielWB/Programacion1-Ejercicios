package Practico5;

public class Ejercicio14 {
    public static void main(String[] args) {

        char arregloCaracteres[] = {'a','b','c','d','e','f','e','h','j'};

        int arregloVocales[] = new int[contarVocales(arregloCaracteres)];
        int arregloConsonantes[] = new int[arregloCaracteres.length - arregloVocales.length];

        cargarPosiciones(arregloCaracteres, arregloVocales,arregloConsonantes);
        mostrarArreglo(arregloVocales);
        System.out.println("");
        mostrarArreglo(arregloConsonantes);

    }

    public static void mostrarArreglo(int arreglo[]){
        for (int i = 0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }

    public static int contarVocales(char arreglo[]){
        int contador = 0;
        for(int i=0;i<arreglo.length;i++){
            if (esVocal(arreglo, i)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esVocal(char arreglo[],int i){
        return (arreglo[i] == 'a' ||arreglo[i] == 'e' ||arreglo[i] == 'i' ||arreglo[i] == 'o' ||arreglo[i] == 'u');
    }

    public static void cargarPosiciones(char arregloCaracteres[],int arregloVocales[],int arregloConsonantes[]){
        int posicionVocales = 0;
        int posicionConsonantes = 0;
        for(int i =0;i<arregloCaracteres.length;i++){
          if (esVocal(arregloCaracteres, i)) {
            arregloVocales[posicionVocales] = i;
            posicionVocales++;
          } else{
            arregloConsonantes[posicionConsonantes] = i;
            posicionConsonantes++;
          }
        }
    }
}
