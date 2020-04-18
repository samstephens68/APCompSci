
/**
 * Write a description of class primeTester here.
 *
 * @author Sam Stephens
 * @version 2/18/20
 */
import java.util.Scanner;
import java.util.ArrayList;
public class primeTester
{
        public static void main(String [] args) //main method
    {
        int lowerBound = 0;
        int upperBound = 0;
        ArrayList <Integer> primes = new ArrayList<Integer>(); //arraylist object declared to store primes
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a lower limit: "); // prompt user to input limits
        lowerBound = in.nextInt();
        System.out.println("Enter an upper limit: ");
        upperBound = in.nextInt();
        System.out.println("Here are all prime numbers between " + lowerBound + " and " + upperBound); //explanation to user
        prime primeNums = new prime(lowerBound, upperBound, primes, 0); //declare object
        primeNums.findPrimes(); //implement methods
        primeNums.displayPrimes();
    }
}
