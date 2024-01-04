import java.util.Scanner;
public class NumberArraySplit255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] allnumbers = new int[20];
        int[] numbers = new int[10];
        int[] numbers2 = new int[10];
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < 20; i++) {
            allnumbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                numbers[i] = allnumbers[i];
            }
            if (i > 9) {
                numbers2[i-10] = allnumbers[i];
            }
        }
        System.out.println("The numbers of the second array:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
