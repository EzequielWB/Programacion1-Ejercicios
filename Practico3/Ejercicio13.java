package Practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio13 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcionesUsuario;
        Double r1,r2,r3; 

        System.out.println("Ingrese valor a comprobar, entre 1 y 4: ");
        try {
            opcionesUsuario = Integer.parseInt(entrada.readLine());
            while (opcionesUsuario< 1 || opcionesUsuario > 4) {
                System.out.println("Error, numero fuera de rango. Ingrese otro valor: ");
                opcionesUsuario = Integer.parseInt(entrada.readLine());
            }
            System.out.println("Ingrese primer valor real: ");
            r1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo valor real: ");
            r2 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese tercer valor real: ");
            r3 = Double.valueOf(entrada.readLine());

            switch (opcionesUsuario) {
                case 1:
                    System.out.println("Raiz del primer valor menos el tercero: "+calcularRaiz(r1, r3));

                break;

                case 2:
                    System.out.println("El promedio de los valores es: "+calcularPromedio(r1, r2, r3));
                break;

                case 3:
                    if (!(r1 == 0)){
                        System.out.println("El cociente de la raiz cuadrada del tercer menos el segundo valor dividido por el primero es: "+raizCuadradadaDividida(r1, r2, r3));
                    }else{
                        System.out.println("No se puede dividir por 0.");
                    }
                break;

                case 4:
                    System.out.println("El cociente del promedio de los tres valores dividido la raiz cuadrada del 2do valor es: "+calcularCocienteDelPromedio(r1, r2, r3));
                break;

                default:
                break;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Double calcularRaiz(double r1, double r3){
        Double resultado =  Math.sqrt(r1-r3);
        return resultado;
    }
    public static Double calcularPromedio(double r1, double r2, double r3){
        Double promedio;
        return promedio = (r1+r2+r3) / 3;
    }
    public static double raizCuadradadaDividida(Double r1, Double r2, Double r3){
        return calcularRaiz(r3, r2) / r1;
    }
    public static Double calcularCocienteDelPromedio( Double r1, Double r2, double r3){
        Double promedio = calcularPromedio(r3, r3, r3);
        return promedio / Math.sqrt(r2);
    }

}
