
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Enter a number:");
        int userYear = Integer.valueOf(scan.nextLine());
        
        if(userYear == 1984){
            System.out.println("Orwell");
        }
    }
}
