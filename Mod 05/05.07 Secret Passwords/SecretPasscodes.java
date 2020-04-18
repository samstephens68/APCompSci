
/**
 * This program will allow a user to enter a parameters and
 *   will generate a random password within them.
 *
 * @author Sam Stephens
 * @version 10/23/19
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class SecretPasscodes
{
    public static void main(String args[]) throws IOException
    {
        File fileName= new File("password.txt");
        PrintWriter outFile = new PrintWriter(fileName);
        
        Scanner in = new Scanner(System.in);
        String password;
        String select;
        String newPassword;
        int passwordContent = 0;
        int selection = 0;
        int i;
        int flag = 0;
        Random rand = new Random();
        
        
        System.out.println("Password Generator Menu");
        System.out.println("**********************************************");
        System.out.println("*   [1] Lowercase Letters                 *");
        System.out.println("*   [2] Uppercase letters                 *");
        System.out.println("*   [3] Upper and Lowercase letters       *");
        System.out.println("*   [4] Letters and Numbers               *");
        System.out.println("*   [5] Quit                              *");
        System.out.println("**********************************************");
        
        while(flag == 0)
        {
            System.out.println("Enter Selection (1-5): ");
            select = in.next();
            System.out.println("");
            while((Integer.parseInt(select) < 1) || (Integer.parseInt(select) > 5))
            {
                System.out.println("\t" + "Invalid Option. Please try again");
                select = in.next();
            }
            
            
            
            if(Integer.parseInt(select) == 1)
            {
                System.out.println("Enter Password Length (6 or more): ");
                password = in.next();
                System.out.println("");
                while(Integer.parseInt(password) < 6)
                {
                    System.out.println("\t" + "Password length too short. Please try again");
                    password = in.next();
                }   
                int count = Integer.parseInt(password);
                
                for(i = 1; i < count; i++)
                {
                      outFile.print((char)(rand.nextInt(25) + 97)); 
                }
                outFile.println((char)(rand.nextInt(25) + 97));
            }
            else if(Integer.parseInt(select) == 2)
            {
                System.out.println("Enter Password Length (6 or more): ");
                password = in.next();
                System.out.println("");
                while(Integer.parseInt(password) < 6)
                {
                    System.out.println("\t" + "Password length too short. Please try again");
                    password = in.next();
                }   
                int count = Integer.parseInt(password);
                
                for(i = 1; i < count; i++)
                {
                    outFile.print((char)(rand.nextInt(25) + 65));
                }
                outFile.println((char)(rand.nextInt(25) + 65));
            }
            else if(Integer.parseInt(select) == 3)
            {
                System.out.println("Enter Password Length (6 or more): ");
                password = in.next();
                System.out.println("");
                while(Integer.parseInt(password) < 6)
                {
                    System.out.println("\t" + "Password length too short. Please try again");
                    password = in.next();
                }   
                int count = Integer.parseInt(password);
                
                for(i = 1; i < count; i++)
                {
                    passwordContent = rand.nextInt(2);
                    if(passwordContent == 1)
                    {
                        outFile.print((char)(rand.nextInt(25) + 97));
                    }
                    else
                    {
                        outFile.print((char)(rand.nextInt(25) + 65));
                    }
                }
                outFile.println((char)(rand.nextInt(25) + 65));
            }
            else if(Integer.parseInt(select) == 4)
            {
                System.out.println("Enter Password Length (6 or more): ");
                password = in.next();
                System.out.println("");
                while(Integer.parseInt(password) < 6)
                {
                    System.out.println("\t" + "Password length too short. Please try again");
                    password = in.next();
                }   
                int count = Integer.parseInt(password);
                
                for(i = 1; i < count; i++)
                {
                    passwordContent = rand.nextInt(3);
                    if(passwordContent == 0)
                    {
                        outFile.print((char)(rand.nextInt(10) + 48));
                    }
                    else if(passwordContent == 1)
                    {
                        outFile.print((char)(rand.nextInt(25) + 97));
                    }
                    else
                    {
                        outFile.print((char)(rand.nextInt(25) + 65));
                    }
                    
                }
                outFile.println((char)(rand.nextInt(10) + 48));
            }
            else
            {
              flag = 1;  
            }
            
        }
        outFile.close();
        
         Scanner inFile = new Scanner(fileName);
        int numberOfPasswords = 0;
        System.out.println("Thank you for using the Password Generator");
        System.out.println("Here are your randomly generated passwords");
        while(inFile.hasNextLine())
        {
           numberOfPasswords++;
           System.out.println(numberOfPasswords + "\t" + inFile.nextLine());
        }
        
        }
        
    }
