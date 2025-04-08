package Practico5;

public class Ejercicio13 {
    public static void main(String[] args) {
        char arregloCaracteres[] = {'a','b','c','d','e','f','g','h','j'};

        char arregloVocales[] = new char[contarVocales(arregloCaracteres)];
        char arregloConsonantes[] = new char[arregloCaracteres.length - arregloVocales.length];
        
        cargarArregloVocales(arregloCaracteres, arregloVocales);
        cargarArregloConsonantes(arregloCaracteres, arregloConsonantes);

        System.out.println("Arreglo vocales: ");
        mostrarArreglo(arregloVocales);
        System.out.println("Arreglo consonantes: ");
        mostrarArreglo(arregloConsonantes);
    }

    public static void mostrarArreglo(char arreglo[]){
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

    public static void cargarArregloVocales(char arregloCaracteres[],char arregloVocales[]){
        int posicion = 0;
        for(int i =0;i<arregloCaracteres.length;i++){
          if (esVocal(arregloCaracteres, i)) {
            arregloVocales[posicion] = arregloCaracteres[i];
            posicion++;
          }  
        }
    }

    public static void cargarArregloConsonantes(char arregloCaracteres[],char arregloConsonantes[]){
        int posicion = 0;
        for(int i =0;i<arregloCaracteres.length;i++){
          if (!(esVocal(arregloCaracteres, i))) {
            arregloConsonantes[posicion] = arregloCaracteres[i];
            posicion++;
          }  
        }
    }
}
