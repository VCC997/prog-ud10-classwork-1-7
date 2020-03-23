package actividad4_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepcionMain {

    public static void main(String[] args) {


    }

    public static String obtenerEntero() {

        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        return String.valueOf(numero);
    }

    public static void obtenerMayor(String[] listaNumeros){

        int[] numeros = new int[listaNumeros.length];

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = Integer.parseInt(listaNumeros[i]);
        }

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length ; i++) {
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
    }
}


