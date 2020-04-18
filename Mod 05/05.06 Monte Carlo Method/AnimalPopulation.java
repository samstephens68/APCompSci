
/**
 * This program will calculate the likelihood of
 * seeing certain animals
 *
 * @author Sam Stephens
 * @version 10/22/19
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class AnimalPopulation
{
    public static void main(String args[]) throws IOException
    {
        File fileName = new File("squirrel.txt");
        PrintWriter outFile = new PrintWriter(fileName);
        Random randNumList = new Random();
        int randNum = 0;
        int count = 0;
        int numTrials = 0;
        int squirrelTotal = 0;
        int squirrelCount = 0;
        String trials;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Squirrel Simulator");
        System.out.println("");
        System.out.println("How many trials?");
        System.out.print("Please enter a number that is greater than 1000: ");
        System.out.println("");
        trials = in.next();
        numTrials = Integer.parseInt(trials);
        while(numTrials < 1000)
        {
        System.out.println("How many trials?");
        System.out.print("Please enter a number that is at least 1000: ");
        System.out.println("");
        trials = in.next();
        numTrials = Integer.parseInt(trials);
        }
        
        System.out.println("One moment while results are generated");
        
        
        for(count = 0; count <= numTrials; count++)
        {
           randNum = 0;
            squirrelCount = 0;
            while(randNum != 10)
            {
            randNum = randNumList.nextInt(10) + 1;
            squirrelCount++;
        }
        outFile.println(squirrelCount);
        }
        
        outFile.close();
        Scanner inFile = new Scanner(fileName);
        while(inFile.hasNextLine())
        {
            squirrelTotal += Integer.parseInt(inFile.nextLine());
        }
        inFile.close();
        double average = (double)squirrelTotal / (double)numTrials;
        
        
        System.out.println("Your Results: ");
        System.out.println("The average number of squirrels observed");
        System.out.println("until seeing a fox squirrel is " + average);
        
    }
}


