import java.util.Scanner;

public class SpaceSeparation243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of words separated by spaces: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
}
