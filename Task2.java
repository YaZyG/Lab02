import java.util.Scanner;

public class Task2 {
    public static void PrintTask2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координату x:");
        double x = scanner.nextDouble();

        System.out.println("Введіть координату y:");
        double y = scanner.nextDouble();

        int quadrant = 0;

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        }

        System.out.println("Точка знаходиться у " + quadrant + " квадранті.");
    }
}