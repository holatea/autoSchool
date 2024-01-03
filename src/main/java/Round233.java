import java.util.Scanner;

public class Round233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number with a non-zero fractional part: ");
        double n = sc.nextDouble();
        int rounded = (int) Math.round(n);
        System.out.println("The nearest integer to " + n + " is " + rounded);
    }
}
