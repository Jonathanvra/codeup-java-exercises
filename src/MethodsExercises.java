import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }
//    Todo 2
    public static int getInteger(int min, int max){
        int userInput;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ":");
            userInput = scanner.nextInt();
        } while(userInput < min || userInput > max);
        return userInput;
    }
//    Todo 3


    public static void main(String[] arg) {
        int addResult = add(1, 2);
        System.out.println(addResult);
//      How to add user input
//        System.out.println("Enter your first number to add: ");
//        int addResult = scanner.nextInt();
//        System.out.println("Enter your second number to add: ");
//        int addResult2 = scanner.nextInt();
//        System.out.println(add(addResult, addResult2));
        int subResult = MethodsExercises.subtract(4, 3);
        System.out.println(subResult);
//      How to add user input
//        System.out.println("Enter your first number to subtract: ");
//        int subResult = scanner.nextInt();
//        System.out.println("Enter your second number to subtract: ");
//        int subResult2 = scanner.nextInt();
//        System.out.println(subResult - subResult2);
        int multiplyResult = MethodsExercises.multiply(3, 5);
        System.out.println(multiplyResult);
//      How to add user input
//        System.out.println("Enter your first number to multiply: ");
//        int multiplyResult = scanner.nextInt();
//        System.out.println("Enter your second number to multiply: ");
//        int multiplyResult2 = scanner.nextInt();
//        System.out.println(multiplyResult * multiplyResult2);
        int divisionResult = MethodsExercises.divide(64, 4);
        System.out.println(divisionResult);
//      How to add user input
//        System.out.println("Enter your first number to divide: ");
//        int divisionResult = scanner.nextInt();
//        System.out.println("Enter your second number to divide: ");
//        int divisionResult2 = scanner.nextInt();
//        System.out.println(divisionResult / divisionResult2);
        int modulusResult = MethodsExercises.modulus(25,9);
        System.out.println(modulusResult);
//      Todo 2
        getInteger(1, 10);
    }
}

