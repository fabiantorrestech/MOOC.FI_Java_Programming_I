
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // - avg = sum of all numbers / amount of numbers.
        System.out.println("Give the first number:");
        int firstInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondInt = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + 
                ((1.0 * firstInt + secondInt)/2));
    }
}
