import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);

//    public static int add(int a, int b) {
//        return a + b;
//    }

//    public static int subtract(int a, int b) {
//        return a - b;
//    }

//    public static int multiply(int a, int b) {
//        return a * b;
//    }

//    public static int divide(int a, int b) {
//        return a / b;
//    }

//    public static int modulus(int a, int b) {
//        return a % b;
//    }

    //    Todo 2
//    public static int getInteger(int min, int max) {
//        int userInput;
//        do {
//            System.out.println("Enter a number between " + min + " and " + max + ":");
//            userInput = scanner.nextInt();
//        } while (userInput < min || userInput > max);
//        return userInput;
//    }
//    Todo 3

//    public static int Integer(int a, int b) {
//        boolean confirmation;
//        do {
//            System.out.println("Enter an integer from 1 to 10: ");
//            int n = scanner.nextInt();
//            if (n < 1 || n > 10) {
//                System.out.println("Invalid input. Please try again.");
//            }
//            long result = factorial(n);
//            System.out.print("The factorial of "+ n + "is " + result);
//            System.out.print("Continue? [Y/N] ");
//            String userInput = scanner.next();
//            confirmation = userInput.equalsIgnoreCase("Y");
//        } while (confirmation);
//        System.out.println("Cool. See you next time!");
//        return Integer(1, 10);
//    }

//    public static int Integer(int a, int b) {
////        boolean confirmation;
//        do {
//            System.out.println("Enter an integer from 1 to 10:");
//            int n = scanner.nextInt();
//            if (n < 1 || n > 10) {
//                System.out.println("Invalid input. Please try again.");
//            }
//            long result = factorial(n);
//            System.out.println("The factorial of " + n + " is: " + result);
//            System.out.println("Do you want to continue? (y/n):");
//            String userInput = scanner.next();
//            confirmation = userInput.equalsIgnoreCase("y");
//        } while (confirmation);
//        System.out.println("Goodbye!");
////        return Integer(1,10);
//    }
//    public static long factorial(int n) {
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//            System.out.println(result);
//        }
//        return result;
//    }

//    public static void diceRoll() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many sides does your dice have?");
//        int numberOfSides = sc.nextInt();
//        int firstDie = (int) (Math.random() * numberOfSides) + 1;
//        int secondDie = (int) (Math.random() * numberOfSides) + 1;
//
//        System.out.printf("You got %d on your first roll\n%d for your second roll.", firDie, secondDie);
//    }

    //    Todo 4
    public static void diceRoll() {
        System.out.print("Enter the number of sides for a pair of dice: ");
        int numsides = scanner.nextInt();

        int dice1 = (int) (Math.random() * numsides) + 1;
        int dice2 = (int) (Math.random() * numsides) + 1;

        System.out.printf("You got %d on your first roll\n And %d for your second roll.", dice1, dice2);

    }

    public static void main(String[] arg) {
//        int addResult = add(1, 2);
//        System.out.println(addResult);
//      How to add user input
//        System.out.println("Enter your first number to add: ");
//        int addResult = scanner.nextInt();
//        System.out.println("Enter your second number to add: ");
//        int addResult2 = scanner.nextInt();
//        System.out.println(add(addResult, addResult2));
//        int subResult = subtract(4, 3);
//        System.out.println(subResult);
//      How to add user input
//        System.out.println("Enter your first number to subtract: ");
//        int subResult = scanner.nextInt();
//        System.out.println("Enter your second number to subtract: ");
//        int subResult2 = scanner.nextInt();
//        System.out.println(subResult - subResult2);
//        int multiplyResult = multiply(3, 5);
//        System.out.println(multiplyResult);
//      How to add user input
//        System.out.println("Enter your first number to multiply: ");
//        int multiplyResult = scanner.nextInt();
//        System.out.println("Enter your second number to multiply: ");
//        int multiplyResult2 = scanner.nextInt();
//        System.out.println(multiplyResult * multiplyResult2);
//        int divisionResult = divide(64, 4);
//        System.out.println(divisionResult);
//      How to add user input
//        System.out.println("Enter your first number to divide: ");
//        int divisionResult = scanner.nextInt();
//        System.out.println("Enter your second number to divide: ");
//        int divisionResult2 = scanner.nextInt();
//        System.out.println(divisionResult / divisionResult2);
//        int modulusResult = modulus(25, 9);
//        System.out.println(modulusResult);
//     Todo 2
//        getInteger(1, 10);

//     Todo 3
//        Integer(1, 10);
//     Todo 4
        diceRoll();
    }
}

