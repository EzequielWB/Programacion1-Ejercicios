public class Practico3_Ej11 {
    public static void main(String[] args) {

        System.out.println("El valor max fue: "+maxSerieNumeros());
    }

    public static int esMayor (int valor1, int valor2){
        if (valor1 > valor2) {
            return valor1;
        } else if( valor1<valor2){
            return valor2;
        } else{
            return -1;
        }

    }

    public static int pedirValor(){
        System.out.println("Ingrese valor:");
        int valor = Utils.leerInt();
        return valor;
    }

    public static int maxSerieNumeros(){
        int valor1 =0;
        int valor2 =0;
        int valorMax  =0;
        int i = 0;

        while (i<5) {
            valor1 = pedirValor();
            valor2 = pedirValor();  
            int comparacion = esMayor(valor1, valor2);
            i++; 
                if (comparacion == -1) {
                    System.out.println("Son iguales, intente denuevo");
                    i--;
                } else if (comparacion>valorMax) {
                    valorMax = comparacion;
                } 
        }

        return valorMax;
    }
}
