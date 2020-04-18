
/**
 * This program will allow you to buy hot dogs
 * and then give you a receipt.
 * @author Sam Stephens
 * @version 9/22/19
 */
import java.util.Scanner;
public class BuyHotDogs
{
    public static void main(String args [])
    {
        Scanner in;
        in = new Scanner(System.in);
        int hotdogAmount;
        double hotdogPrice;
        System.out.println("Good Afternoon");
        System.out.print("Please enter your first name: ");
        String firstName = in.next();
        System.out.print("Please enter your last name: ");
        String lastName = in.next();
 
        System.out.println("Enter today's date: (mm/dd/yyyy)");
        String todaysDate = in.next();
        
        System.out.println("What size hot dog would you like:");
        String  dogSize = in.next();
        
        System.out.println("How many would you like? ");
        String dogAmount = in.next();
        
        System.out.println("What is the price per dog? ");
        String dogPrice = in.next();
        
        System.out.println("Enter your debit card number(*****-***-****): ");
        String debitNumber = in.next();
        
        System.out.println("Enter your PIN (****): ");
        String debitPin = in.next();
        
        String orderNumber = lastName.substring(0,2) + debitNumber.substring(3,4);
       
        
        System.out.println("");
        System.out.println("***********************************************");
        System.out.println("");
        System.out.println("Your e-receipt: ");
        System.out.println("");
        System.out.println(todaysDate);
        System.out.println(orderNumber);
        System.out.println("");
        System.out.println(firstName.substring(0,1) + "." + lastName);
        System.out.println("Account: #####-###-" + debitNumber.substring(10, 14));
        System.out.println("Hot dog size: " + dogSize);
        System.out.println("Number of hot dogs: " + dogAmount);
        System.out.println("Hot dog Price: " + dogPrice);
        System.out.println("$" + (double)Integer.parseInt(dogAmount) * (Double.parseDouble(dogPrice))  + " will be debited to your account.");
        System.out.println("");
        System.out.println("Thank you. Enjoy your hot dogs.");
    }
}
