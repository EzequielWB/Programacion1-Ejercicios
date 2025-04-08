package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1{
    public static void main(String[] args) {
        
        int valor, valor2, valor3;
        String letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Ingrese valor para ver si es positivo o negativo: ");
            valor = Integer.valueOf(entrada.readLine());

                if (valor > 0) {
                    System.out.println("Es positivo");
                } else if (valor < 0) {
                    System.out.println("Es negativo");
                } else { //comprobacion para cero
                    System.out.println("Error: el valor es cero");
                }

            System.out.println("Ingrese valor para ver si es grande o chico: ");
            valor = Integer.valueOf(entrada.readLine());

                if (valor > 100) {
                    System.out.println("Grande");
                } else {
                    System.out.println("Chico");
                }

            System.out.println("Ingrese valor para ver dia de semana: ");
            valor = Integer.valueOf(entrada.readLine());

                switch(valor) {
                    case 1: System.out.println("Lunes");  //dias de la semana
                        break;
                    case 2: System.out.println("Martes");
                        break;
                    case 3: System.out.println("Miercoles");
                        break;
                    case 4: System.out.println("Jueves");
                        break;
                    case 5: System.out.println("Viernes");
                        break;
                    case 6: System.out.println("Sabado");
                        break;
                    case 7: System.out.println("Domingo");
                        break;
                    default : System.out.println("No es dia de la semana");
                }

            System.out.println("Ingrese letra para ver si es vocal o consonante: ");
            letra = String.valueOf(entrada.readLine());
                
                switch(letra) {
                    case "a", "e", "i", "o", "u" : System.out.println("Es vocal"); //cada vocal
                        break;
                    default: System.out.println("Es consonante");
                }

            System.out.println("Ingrese primer valor: "); //carga de los tres valores
            valor = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo valor: ");
            valor2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese tercer valor: ");
            valor3 = Integer.valueOf(entrada.readLine());

                if ((valor3 > valor2) && (valor2 > valor)){
                        System.out.println("Es creciente");
                    } else if ((valor3 < valor2) && (valor2 < valor)) {
                        System.out.println("Es creciente");
                    } else {
                        System.out.println("Error: no hay orden");
                    }

        }catch (Exception exc){
            System.out.println("Hubo un error: " +exc);
        }
       
    }
    
}