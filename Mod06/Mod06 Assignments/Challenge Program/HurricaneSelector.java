
/**
 * This program will display information about
 * hurricanes from a file
 *
 * @author Sam Stephens
 * @version 11/04/19
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HurricaneSelector
{
    public static void main(String args[]) throws IOException
    {
       Scanner in = new Scanner(System.in);
       File file = new File("hurricane.txt");
       Scanner inFile = new Scanner(file); 
       PrintWriter outFile = new PrintWriter("Summary.txt");
       int count = 156;
       int year [] = new int[count];
       String [] month = new String[count];
       double windSpeed[] = new double[count];
       int pressure[] = new int[count];
       String name [] = new String[count];      
       int category [] = new int[count];
       int index = 0;
       int catOne = 0;
       int catTwo = 0;
       int catThree = 0;
       int catFour = 0;
       int catFive = 0;
       double speedAvg = 0;
       double pressureAvg = 0;
       double categoryAvg = 0;
       int minCategory = Integer.MAX_VALUE;
       int maxCategory = Integer.MIN_VALUE;
       int minPressure = Integer.MAX_VALUE;
       int maxPressure = Integer.MIN_VALUE;
       double minSpeed = Double.MAX_VALUE;
       double maxSpeed = Double.MIN_VALUE;
       
       
       
       while(inFile.hasNextLine())
         {
            year[index] = Integer.parseInt(inFile.next());
            month[index] = inFile.next();
            pressure[index] = Integer.parseInt(inFile.next());
            windSpeed[index] = Integer.parseInt(inFile.next());
            name[index] = inFile.nextLine();
            index++;
        }
       inFile.close();
       for(int i = 0; i < count; i++)
        {
            windSpeed[i] = windSpeed[i] * 1.15078;
        }
       
       for(int i = 0; i < count; i++)
       {
                if(windSpeed[i] >= 74 && windSpeed[i] <= 95)
       {
           category[i] = 1;
        }
         else if(windSpeed[i] >= 96 && windSpeed[i] <= 110)
       {
           category[i] = 2;
        }
       else if(windSpeed[i] >= 111 && windSpeed[i] <= 129)
       {
           category[i] = 3;
        }
       else if(windSpeed[i] >= 130 && windSpeed[i] <= 156)
       {
           category[i] = 4;
        }
       else if(windSpeed[i] >= 157)
       {
           category[i] = 5;
        }
        
    }
    System.out.println("Enter the lower bound number of year range for hurricane data(between 1995 and 2015): ");
            String lowerYearString = in.next();
            int yearMin = Integer.parseInt(lowerYearString);
            System.out.println("Enter the upper bound number of year range for hurricane data(between 1995 and 2015): ");
            String upperYearString = in.next();
            int yearMax = Integer.parseInt(upperYearString);
            while(((yearMax < 1995 || yearMax > 2015) || (yearMin < 1995 || yearMin > 2015)) || (yearMin > yearMax))
            {
                System.out.println("Invalid Years");
                System.out.println("Enter the lower bound number of year range for hurricane data(between 1995 and 2015): ");
                lowerYearString = in.next();
                yearMin = Integer.parseInt(lowerYearString);
                System.out.println("Enter the upper bound number of year range for hurricane data(between 1995 and 2015): ");
                upperYearString = in.next();
                yearMax = Integer.parseInt(upperYearString);
            }

    System.out.println("Hurricanes " + yearMin + " - " + yearMax);
            System.out.println("");
            System.out.printf("%-8s","Year");
            System.out.printf("%-14s", "Hurricane");
            System.out.printf("%-13s", "Category");
            System.out.printf("%-18s", "Pressure (mb)");
            System.out.printf("%-16s%n", "Wind Speed (mph)");
            System.out.println("======================================================================");   
    for(int i = 0; i < count; i++)
            {
                if(year[i] <= yearMax && year[i] >= yearMin)
                {
                    categoryAvg += category[i];
                    pressureAvg += pressure[i];
                    speedAvg += windSpeed[i];
                    if(category[i] < minCategory)
                    {
                        minCategory = category[i];
                    }
                    else if(category[i] > maxCategory)
                    {
                        maxCategory = category[i];
                    }
                    if(pressure[i] < minPressure)
                    {
                        minPressure = pressure[i];
                    }
                    else if(pressure[i] > maxPressure)
                    {
                        maxPressure = pressure[i];
                    }
                    if(windSpeed[i] < minSpeed)
                    {
                        minSpeed = windSpeed[i];
                    }
                    else if(windSpeed[i] > maxSpeed)
                    {
                        maxSpeed = windSpeed[i];
                    }
                    if(category[i] == 1)
                    {
                        catOne++;
                    }
                    else if(category[i] == 2)
                    {
                        catTwo++;
                    }
                    else if(category[i] ==3)
                    {
                        catThree++;
                    }
                    else if(category[i] == 4)
                    {
                        catFour++;
                    }
                    else
                    {
                        catFive++;
                    }
                    System.out.printf("%-6d", year[i]);
                    System.out.printf("%-16s", name[i]);
                    System.out.printf("%-13d", category[i]);
                    System.out.printf("%-18d", pressure[i]);
                    System.out.printf("%-16.2f%n", windSpeed[i]);
                    
                }
            }
            System.out.println("======================================================================");
            System.out.printf("%-22s","Average: ");
            System.out.printf("%-13.1f", categoryAvg / count );
            System.out.printf("%-18.1f",pressureAvg / count);
            System.out.printf("%-16.2f%n", speedAvg / count);
            System.out.printf("%-22s","Minimum: ");
            System.out.printf("%-13d", minCategory);
            System.out.printf("%-18d", minPressure);
            System.out.printf("%-16.2f%n", minSpeed);
            System.out.printf("%-22s","Maximum: ");
            System.out.printf("%-13d",maxCategory);
            System.out.printf("%-18d", maxPressure);
            System.out.printf("%-16.2f%n", maxSpeed);
            System.out.println("Summary of Categories:");
            System.out.println("Cat 1: " + catOne);
            System.out.println("Cat 2: " + catTwo);
            System.out.println("Cat 3: " + catThree);
            System.out.println("Cat 4: " + catFour);
            System.out.println("Cat 5: " + catFive);
            
            outFile.println("Category 1 = " + catOne);
            outFile.println("Category 2 = " + catTwo);
            outFile.println("Category 3 = " + catThree);
            outFile.println("Category 4 = " + catFour);
            outFile.println("Category 5 = " + catFive);
            outFile.close(); 
    }
}