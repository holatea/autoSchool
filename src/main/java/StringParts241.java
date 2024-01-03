import java.util.Scanner;

public class StringParts241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int n = s.length();

        System.out.println("First character: " + s.charAt(0));

        System.out.println("Last character: " + s.charAt(n-1));

        if (n % 2 == 0) {
            System.out.println("Middle character(s): " + s.substring(n/2-1, n/2+1));
        } else {
            System.out.println("Middle character(s): " + s.charAt(n/2));
        }

        int dotIndex = s.indexOf('.');
        if (dotIndex != -1) {
            System.out.println("String up to the first dot encountered: " + s.substring(0, dotIndex+1));
        } else {
            System.out.println("No dot found in the string.");
        }

        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces in the string: " + spaceCount);
    }
}
