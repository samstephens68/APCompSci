
/**
 * To show what the odds of having different combinations of kids are
 *
 * @author Sam Stephens
 * @version 10/17/19
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String args[]) throws IOException
    {
        
        String token = "";
        File Test2 = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(Test2);
        int maleMale = 0;
        int maleFemale = 0;
        int femaleFemale = 0;
        int count = 0;
        
        while( inFile.hasNextLine() )
        {
            token = inFile.next();
            if(token.equalsIgnoreCase("gb") || token.equalsIgnoreCase("bg"))
            {
                maleFemale++;
            }
            else if(token.equalsIgnoreCase("gg"))
            {
                femaleFemale++;
            }
            else if(token.equalsIgnoreCase("bb"))
            {
                maleMale++;
            }
            count++;
        } 
        inFile.close();
        
        System.out.println("Statistics for families with two children:");
        System.out.println("");
        System.out.println("Total number of families: " + count);
        System.out.println("");
        System.out.println("Number of families  with");
        System.out.print("\t \t 2 boys: " + maleMale + " Represents:");
        System.out.format("%.3f", ((double)maleMale / (double)count) * 100);
        System.out.println("%");
        System.out.print("\t \t 2 girls: " + femaleFemale + " Represents: ");
        System.out.format("%.3f", ((double)femaleFemale / (double)count) * 100);
        System.out.println("%");
        System.out.print("\t \t 1 boy and 1 girl: " + maleFemale + " Represents: ");
        System.out.format("%.3f", ((double)maleFemale / (double)count) * 100);
        System.out.println("%");
    }
}
