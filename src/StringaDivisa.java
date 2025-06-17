import java.util.Scanner;

public class StringaDivisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Inserisci una stringa (\":q\" per uscire): ");
            input = scanner.nextLine();


            if (input.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }


            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                if (i < input.length() - 1) {
                    System.out.println(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
