import java.util.Scanner;

public class CompareNames264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("The names are identical.");
        } else if (name1.length() == name2.length()) {
            System.out.println("The length of the names are equal.");
        }
    }
}
