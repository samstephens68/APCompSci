
/**
 * will show you your TDEE after the user
 *sets the parameters
 * @author Sam Stephens
 * @version 10/10/19
 */

import java.util.Scanner;
public class TDEE
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter your name: ");
      String name = in.next();
      name += in.nextLine();
      
      System.out.println("Please enter your BMR: ");
      String BMR = in.next();
      
      System.out.println("Please enter your Gender: (M/F)");
      String gender = in.next();

              
      System.out.println("");
      System.out.println("Select Your Activity Level");
      System.out.println("[A] Resting (Sleeping, Reclining)");
      System.out.println("[B] Sedentary Minimal Movement)");
      System.out.println("[C] Light (Sitting, Standing)");
      System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
      System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
      System.out.println("[F] Extremely Active (Full-time Athlete, Heavy, Manual Labor)");
      System.out.println("Enter the letter corresponding to your activity level: ");
      String activityLevel = in.next();
      double TDEE = 0.0;
      double activityFactor = 0.0;
      if(gender.equalsIgnoreCase("M") == true)
      {
         if(activityLevel.equalsIgnoreCase("A") == true)
          {
              activityFactor = 1.0;
              TDEE = Double.parseDouble(BMR) * activityFactor;
           }
         if(activityLevel.equalsIgnoreCase("B") == true)
          {
              activityFactor = 1.3;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("C") == true)
          {
              activityFactor = 1.6;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("D") == true)
          {
              activityFactor = 1.7;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("E") == true)
          {
              activityFactor = 12.1;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("F") == true)
          {
              activityFactor = 2.4;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         
         
        }
      else if(gender.equalsIgnoreCase("F") == true)
      {
         if(activityLevel.equalsIgnoreCase("A") == true)
          {
              activityFactor = 1.0;
              TDEE = Double.parseDouble(BMR) * activityFactor;
           }
         if(activityLevel.equalsIgnoreCase("B") == true)
          {
              activityFactor = 1.3;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("C") == true)
          {
              activityFactor = 1.6;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("D") == true)
          {
              activityFactor = 1.7;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("E") == true)
          {
              activityFactor = 12.1;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
         if(activityLevel.equalsIgnoreCase("F") == true)
          {
              activityFactor = 2.4;
              TDEE = Double.parseDouble(BMR) * activityFactor;
            }
        }
      else 
      {
          System.out.println("invalid choice");
        }
      System.out.println("Your Results");
      System.out.println("Name: " + name);
      System.out.println("Gender: " + gender);
      System.out.println("BMR = " + BMR);
      System.out.println("Activity Factor: " + activityFactor);
      System.out.println("TDEE = " + TDEE + " Calories");
      
      
      
    }
 
}
