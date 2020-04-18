
/**
 * Write a description of class BMI here.
 *
 * @author Sam Stephens 
 * @version 10-3-19
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String args [])
    {
     Scanner in;
     in = new Scanner(System.in);
     System.out.println("Enter your name (first last) :");
     String firstName = in.next();
     String lastName = in.next();
     
     System.out.println("Enter your weight in pounds (e.g. 175) :");
     String weight = in.next();
     System.out.println("Enter your height in feet and inches (e.g. 5 11) :");
     String heightFeet = in.next();
     String heightInches = in.next();
     double weightlb = Double.parseDouble(weight);
     double hgtFeet = Double.parseDouble(heightFeet);
     double hgtInches = Double.parseDouble(heightInches);
    
     double weightKg = weightlb / 2.205;
     double heightM = (((hgtFeet * 12) + hgtInches) * .0254);
     double BMI = weightKg / (heightM * heightM);


           
     System.out.println("");
     System.out.println("Body Mass Index Calculator");
     System.out.println("============================");
     System.out.println("Name: " + firstName + " " + lastName );
     System.out.println("Height (m): " + heightM);
     System.out.println("Weight (kg): " + weight);
     System.out.println("BMI: " + BMI);
     System.out.print("Category: " );
     if(BMI < 18.5)
     {
         System.out.println("Underweight");
        }
     else if(BMI >=18.5 && BMI <= 24.9)
     {
         System.out.println("Normal");
        }
     else if(BMI >= 25.0 && BMI <= 29.9)
     {
         System.out.println("Overweight");
        }
     else if(BMI >= 29.9)
     {
         System.out.println("Obese");
        }
    }
}
