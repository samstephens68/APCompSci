
/**
 * The purpose of this program is to count the number of
 * tickets sold and the amount of money received.
 * 
 * @author Meg Abyte 
 * @version 06/02/17
 */
public class CopyOfGradesV2
{
    public static void main(String[ ] args)
    {
        //local variables       
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        int counter = 0;
        
        //display the grade on a test and the average
        testGrade = 95;    
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);  
        
        testGrade = 73;
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average); 
        
        testGrade = 91;
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);
        
        testGrade = 82;
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);
        
        testGrade = 83;    
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);  
        
        testGrade = 100;
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average); 
        
        testGrade = 69;
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);
        
        testGrade = 48;
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);
        
        testGrade = 12;
        counter++;
        totalPoints += testGrade;
        average = totalPoints / (double)counter;
        System.out.print("Test # " + counter + " Test Grade: "+ testGrade);
        System.out.println("    Total points: " + totalPoints + "   Average Score: " + average);
    }//end of main method
}//end of class
