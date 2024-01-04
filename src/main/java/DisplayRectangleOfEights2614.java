import java.util.Scanner;

public class DisplayRectangleOfEights2614 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
