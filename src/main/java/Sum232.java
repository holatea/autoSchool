import java.util.Scanner;

public class Sum232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int n = sc.nextInt();
        int sum = (n / 10) + (n % 10);
        System.out.println("The sum of the digits of " + n + " is " + sum);
    }
}
