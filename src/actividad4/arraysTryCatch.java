package actividad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class arraysTryCatch {

    public static void main(String[] args) {

        int[] array = new int[5];
        readNumbers(array, 4);
        readNumbers(array, 4);
        int[] array2 = null;
        readNumbers(array2, 6);
    }

    public static void readNumbers(int[] numbers, int numbElements) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbElements; ++i) {
            try {
                System.out.println("introduce un numero");
                numbers[i] = scanner.nextInt();
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Introduce un numero entre 0 y 6");
            } catch (NullPointerException exception) {
                System.out.println("Debe inicializar el array");
            } catch (InputMismatchException exception){
                System.out.println("No se puede meter Strings");
            }
        }
    }
}
