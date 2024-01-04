import java.util.Scanner;

public class WhileStringPrint2610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int i = 0;
        while (i < n) {
            System.out.println(str);
            i++;
        }
    }
}
