/**
 * Estimates the value of pi by simulating darts 
 * thrown at a dartboard
 *
 * @author Sam Stephens
 * @version 11/16/29
 */
import java.util.Random;
import java.util.Scanner;
public class EstimatePi
{
    public static void main(String [] args)  //calls up each function
    {
        int numTrials = userInputTrials();
        int numDarts = userInputDarts();
        double [] piEstimate = calculatePi(numTrials, numDarts);
        printResults(numTrials, piEstimate);
    }
    public static int userInputTrials()     //gets input for the number of trials
    {
        Scanner in = new Scanner(System.in);
        int numTrials = 0;
        String trials;
        System.out.println("How many Trials? ");
        trials = in.next();
        numTrials = Integer.parseInt(trials);
        return numTrials;
    }
    public static int userInputDarts()  //gets input for the number of darts
    {
        Scanner in = new Scanner(System.in);
        int numDarts = 0;
        String darts;
        System.out.println("How many Darts? ");
        darts = in.next();
        numDarts = Integer.parseInt(darts);
        return numDarts;
    }
    public static double[] calculatePi(int numTrials, int numDarts)
    {
        double[] piEstimate = new double[numTrials];
        double combined = 0;
        Random randNumList = new Random();
        double randNumX = 0;
        double randNumY = 0;
        int hit = 0;
        for(int index  = 0; index < numTrials; index++) //finds an estimate for the number of trials
        {
            randNumX = 0;
            randNumY = 0;
            hit = 0;
            for(int i = 0; i < numDarts; i++)  //runs for the number of darts the user selected
            {
               randNumX = randNumList.nextDouble(); //picks random numbers and calculates a hypotenuse
               randNumY = randNumList.nextDouble();
               
               combined = (Math.pow(randNumX, 2) + Math.pow(randNumY, 2));               
               if(combined <= 1) //if hypotenuse is less than the radius a hit is counted
               {
                   hit++;
                }
            }
            piEstimate[index] = (4.0 * ((double)hit / (double)numDarts));  //stores the estimate for each trial
        }
        return piEstimate;
    }
    public static void printResults(int numTrials, double[] piEstimate)  //outputs the results
    {
        double piApprox = 0;
        double piTotal = 0;
        for(int i = 0; i < numTrials; i++)
        {
            System.out.printf("%-2.7s", "Trial[ ");
            System.out.printf("%1.3s", i + 1);
            System.out.printf("%-10.8s", "]: pi = ");
            System.out.printf("%-8.6f%n", piEstimate[i]);
        }
        System.out.printf("%-10.15s", "Estimate of Pi: ");  
        for(int index = 0; index < piEstimate.length; index++)//adds each estimate of pi and averages
        {
            piTotal += piEstimate[index];
        }
        piApprox = piTotal / (double)numTrials;
        System.out.printf(piApprox + "\n");
    }
}
