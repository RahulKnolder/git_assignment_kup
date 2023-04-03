import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, world!");

        //scanner input
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the name");

        String name = scanner.nextLine();
        System.out.println("enter the age");
        int ageOfPerson = scanner.nextInt();

        //create object
        Person person = new Person(name, ageOfPerson);

        //validating age
        if (person.isValidAge())
            System.out.println("the person is adult");
        else
            System.out.println("the person is not adult");


    }
}
