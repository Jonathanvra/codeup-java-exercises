public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Xerxes!");

//        Todo 11
//        String class;  This doesn't produce anything because class is a
//        Todo 1
        int myFavoriteNumber;
        myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);
//        Todo 2
        String myString;
        myString = "What is your favorite number?";
        System.out.println(myString);

//        Todo 5
        double myNumber;
        myNumber = 3.14;
        System.out.println(myNumber);
//        Todo 10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        This increments after printing x

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        This prints the increment of x

//        Todo 12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);
//        This didn't work because it wasn't able to be cast from the class as an integer

//        int three = (int) "three";
//        System.out.println(three);
//        This didn't work due to the int not being able to convert into a string

//        Todo 13
//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
// Prints out 9
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);
// Prints out 12
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(x);
//        System.out.println(y);
// Prints out -8 for y
// Prints out 5 for x
//        Todo 14
        byte max = 125;
        System.out.println(max);
// Incompatible type, wants to convert to int from byte to an int. Incrementing gives you an error once it passes the limits of the variable.
    }
}
