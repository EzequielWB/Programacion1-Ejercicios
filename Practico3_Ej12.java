public class Practico3_Ej12 {
    public static void main(String[] args) {

        final int MAXIteraciones = 1000;
        
        int valorUsuario = pedirValorUsuario();
        int cantidadCoincidencias = contarCoincidencias(valorUsuario, MAXIteraciones);

        mostrarResultado(cantidadCoincidencias);
    }

    

    public static int pedirValorUsuario() {
        System.out.println("Ingrese valor dentro de rango (1-6): ");
        int valorUsuario = Utils.leerInt();
        while (!valorDentroDeRango(valorUsuario)) {
            System.out.println("Fuera de rango, intente de nuevo: ");
            valorUsuario = Utils.leerInt();
        }
        return valorUsuario;
    }

    public static int contarCoincidencias(int valorUsuario, int maxIteraciones) {
        int contador = 0;
        for (int i = 0; i < maxIteraciones; i++) {
            int dado = lanzarDado();
            if (dado == valorUsuario) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultado(int cantidadCoincidencias) {
        System.out.println("El valor salió: " + cantidadCoincidencias + " veces.");
    }

    public static boolean valorDentroDeRango(int valorIngresado){

        if (valorIngresado < 0 || valorIngresado > 6) {
            return false;
        } else{
            return true;
        }
    }

    public static int lanzarDado(){
        int dado = (int) (6*Math.random() + 1);
        return dado;
    }
}


//Escribir un programa que simule 1000 lanzamientos de un dado
//y muestre por pantalla cuántas veces salió el valor del dado
//correspondiente al número entero N ingresado por el usuario.