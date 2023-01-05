import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        String message = "Hi, my name is Bob. ";
        System.out.println(message);
//       Todo 1
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ask me anything: ");
        String userInput = scanner.nextLine();
//        System.out.println(userInput);
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        }
//       Todo 2
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        else if(userInput.endsWith("!")) {
            System.out.println("Whoa,chill out!");
        }
//       Todo 3
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        else if(userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        }
//       Todo 4
//        He answers 'Whatever.' to anything else.
        else {
            System.out.println("Whatever.");
        }
//       Todo 5
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        if (userInput.equals("How are you?")) {
            System.out.println("Good thanks for asking.");
        }
    }
}
