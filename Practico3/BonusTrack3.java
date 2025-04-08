package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int valorIngresado = 1, patronElegido,contadorGeneral = 0, patronMAX, contadorGeneralTotal = 0;

        System.out.println("Ingrese patrón a buscar:\n1.Patrón primo \n2.Patrón divisor\n0.Salir");
        try {
            patronElegido = Integer.parseInt(entrada.readLine());

            while (patronElegido != 0 && patronElegido == 1 || patronElegido == 2) { //selección de patrón

            System.out.println("Ingrese un maximo de patrones a buscar: ");
            patronMAX = Integer.parseInt(entrada.readLine());

            while (patronMAX > contadorGeneral) {
                System.out.println("Ingrese un valor de intensidad registrado: ");
                valorIngresado = Integer.parseInt(entrada.readLine());

                if (patronElegido == 1 && valorIngresado != 0) {
                    if (patronPrimo(valorIngresado)) {
                        contadorGeneral++;
                    }
                }
                if (patronElegido == 2 && valorIngresado != 0) {
                    if (patronDivisor(valorIngresado)) {
                        contadorGeneral++;
                    }
                }
            }
            contadorGeneralTotal += contadorGeneral;
            contadorGeneral = 0;

            System.out.println("Ingrese patrón a buscar:\n1.Patrón primo \nPatrón divisor");
            patronElegido = Integer.parseInt(entrada.readLine());
            }

            System.out.println("El total de veces que se noto el patron es: "+contadorGeneralTotal);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean patronPrimo(int valorIngresado){
        boolean comprobar = false;
        int contador = 0;
        for(int i=1;i<=valorIngresado;i++){
            if (valorIngresado % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            comprobar = true;
        }
        return comprobar;
    }

    public static boolean patronDivisor(int valorIngresado){
        boolean comprobar = false;
        int valorDividor = valorIngresado % 10;
        if (valorIngresado % valorDividor == 0) {
            comprobar = true;
        }
        return comprobar;
    }
}
