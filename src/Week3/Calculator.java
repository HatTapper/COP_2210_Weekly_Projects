package Week3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two numbers separated by a space.");

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("Here are the list of solutions for your two numbers:");
        System.out.printf("%f + %f = %.4f\n", x, y, add(x,y));
        System.out.printf("%f - %f = %.4f\n", x, y, subtract(x,y));
        System.out.printf("%f * %f = %.4f\n", x, y, multiply(x,y));
        System.out.printf("%f / %f = %.4f\n", x, y, divide(x,y));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
