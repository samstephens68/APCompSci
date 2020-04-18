
/**
 * Write a description of class frequency here.
 *
 * @author Sam Stephens
 * @version 2/22/20
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class frequency
{
    //instance variables
    private String userFile;
    private String token = "";
    private Scanner inFile;
    private File file;
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int [] array = new int[alphabet.length()];
    private int count = 0;
    private PrintWriter outFile;
     
    //constructor
    public frequency(String userFile, File file) throws IOException
    {
        this.userFile = userFile;
        this.file = file;
    }

    //method to read data from file
    public void readFromFile() throws IOException
    {
        inFile = new Scanner(file);
        while(inFile.hasNextLine())
        {
            token = inFile.next();
            for(int i = 0; i < token.length(); i++) 
            {
                if(token.charAt(i) == 'a' || token.charAt(i) == 'A')
                {   
                    array[0] = array[0] + 1;
                    count++;
                }
                if(token.charAt(i) == 'b' || token.charAt(i) == 'B')
                {   
                    array[1]++;
                    count++;
                }
                if(token.charAt(i) == 'c' || token.charAt(i) == 'C')
                {   
                    array[2]++;
                    count++;
                }
                if(token.charAt(i) == 'd' || token.charAt(i) == 'D')
                {   
                    array[3]++;
                    count++;
                }
                if(token.charAt(i) == 'e' || token.charAt(i) == 'E')
                {   
                    array[4]++;
                    count++;
                }
                if(token.charAt(i) == 'f' || token.charAt(i) == 'F')
                {   
                    array[5]++;
                    count++;
                }
                if(token.charAt(i) == 'g' || token.charAt(i) == 'G')
                {   
                    array[6]++;
                    count++;
                }
                if(token.charAt(i) == 'h' || token.charAt(i) == 'H')
                {   
                    array[7]++;
                    count++;
                }
                if(token.charAt(i) == 'i' || token.charAt(i) == 'I')
                {   
                    array[8]++;
                    count++;
                }
                if(token.charAt(i) == 'j' || token.charAt(i) == 'J')
                {   
                    array[9]++;
                    count++;
                }
                if(token.charAt(i) == 'k' || token.charAt(i) == 'K')
                {   
                    array[10]++;
                    count++;
                }
                if(token.charAt(i) == 'l' || token.charAt(i) == 'L')
                {   
                    array[11]++;
                    count++;
                }
                if(token.charAt(i) == 'm' || token.charAt(i) == 'M')
                {   
                    array[12]++;
                    count++;
                }
                if(token.charAt(i) == 'n' || token.charAt(i) == 'N')
                {   
                    array[13]++;
                    count++;
                }
                if(token.charAt(i) == 'o' || token.charAt(i) == 'O')
                {   
                    array[14]++;
                    count++;
                }
                if(token.charAt(i) == 'p' || token.charAt(i) == 'P')
                {   
                    array[15]++;
                    count++;
                }
                if(token.charAt(i) == 'q' || token.charAt(i) == 'Q')
                {   
                    array[16]++;
                    count++;
                }
                if(token.charAt(i) == 'r' || token.charAt(i) == 'R')
                {   
                    array[17]++;
                    count++;
                }
                if(token.charAt(i) == 's' || token.charAt(i) == 'S')
                {   
                    array[18]++;
                    count++;
                }
                if(token.charAt(i) == 't' || token.charAt(i) == 'T')
                {   
                    array[19]++;
                    count++;
                }
                if(token.charAt(i) == 'u' || token.charAt(i) == 'U')
                {   
                    array[20]++;
                    count++;
                }
                if(token.charAt(i) == 'v' || token.charAt(i) == 'V')
                {   
                    array[21]++;
                    count++;
                }
                if(token.charAt(i) == 'w' || token.charAt(i) == 'W')
                {   
                    array[22]++;
                    count++;
                }
                if(token.charAt(i) == 'x' || token.charAt(i) == 'X')
                {   
                    array[23]++;
                    count++;
                }
                if(token.charAt(i) == 'y' || token.charAt(i) == 'Y')
                {   
                    array[24]++;
                    count++;
                }
                if(token.charAt(i) == 'z' || token.charAt(i) == 'Z')
                {   
                    array[25]++;
                    count++;
                }
            }
        }
        inFile.close();
    }
    
    public void calcFreq() //method to perform frequency analysis
    {
        System.out.println("Here are your results: ");
        System.out.println("Letter   # Of Occurences   Percentages");
        for(int inc = 0; inc < 26; inc++)
        {
            System.out.printf("%c: %12d %19.3f %%  %n", (char)(inc + 65), array[inc], ((double)array[inc] / (double)count) * 100);
        }
        System.out.println("Total amount of letters: " + count);   
    }
    public void writeToFile() throws IOException //method to write to new file
    {
        outFile = new PrintWriter(userFile + "Freq.txt");
        for(int inc = 0; inc < 26; inc++)
        {
            outFile.printf("%c %12d %19.3f %n", (char)(inc + 65), array[inc], ((double)array[inc] / (double)count) * 100);
        }
        outFile.close();
    }
}
    
  