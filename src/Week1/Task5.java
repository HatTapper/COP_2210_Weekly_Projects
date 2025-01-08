package Week1;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("The amount of hours in 1hr, 40m, and 35s is: ");

        // 24 miles in km is 24 * 1.6 or 38.4 km
        // to convert 38.4 km over 1hr,40m,35s to km/h, first convert the time to hours
        System.out.println(1.0 + (40.0/60.0) + (35.0/60.0/60.0));

        // use the previously converted value to calculate how many km was traveled in a single hour on average
        System.out.print("The average amount of km traveled in a single hour is: ");
        System.out.println(38.4 / (1.0 + (40.0/60.0) + (35.0/60.0/60.0)));
    }
}
