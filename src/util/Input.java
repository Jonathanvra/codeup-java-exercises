package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
//    Todo getString
    public String getString (String prompt){

    }
//   Todo getInt
    public static int getInt(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        scanner();
        System.out.println("Please enter a number between " + min + " and " + max + " :");
        int userInput = scanner.nextInt();
        if(userInput < min || userInput > max) {
            return getInt(min, max);
        }
        return userInput;
    }
//    Todo getDouble
    public static double getDouble(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max + " :");
        Double userInput = scanner.nextDouble();
        if(userInput < min || userInput > max) {
            return getDouble(min, max);
        }
        return userInput;
    }

//    String getString();
//    boolean yesNo();
//    int getInt(int min, int max);
//    int getInt();
//    double getDouble(double min, double max);
//    double getDouble();

    public static void main(String[] args) {
        Input userInput = new Input();
//     Todo String
        String userString = userInput.getString();
//     Todo Boolean

//        System.out.println(boolean);
//     Todo getInt
        System.out.println(userInput.getInt(1, 10));
//     Todo getDouble
        System.out.println(userInput.getDouble(10, 100));

    }
}
