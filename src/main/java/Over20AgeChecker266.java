import java.util.Scanner;
public class Over20AgeChecker266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 20) {
            System.out.println("18 is enough, " + name + "!");
        }
    }
}
