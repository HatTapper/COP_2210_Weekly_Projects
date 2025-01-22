package Week3;

import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car's miles per gallon and the car's price of gas in dollars per gallon");
        double milesPerGallon = scanner.nextDouble();
        double dollarsPerGallon = scanner.nextDouble();

        double tenMiles = drivingCost(milesPerGallon, dollarsPerGallon, 10);
        double fiftyMiles = drivingCost(milesPerGallon, dollarsPerGallon, 50);
        double fourHundredMiles = drivingCost(milesPerGallon, dollarsPerGallon, 400);

        System.out.printf("10 miles: %.2f\n50 miles: %.2f\n400 miles: %.2f\n", tenMiles, fiftyMiles, fourHundredMiles);
    }

    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven)
    {
        double gallonsUsed = milesDriven / milesPerGallon;
        return gallonsUsed * dollarsPerGallon;
    }
}
