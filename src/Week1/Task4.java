package Week1;

// write a program that displays the result of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
// and the result of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
// use 1.0 instead of 1 in your calculations
public class Task4 {
    public static void main(String[] args) {
        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = ");
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));

        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = ");
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
    }
}
