import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printHelloName();

    }

    public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}