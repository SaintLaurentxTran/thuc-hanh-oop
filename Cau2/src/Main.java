import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an interger: ");
        int number = input.nextInt();
        System.out.println("you entered " + number);
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat(); // nh p s ki u float
        System.out.println("Float entered = " + myFloat);
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble(); // nh p s ki u double
        System.out.println("Double entered = " + myDouble);
        System.out.print("Enter text: ");
        String myString = input.next(); // nh p chu i ký t
        System.out.println("Text entered = " + myString);
        input.close();
    }
}