package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        int hora, temperatura, claveNumerica, claveAlmacenada;
        String letra;
        final int claveOriginal = 364;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 

        try{
            System.out.println("Ingrese hora del dia: ");
            hora = Integer.valueOf(entrada.readLine());

                    if (hora >= 0 && hora <= 5)  {
                        System.out.println("Ingrese temperatura: ");
                        temperatura = Integer.valueOf(entrada.readLine());
                            if (temperatura < 20){
                                System.out.println("Encender calefaccion");
                            } else if(temperatura >= 20 && temperatura <= 25){
                                System.out.println("Calefaccion encendida, no abra las ventanas!!");
                            }else{
                                System.out.println("Apagar calefaccion");
                            }
                    };

                    if (hora >= 6 && hora <= 11 ) {
                        System.out.println("Ingrese caracter letra");
                        letra = String.valueOf(entrada.readLine());
                            switch(letra) {
                                case "a","e","i","o","u":
                                    switch(hora){
                                        case 6: System.out.println("2 vocales"); break;
                                        case 7: System.out.println("3 vocales"); break;
                                        case 8: System.out.println("2 vocales"); break;
                                        case 9: System.out.println("3 vocales"); break;
                                        case 10: System.out.println("2 vocales"); break;
                                        case 11: System.out.println("2 vocales"); break;
                                    }
                                break;
                                default :
                                    switch (hora) {
                                        case 6: System.out.println("2 consonates"); break;
                                        case 7: System.out.println("2 consonates"); break;
                                        case 8: System.out.println("2 consonates"); break;
                                        case 9: System.out.println("2 consonantes"); break;
                                        case 10: System.out.println("2 consonantes"); break;
                                        case 11: System.out.println("2 consonantes"); break;
                                    }
                                break;
                            };
                    };

                    if (hora >=12 && hora <=17){
                        if (hora % 2 == 0){
                            System.out.println("Promedio de hora y rango inferior: " + ((hora+12)/2) );
                        } else {
                            System.out.println("Promedio de hora y rango superior: " + ((hora+17)/2) ); 
                        }
                    };

                    if (hora>=18 && hora <=23){
                        System.out.println("Ingrese clave numerica: ");
                        claveNumerica = Integer.valueOf(entrada.readLine());

                            if (claveNumerica == claveOriginal){
                                claveAlmacenada = claveNumerica;
                                System.out.println("Ingrese nueva clave numerica entre 100 y 999: ");
                                claveNumerica = Integer.valueOf(entrada.readLine());

                                    if (claveNumerica >= 100 && claveNumerica <= 999){
                                        claveNumerica = claveNumerica / 100;
                                        claveAlmacenada = claveAlmacenada / 100;
                                            if (claveNumerica % claveAlmacenada == 0 ){
                                                System.out.println("Clave correcta");
                                            } else {
                                                System.out.println("Clave incorrecta");
                                            }
                                    }else{
                                        System.out.println("Error ingresando la clave");
                                    }
                            }else{
                                System.out.println("clave erronea");
                            }
                    }

        }catch (Exception exc){
            System.out.println("Error: "+exc);
        }
    }
}


