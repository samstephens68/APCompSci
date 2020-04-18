/**
 * Write a description of class frequencyTester here.
 *
 * @author Sam Stephens
 * @version 2/22/20
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class frequencyTester
{
    public static void main(String args[]) throws IOException
    {
        //declare variables
        Scanner in = new Scanner(System.in);
        String userFile;
        
        //input filename & initialize file
        System.out.println("Please input the file you would like to use: ");
        userFile = in.next();
        File file = new File(userFile + ".txt");

        //create object & invoke methods
        frequency freq = new frequency(userFile, file);
        freq.readFromFile();
        freq.calcFreq();
        freq.writeToFile();
    }
}
