package Practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack1 {
    public static void main(String[] args) {
        int opcionElegida = 1, numeroPacientesMayores = 0, masDeDiezPacientesContador = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (opcionElegida != 0){
            System.out.println("Ingrese opción (Presione 0 para salir): \n" + //
                            "1. Ingreso de pacientes.\n" + //
                            "2. Ingreso de prestadores.\n" + //
                            "3. Cantidad de pacientes.\n" + //
                            "4. Ver pacientes y sus obras sociales.");
        try {
            opcionElegida = Integer.valueOf(entrada.readLine());

            if (!(opcionElegida >= 1 && opcionElegida <= 4) && opcionElegida != 0){
                System.out.println("Ingreso un valor erroneo. Intente denuevo.");
            }

            switch (opcionElegida) {
                case 1:
                    System.out.println("Ingrese cantidad de pacientes: ");
                    int pacientes = Integer.valueOf(entrada.readLine());
                    if (pacientes < 15){
                        for (int i=0; i < pacientes; i++){
                            System.out.println("Ingrese la edad de cada paciente: ");
                            int edadPacientes = Integer.valueOf(entrada.readLine());
                            if (edadPacientes > 78){
                                numeroPacientesMayores++;
                            }
                        } 
                        System.out.println("El total de pacientes mayores a 78 años es: "+numeroPacientesMayores);
                        numeroPacientesMayores = 0;
                    }else{
                        System.out.println("Sobrepaso la cantidad de pacientes. Maximo 15.");
                    }
                break;
                    
                case 2:
                    System.out.println("Ingrese cantidad de prestadores que tiene la clinica: ");
                    int cantidadPrestadores = Integer.valueOf(entrada.readLine());
                    if (cantidadPrestadores <= 10) {
                        for (int i = 0; i < cantidadPrestadores; i++) {
                            System.out.println("Ingrese cuántos pacientes atendió en los últimos 2 días:");
                            int cantidadPacientesAtendidos = Integer.valueOf(entrada.readLine());
                            if (cantidadPacientesAtendidos > 10) {
                                masDeDiezPacientesContador++;
                            }
                        }
                        System.out.println("Los prestadores que atendieron a más de 10 pacientes son: " + masDeDiezPacientesContador);
                    } else {
                        System.out.println("Cantidad de prestadores no válida (máximo 10).");
                    }
                    break;

                case 3:
                    int pacientesFemeninos = 0,edadPacientesFem = 0,pacientesMasculinos = 0, edadPacientesMasc = 0;

                    System.out.println("Ingrese cantidad de pacientes femeninos (No mayor a 10): ");
                    pacientesFemeninos = Integer.valueOf(entrada.readLine());
                        if (pacientesFemeninos<=10){
                            for (int i=0;i<pacientesFemeninos;i++){
                                System.out.println("Ingrese la edad de cada paciente");
                                int edad = Integer.valueOf(entrada.readLine());
                                edadPacientesFem += edad;
                            }   
                        }else{
                            System.out.println("Ingreso mas de 10 pacientes.");
                        }

                    System.out.println("Ingrese cantidad de pacientes masculinos (No mayor a 10): ");
                    pacientesMasculinos = Integer.valueOf(entrada.readLine());
                        if (pacientesMasculinos<=10){
                            for (int i=0;i<pacientesMasculinos;i++){
                                System.out.println("Ingrese la edad de cada paciente");
                                int edad = Integer.valueOf(entrada.readLine());
                                edadPacientesMasc += edad;
                            }   
                        }else{
                            System.out.println("Ingreso mas de 10 pacientes.");
                        }

                        if (pacientesFemeninos > 0) {
                            System.out.println("El promedio de edad de los pacientes femeninos es de: " + (edadPacientesFem / pacientesFemeninos));
                        } else {
                            System.out.println("No se ingresaron pacientes femeninos.");
                        }

                        if (pacientesMasculinos > 0) {
                            System.out.println("El promedio de edad de los pacientes masculinos es de: " + (edadPacientesMasc / pacientesMasculinos));
                        } else {
                            System.out.println("No se ingresaron pacientes masculinos.");
                        }
                    
                break;

                case 4:
                    int cantidadPacientesSinOS = 0; //sirve de reincio de variable
                    System.out.println("Ingrese cantidad de pacientes (No mayor a 15): ");
                    int cantidadPacientesOS = Integer.valueOf(entrada.readLine());
                    if (cantidadPacientesOS <= 15){
                        for(int i=0;i<cantidadPacientesOS;i++){
                            System.out.println("El paciente "+i+" tiene obra social? \n"+
                            "1. Si\n"+
                            "2. No");
                            int pacientesSinOS = Integer.valueOf(entrada.readLine());
                            if (pacientesSinOS == 2){ 
                                cantidadPacientesSinOS++;
                            }
                        }
                        System.out.println("La cantidad de pacientes sin obra social es de: "+cantidadPacientesSinOS);
                    }else{
                        System.out.println("Ingreso mas de 15 pacientes.");
                    }
                break;

                default:
                    System.out.println("No es una opcion valida.");
                break;
            }

        } catch (Exception exc) {
            System.out.println("Error: " +exc);
        }
        }
    }
}
