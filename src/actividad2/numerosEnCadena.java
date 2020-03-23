package actividad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numerosEnCadena {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String scanner = "Numeros: ";
        int number = 0;
        do {
            try {
                System.out.println("Introduce un numero: ");
                if(number < 1 || number > 5){
                    number = read.nextInt();
                }
                scanner = scanner + number + ",";
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un entero!");
            } finally {
                read.nextLine();
            }
        } while (number < 1 || number > 5);
        System.out.println(scanner);
    }
}
