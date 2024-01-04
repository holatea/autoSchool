import java.util.Scanner;
public class MinimumOfTwoNumbers261 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        if (num1 < num2) {
            System.out.println(num1 + " is the smaller number.");
        }
        else {
            System.out.println(num2 + " is the smaller number.");
        }
    }
}
