
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInt1 = Integer.valueOf(scanner.nextLine());
        int userInt2 = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt(userInt1 + userInt2));

    }
}
