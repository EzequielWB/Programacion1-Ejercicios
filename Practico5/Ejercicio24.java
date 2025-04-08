package Practico5;

public class Ejercicio24 {
    public static void main(String[] args) {
        int arreglo[] = {0, 2, 3, 5, 0, 1, 4, 8, 0, 9, 1, 2, 3, 0, 6, 7, 0, 2, 3, 0};
        int ceroIni, ceroFinal;

        mostrarArreglo(arreglo);
        System.out.println("");
        programaEntero(arreglo);

    } // METODOS

    public static void mostrarArreglo(int arreglo[]){
        for (int i = 0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }

    public static void programaEntero(int[]arreglo){
        int suma = 0, sumaGuardada = 0,posIni = -1, posIniGuardado = 0 ,posFinalGuardado = 0;
        
        for(int i = 0;i<arreglo.length;i++){
            if (arreglo[i] != 0) {
                if(posIni == -1){
                    posIni = i;
                }
                suma += arreglo[i];
            } else if(arreglo[i] == 0) {
                if (suma > sumaGuardada) {
                    sumaGuardada = suma;
                    posIniGuardado = posIni;
                    posIni = -1;
                    posFinalGuardado = i - 1;
                    suma = 0;
                } else{
                    suma = 0;
                }
            }
        }
        System.out.println("Pos ini: "+posIniGuardado+"| pos final: "+posFinalGuardado);
    }
    
}
