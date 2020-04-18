
/**
 * Write a description of class PlanetGravity here.
 *
 * @author Sam Stephens
 * @version 11/10/19
 */
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class PlanetGravity
{
    public static void main(String [] args) throws IOException
    {   
        String planetNames [] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double mass[] = {3.3e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
        double diameter[] = {4880.0, 12103.6, 12756.3, 6794.0, 142984.0, 120536.0, 51118.0, 49352.0};
        double gravity[] = new double[8];
        gravity = findGravity(diameter, mass);
        output(planetNames, diameter, mass, gravity);
        writeToFile(gravity);
    }   
    public static double[] findGravity(double []diameter, double[] mass)
    {
        double [] gravity = new double[8];
        for(int i = 0; i < gravity.length; i++)
        {
            diameter[i] = diameter[i] * 1000.0;
            gravity[i] = ((6.67e-11) * mass[i]) / ((diameter[i] / 2) * diameter[i] / 2);      
        }
        
        return(gravity);
    }   
    public static void output(String[] planetNames, double[] diameter, double[] mass, double[] gravity)
    {
        System.out.println("\t\tPlanetary Data");
        System.out.println("Planet\tDiameter(Km)\tMass(Kg)\tg (m/s^2)");
        System.out.println("-----------------------------------------------");
        
        for(int i = 0; i < gravity.length; i++)
        {
            System.out.printf("%-10.8s", planetNames[i]);
            System.out.printf("%10.2f", diameter[i] / 1000.0);
            System.out.printf("%12.2E", mass[i]);
            System.out.printf("%12.2f%n", gravity[i]);   
        }
    }
    public static void writeToFile(double[] gravity) throws IOException
    {
        File fileName= new File("gravity.txt");
        PrintWriter outFile = new PrintWriter(fileName);
        for(int index = 0; index < gravity.length; index++)
        {
            outFile.println(gravity[index]);
        }
        outFile.close();
    }    
}