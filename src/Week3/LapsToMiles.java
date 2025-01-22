package Week3;

import java.util.Scanner;

public class LapsToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many laps you have ran.");

        double laps = scanner.nextDouble();
        System.out.printf("You have ran %.2f miles.\n", lapsToMiles(laps));
    }

    public static double lapsToMiles(double numberOfLaps)
    {
        return numberOfLaps * 0.25;
    }
}
