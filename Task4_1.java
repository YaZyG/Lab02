import java.util.Scanner;
import java.lang.Math;

public class Task4_1 {
    public static void PrintTask4_1() {
        System.out.println("Task 4_1");
        Function function = new Function();
        function.Output(function.takeArgument(), function.calcAnswer(function.arg));
    }
}
class Function {
    double arg;
    double answer;
    double takeArgument() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввеліть число : ");
        arg = in.nextDouble();
        return arg;
    }
    double calcAnswer(double arg) {
        if (arg < 0) {
            answer = Math.pow(Math.sin(arg), 3) - Math.pow(Math.cos(arg), 3);
        }
        if ((arg >= 0) && (arg <= 2)) {
            answer = Math.log(arg + 2);
        }
        if (arg > 2) {
            answer = Math.sqrt (Math.pow(arg, 2) - Math.pow(arg, 3));
        }
        return answer;
    }
    void Output(double arg, double result) {
        System.out.println("Резульат " + result + " з аргументом " + arg);
        System.out.println("____________________________");
    }
}