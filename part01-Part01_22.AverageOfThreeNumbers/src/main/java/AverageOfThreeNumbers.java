
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // - avg = sum of all numbers / amount of numbers.
        System.out.println("Give the first number:");
        int firstInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdInt = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + 
                (( (double) firstInt + secondInt + thirdInt)/3));

    }
}
