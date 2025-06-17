import java.util.Scanner;

public class ContoRovescio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            System.out.println("Conto alla rovescia:");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Errore: input non valido (non è un numero intero).");
        }

        scanner.close();
    }
}