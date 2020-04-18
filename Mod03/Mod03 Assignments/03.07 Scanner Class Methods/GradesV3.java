
/**
 * This program will allow you to input your 
 * test scores and find the average
 * 
 * @author Sam Stephens 
 * @version 09/22/19
 */
import java.util.Scanner;    //imports Scanner methods
public class GradesV3
{
    public static void main(String[ ] args)
    {
        //local variables    
        Scanner in = new Scanner(System.in);
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        System.out.println("Please enter the Student's first name:  ");
        String firstName = in.next();
        System.out.println("Please enter the Student's last name:  ");
        String lastName = in.next();
        
        System.out.println("Please enter the class subject:  ");
        String subject = in.next();
        
        //display the grade on a test and the average
        System.out.print("Enter your first test grade: ");
        int firstGrade = in.nextInt();          
        
        System.out.print("Enter your second test grade: ");
        int secondGrade = in.nextInt(); 
                  
        System.out.print("Enter your third test grade: ");
        int thirdGrade = in.nextInt(); 
        
        System.out.println();
        System.out.println("Student Name: " + firstName + lastName);
        System.out.println("Subject: " + subject);
        System.out.println("Test scores: "); 
        System.out.println();
        
        numTests++;
        totalPoints += firstGrade;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests + " Test Grade: "+ firstGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);
        
        numTests++;
        totalPoints += secondGrade;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests + " Test Grade: "+ secondGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average); 
          
        numTests++;
        totalPoints += thirdGrade;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests + " Test Grade: "+ thirdGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);  
    }//end of main method
}//end of class
