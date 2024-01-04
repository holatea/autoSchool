import java.util.Scanner;

public class TwoArrays253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lines = new String[10];
        int[] numbers = new int[10];

        System.out.println("Enter 10 lines:");

        for (int i = 0; i < 10; i++) {
            lines[i] = scanner.nextLine();
            numbers[i] = lines[i].length();
        }

        System.out.println("The length of each line is:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
