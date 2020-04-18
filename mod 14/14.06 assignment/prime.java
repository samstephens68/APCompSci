/**
 *
 * @author Sam Stephens
 * @version 2/18/20
 */
import java.util.ArrayList;
public class prime
{
    //instance variables
    private int lowerBound;
    private int upperBound;
    private int numOfPrimes;
    private int counter;
    private ArrayList <Integer> primes = new ArrayList<Integer>();
    
    //default constructor
    public prime(int lowerBound, int upperBound, ArrayList primes, int numOfPrimes)
    {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.primes = primes;
        this.numOfPrimes = numOfPrimes;
    }
      
    //calculation method
    public void findPrimes()
    {
        int count = 0;
        for(int i = this.lowerBound; i < this.upperBound; i++)
        {
            count = 0;
            for(int index = 2; index < i; index++)
            {
                if(i % index == 0)
                {
                    count++;
                }
            }
            
            if(count == 0)
            {
                this.numOfPrimes++;
                this.primes.add(i);
            }
        }
    }
    
    //method to output results
    public void displayPrimes()
    {       
        for(int loop: primes) //for each loop to show results collected
        {
            System.out.println(loop);
        }
        System.out.println("Number of prime numbers: " + numOfPrimes);
        
    }
}
