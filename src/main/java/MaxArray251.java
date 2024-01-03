import java.util.*;
public class MaxArray251 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            array[i] = sc.nextInt();
        }
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("The maximum number is " + max);
    }
}
