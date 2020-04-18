
/**
 * Calculates your weight on a variety of planets
 *
 * @author Sam Stephens
 * @version 11/14/19
 */

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class PlanetWeigh
{
    public static void main(String [] args) throws IOException
    {
       String planetNames [] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}; 
       double userInput = userInput();
       double gravity[] = readFromFile();
       double userWeight[] = calculatePounds(gravity, userInput);
       printResults(gravity, userWeight);
    }
    public static void printResults(double[] gravity, double[] userWeight)
    {
        String planetNames [] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}; 

        System.out.println("\tYour Weight to the Planets");
        System.out.println("Planet\tGravity\tWeight (lbs)");
        for(int i = 0; i < gravity.length; i++)
        {
            System.out.printf("%-10.10s", planetNames[i]);
            System.out.printf("%10.4f", gravity[i]);
            System.out.printf("%16.4f%n", userWeight[i]);
        }
        
    }
    public static double[] readFromFile() throws IOException
    {
        double[] gravity = new double[8];
        File gravityTxt = new File("gravity.txt");
        Scanner inFile = new Scanner(gravityTxt);
        int i = 0;
        while(inFile.hasNextLine())
        {
            gravity[i] = Double.parseDouble(inFile.nextLine());
            i++;
        }
        return gravity;
    }
    public static double[] calculatePounds(double[] gravity, double userInput)
    {
        double userWeight[] = new double[8];
        double massGrams = 0;
        for(int i = 0; i < userWeight.length; i++)
        {
            massGrams = (userInput * 453.59237);
            userWeight[i] = (massGrams) * (gravity[i] / 9.8) / 453.59237;
        }
        return userWeight;
    }
    public static double userInput()
    {
        Scanner in = new Scanner(System.in);
        double userInput = 0;
        System.out.println("Please enter your weight (in pounds, ex: 123.4): ");
        userInput = in.nextDouble();
        return userInput;
    }
}

