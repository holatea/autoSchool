import java.util.Scanner;

public class ReplaceSubstring242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter the substring to replace: ");
        String oldSubstring = sc.nextLine();
        System.out.print("Enter the new substring: ");
        String newSubstring = sc.nextLine();

        String replacedString = s.replace(oldSubstring, newSubstring);
        System.out.println("Replaced string: " + replacedString);
    }
}
