import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Todo A While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        Todo A For Loop
//        for(int j = 5; j < 15; j += 1) {
//            System.out.println("j is " + j);
//        }
//        Todo B Do While Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a            new line.
//        Todo B Do While
// Count to 100 by 2s
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//        Todo B For Loop
// By 2's to 100
//        for (int j = 0; j <= 100; j += 2) {
//            System.out.println(j);
//        }
//        Todo B Do While
// Count by 5s down to 0 from 100 do while
//            int i = 100;
//            do {
//                System.out.println(i);
//                i -= 5;
//            } while (i >= -10);
//        Todo B for Loop
// Count down by 5's for loop
//        for (int j = 100; j >= -10; j -= 5) {
//            System.out.println(j);
//        }
//        Todo B Do While
// Square every number till 1,000,000 do while.
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);
//        Todo B for Loop
// Square starting with 2 for loop.
//        for (long j = 2; j < 1000000; j *= j) {
//            System.out.println(j);
//        }
//        Todo 2 Fizz Buzz Write a program that prints the numbers from 1 to 100.
//         For multiples of three: print “Fizz” instead of the number.
//         For the multiples of five: print “Buzz”.
//         For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            Todo 3
//             Display a table of powers.
//             Prompt the user to enter an integer.
//             Display a table of squares and cubes from 1 to the value entered.
//             Ask if the user wants to continue.
//             Assume that the user will enter valid data.
//             Only continue if the user agrees to.
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an Integer if you would like to continue: ");
//        int userInput = scanner.nextInt();
//        System.out.println("Numbers | Squared | Cube");
//        System.out.println("------- | ------- | ----");
//// Table
//        for (int j = 1; j <= userInput; j++) {
//            int square = j * j;
//            int cube = j * j * j;
//            System.out.printf("%-7d | %-7d | %-4d %n",j, square, cube);
//        }
//        Todo 4
//         Convert given number grades into letter grades.
//         Prompt the user for a numerical grade from 0 to 100.
//         Display the corresponding letter grade.
//         Prompt the user to continue.
//         Assume that the user will enter valid integers for the grades.
//         The application should only continue if the user agrees to.
        boolean continu = true;
        while (continu) {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = scanner.nextInt();
            char letterGrade;
            if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.println("Letter grade: " + letterGrade);
            System.out.print("Would you like to continue? (y/n) ");
            String input = scanner.next();
            if (input.equals("n")) {
                continu = false;
            }
        }
    }
}



