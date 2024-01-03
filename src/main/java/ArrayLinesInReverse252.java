import java.util.Scanner;

public class ArrayLinesInReverse252 {
    public static void main(String[] args) {
        String[] array = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 lines:");
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextLine();
        }
        System.out.println("The contents of the array in reverse order:");
        for (int i = 7; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }

