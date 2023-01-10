package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

//    Todo getString
    public String getString() {
        System.out.println("Please input string:");
        return scanner.nextLine();
    }
//    Todo boolean
    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

//    Todo boolean
    public boolean yesNo() {
        String userResp = getString("Please input yes or no:");
        if (userResp.equalsIgnoreCase("yes") || userResp.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }
//    Todo getInt(int min, int max)
    public int getInt(int min, int max) {
//        scanner();
        System.out.println("Please enter a number between " + min + " and " + max + " :");
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        }
        return userInput;
    }

//    Todo getInt
    public int getInt() {
        System.out.println("Please enter a whole number:");
        int userInput = scanner.nextInt();
        return userInput;
    }

//    Todo getDouble(int min, int max)
    public double getDouble(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max + " :");
        Double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        }
        return userInput;
    }

//    Todo getDouble
    public double getDouble() {
        System.out.println("Please enter a number with a decimal:");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public static void main(String[] args) {
        Input in = new Input();

        String userString = in.getString();

        System.out.printf("User input string: %s%n", userString);

        System.out.println(in.yesNo());

        System.out.println(in.getInt(1, 10));

        System.out.println(in.getInt());

        System.out.println(in.getDouble(1, 100));

        System.out.println(in.getDouble());
    }
}
