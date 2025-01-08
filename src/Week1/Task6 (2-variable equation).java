package Week1;

public class Task6 {
    public static void main(String[] args) {
        // equation 1: 3.4x + 50.2y = 44.5
        // equation 2: 2.1x + .55y = 5.9

        // ax + by = e
        // cx + dy = f
        // x = (ed - bf) / (ad - bc)
        // y = (af - ec) / (ad - bc)

        // calculate x with the provided formula
        System.out.print("X = ");
        System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));

        // calculate y with the provided formula
        System.out.print("Y = ");
        System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));

        // test the values calculated with the previous equations
        // the results will be arbitrarily close to the solutions in the previous equations
        System.out.print("3.4x + 50.2y with these values equals: ");
        System.out.println(3.4*(2.6239014) + 50.2*(0.708739739));

        System.out.print("2.1x + 0.55y with these values equals: ");
        System.out.println(2.1*(2.6239014) + 0.55*(0.708739739));
    }
}
