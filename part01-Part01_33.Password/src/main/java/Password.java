
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String masterPassword = "Caput Draconis";
        System.out.println("Password?");
        String userPassword = scan.nextLine();
        if(userPassword.equals(masterPassword)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
    }
}
