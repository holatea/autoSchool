import java.util.Scanner;

public class ThreeNumbersInDescendingOrder263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third number: ");
        float num3 = scanner.nextFloat();

        float max = Math.max(num1, Math.max(num2, num3));
        float min = Math.min(num1, Math.min(num2, num3));
        float mid = (num1 + num2 + num3) - max - min;

        System.out.println("The numbers in descending order are: " + max + ", " + mid + ", " + min);
    }
}
