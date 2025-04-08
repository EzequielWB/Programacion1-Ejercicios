package Practico3;

public class Ejercicio5 {
    public static void main(String[] args) {
        final int valorMAX = 4; 

        iteracionCreciente(valorMAX);
        System.out.println("Terminó.");
    }

    public static void iteracionCreciente(int valorMAX){
            for (int valor = 1;valor<=valorMAX;valor++){ //inicio valor aca dentro ya que solo se necesita aca.
                System.out.println("Valor: "+valor);
            }
    }
}
