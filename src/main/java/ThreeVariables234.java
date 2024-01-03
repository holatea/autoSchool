import java.util.Scanner;

public class ThreeVariables234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        int old_a = a;
        int old_b = b;
        int old_c = c;
        a = old_a + old_b;
        b = old_c - old_a;
        c = old_a + old_b + old_c;
        System.out.println("The new values of a, b, and c are " + a + ", " + b + ", and " + c + ".");
    }
}
