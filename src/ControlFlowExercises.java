public class ControlFlowExercises {
    public static void main(String[] args) {
//        Todo A While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        Todo B Do While Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a            new line.
// Count to 100 by 2s
//            int i = 0;
//            do {
//                System.out.println(i);
//                i += 2;
//            } while (i <= 100);

// Count by 5s down to 0 from 100
//            int i = 100;
//            do {
//                System.out.println(i);
//                i -= 5;
//            } while (i >= -10);
// Square every number till 1,000,000
//            long i = 2;
//            do {
//            System.out.println(i);
//            i *= i;
//            } while(i < 1000000);
//        Todo A For Loop
//        for(int j = 5; j < 15; j += 1) {
//            System.out.println("j is " + j);
//        }
//        Todo B For Loop
// By 2's to 100
//        for (int j = 0; j <= 100; j += 2) {
//            System.out.println(j);
//        }
// Count down by 5's
//        for (int j = 100; j >= -10; j -= 5) {
//            System.out.println(j);
//        }
// Square starting with 2
//        for (long j = 2; j < 1000000; j *= j) {
//            System.out.println(j);
//        }
//        Todo 2 Fizz Buzz Write a program that prints the numbers from 1 to 100.
//         For multiples of three: print “Fizz” instead of the number.
//         For the multiples of five: print “Buzz”.
//         For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

