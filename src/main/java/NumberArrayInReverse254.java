import java.util.Scanner;
public class NumberArrayInReverse254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[9-i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
