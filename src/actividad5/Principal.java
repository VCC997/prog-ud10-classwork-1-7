package actividad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int numero = 0;
        int mayor = numero;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce un entero:");
                int numeroIntroducido = teclado.nextInt();
                numero++;

                if (numeroIntroducido > mayor){
                    mayor = numeroIntroducido;
                }
            } catch (InputMismatchException excep){
                System.out.println("formato no válido,introduce un entero");
            } finally {
                teclado.nextLine();
            }
        } while (numero < 6);
        System.out.println("El mayor número es:" + mayor);


    }
}
