package com.welcome;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Hello copyClass = new Hello();
        copyClass.setupName();
        copyClass.welcome();
        copyClass.byeBay();
    }
    static class Hello {
        private String name;
        public void setupName() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }
        public void welcome() {
            System.out.println("Hello, " + name + "!");
        }

        public void byeBay() {
            System.out.println("Bye, " + name + "!");
        }

    }
}