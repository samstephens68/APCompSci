
/**
 * calculates fibonacci numbers
 *
 * @author Sam Stephens
 * @version 2/3/20
 */
import java.util.Scanner;

class fibonacci
{
fibonacci()
{
}  
 public int getNumber(int num)
    {
         if (num == 0)
            {
                return 0;
            }
         else if (num  == 1)
            {
                return 1;
            }
         else
            {
               return getNumber(num-1) + getNumber(num-2);
            }
}
}

public class fibonacciTester
{
    public static void main(String args[])
    {
        int num = 0;
        int x = 0;
        Scanner in = new Scanner(System.in);
        fibonacci fCalc = new fibonacci();
        System.out.println("This program will allow you to find the fibonacci number\n of a user input");
        while (num != -1)
           {
            System.out.println("Enter a number between 0 and 45 ('-1' to quit): ");
            num = in.nextInt();
            if(num >=0 && num <=45)
            {
                x = fCalc.getNumber(num);
                System.out.println("here is your fibonacci number: " + x);
            }
            else
            System.out.println("Please enter a number between 0 and 45");            
        }
    }
}
