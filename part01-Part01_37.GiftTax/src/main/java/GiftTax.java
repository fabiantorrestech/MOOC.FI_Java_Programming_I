
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        
        if(giftValue < 5000){
            // tax rate - N/A
            System.out.println("No tax!");
            
        } else if(giftValue>=5000 && giftValue < 25000){
            // tax rate - at least 100 AND 8% for additional over minimum.
            double taxRate = 100 + ((giftValue-5000) * .08);
            System.out.println("Tax: " + taxRate);
        
        } else if(giftValue>=25000 && giftValue < 55000){
            // tax rate - at least 1700 AND 10% for additional over minimum
            double taxRate = 1700 + ((giftValue-25000) * .10);
            System.out.println("Tax: " + taxRate);
            
        } else if(giftValue>=55000 && giftValue < 200000){
            // tax rate - at least 4700 AND 12% for additional over minimum.
            double taxRate = 4700 + ((giftValue-55000) * .12);
            System.out.println("Tax: " + taxRate);
            
        } else if(giftValue>=200000 && giftValue < 1000000){
            // tax rate - at least 22100 AND 15% for additional over minimum.
            double taxRate = 22100 + ((giftValue-200000) * .15);
            System.out.println("Tax: " + taxRate);
            
        } else if(giftValue>= 1000000){
            // tax rate - at least 142100 AND 17% for additional over minimum.
            double taxRate = 142100 + ((giftValue-1000000) * .17);
            System.out.println("Tax: " + taxRate);
        }
    }
}
