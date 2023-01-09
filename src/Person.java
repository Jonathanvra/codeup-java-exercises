public class Person {
    //    Todo 1
    private String name;

    //        private String height;
    public String getName() {
        return name;
//TODO: return the person's name
    }

    public void setName(String name) {
        this.name = name;
//TODO: change the name field to the passed value
    }

    public void sayHello() {
        System.out.println("Hello, " + this.name + " welcome to Xerxes.");
//TODO: print a message to the console using the person's name
    }
    public Person(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1);
// The first sout makes sure the value of person1 and person2 are equal which is true. And sout person1, gives out the address of the person1 within the object of person.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
// The sout just equals to make sure the values of person1 and person2 are equal.

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
// Since the first sout prints the person1 and person2 to the same name once set to Jane it prints out Jane for both names.
    }
}

