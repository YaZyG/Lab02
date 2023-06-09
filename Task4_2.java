import java.util.Scanner;

public class Task4_2 {
    public static void PrintTask4_2() {
        int min = 30; // Задане число (хвилини)

                if (min >= 0 && min <= 59) {
                    int quarter = min / 15; // Визначення чверті години
                    switch (quarter) {
                        case 0:
                            System.out.println("Перша чверть");
                            break;
                        case 1:
                            System.out.println("Друга чверть");
                            break;
                        case 2:
                            System.out.println("Третя чверть");
                            break;
                        case 3:
                            System.out.println("Четверта чверть");
                            break;
                        default:
                            System.out.println("Невідома чверть");
                    }
                } else {
                    System.out.println("Невірне значення хвилин");
                }
            }
        }


