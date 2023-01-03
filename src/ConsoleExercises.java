import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

//        Todo 1
//         Copy this code into your main method:
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f", pi);

//        Todo 2
//         Scanner
//         Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int userInput = scanner.nextInt();
//        When inputted a non integer, we have an error of InputMismatchException
        System.out.println("Your integer is:\" " + userInput + "\"");

//        Todo 3
//         Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.print("Enter Three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
// When enter less then three words, it doesn't run because it is waiting for the three inputs, when more than three words have been entered it only displays the first three words entered.
//        Todo 4
//         Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.print("Enter a sentence: ");
        String sentence = scanner.next();
        System.out.println(sentence);
// No, it didn't output every word.
//        Todo 5
//         Rewrite the above example using the nextLine method.
        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String sentence2 = scanner.nextLine();
        System.out.println(sentence2);
//        Todo 6
//         Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//         Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get             the user input for the width. Parse the resulting strings to a numeric type.
        System.out.println("Enter the length of your classroom: ");
        String length = scanner.nextLine();
        System.out.println("Enter the width of your classroom: ");
        String width = scanner.nextLine();
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        System.out.println("The Length is " + l + " and the width is " + w + ".");
        System.out.println("The perimeter of the room is " + (2 * l + 2 * w));
        System.out.println("The area of the room is " + (l*w));
    }
}
