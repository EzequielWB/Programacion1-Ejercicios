package Practico2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String[] args) {
        char caracter = '-';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese caracter digito o caracter letra minuscula: ");
        try{
            caracter = entrada.readLine().charAt(0);
                while((Character.isDigit(caracter) || Character.isLowerCase(caracter) && caracter != ' ')){
                        if(Character.isDigit(caracter)){
                            System.out.println("Es caracter digito");
                        } else if(Character.isLowerCase(caracter)){
                            switch (caracter){
                                case 'a','e','i','o','u':
                                    System.out.println("Es vocal");
                                break;
                                default:
                                    System.out.println("Es consonante");
                                break;
                            }
                        }
                    System.out.println("Ingrese otro valor: ");
                    caracter = entrada.readLine().charAt(0);
                }
        }catch (Exception exc){
        System.out.println("Error: "+exc);
        }
    }
}
