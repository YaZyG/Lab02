import java.util.Scanner;

public class Task1 {
    public static void PrintTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть коефіцієнт a:");
        double a = scanner.nextDouble();
        System.out.print("Введіть коефіцієнт b:");
        double b = scanner.nextDouble();
        System.out.print("Введіть коефіцієнт c:");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Розв'язки квадратного рівняння: " + root1 + " та " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Розв'язок квадратного рівняння: " + root);
        } else {
            System.out.println("Квадратне рівняння не має розв'язків у дійсних числах.");
        }
    }
}