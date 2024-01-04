import java.util.Scanner;
public class MinimumOfFourNumbers262 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third number: ");
        float num3 = scanner.nextFloat();

        System.out.print("Enter the fourth number: ");
        float num4 = scanner.nextFloat();

        if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println(num1 + " is the smallest number.");
        }
        else if (num2 < num1 && num2 < num3 && num2 < num4) {
            System.out.println(num2 + " is the smallest number.");
        }
        else if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println(num3 + " is the smallest number.");
        }
        else if (num4 < num1 && num4 < num2 && num4 < num3) {
            System.out.println(num4 + " is the smallest number.");
        }
    }
}
