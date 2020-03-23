package actividad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numerosLetra {

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

                if (mayor!=numeroIntroducido){

                }
            }catch (InputMismatchException e){
                System.out.println("Formato no válido Debe introducir un entero");
            } finally {
                scanner.nextLine();
            }
        }while (true);
    }
}
