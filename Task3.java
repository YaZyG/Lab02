import java.util.Scanner;

public class Task3 {
    public static void PrintTask3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть двозначне число:");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            if (number % 2 == 0) {
                System.out.println("Це двозначне та парне число.");
            } else {
                System.out.println("Це двозначне, але непарне число.");
            }
        } else {
            System.out.println("Це не двозначне число.");
        }
    }
}