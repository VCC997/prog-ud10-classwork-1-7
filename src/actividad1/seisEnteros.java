package actividad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class seisEnteros {

    public static void main(String[] args) {
        int numero=0;
        int mayor = numero;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                int numeroIntroducido = scanner.nextInt();
                numero++;
                if (numeroIntroducido > mayor){
                    mayor =numeroIntroducido;
                }
            } catch (InputMismatchException e){
                System.out.println("Formato no válido Debe introducir un entero");
            } finally {
                scanner.nextLine();
            }
        } while (numero < 5);
        System.out.println("El numero más alto es:"+" "+mayor);
    }
}
