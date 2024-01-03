import java.util.Scanner;

public class Division231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of q: ");
        int q = sc.nextInt();
        System.out.print("Enter the value of w: ");
        int w = sc.nextInt();
        int quotient = q / w;
        int remainder = q % w;
        System.out.println(q + " / " + w + " = " + quotient + " and " + remainder + " remainder");
    }
}
