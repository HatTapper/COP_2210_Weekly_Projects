package Week1;

public class Task10 {
    public static void main(String[] args) {
        // runner travels 14 km in 45 mins and 30 seconds, find average mph speed
        // 1 mile = 1.6 km, thus 14km / 1.6 = 8.75 miles
        // 45 mins and 30 seconds is equivalent to 45.5 minutes
        // to convert to hours, do 45.5 / 60, which equals ~0.758

        System.out.print("The runner traveled at a speed of: ");
        System.out.print(8.75 / (45.5 / 60.0));
        System.out.print("mph");
    }
}
