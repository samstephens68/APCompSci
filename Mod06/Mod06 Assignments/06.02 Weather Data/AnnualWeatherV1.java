/**
 * Annual Weather description: This program
 * will format and display weather statistics.
 * 
 * @author Sam Stephens
 * @version 10/31/19
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void main (String [ ] args)
    {
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Miami";
        String state = "Florida";
        String tempChoice;
        String precipChoice;
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        double [] temperature ={68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};     //initialize with Fahrenheit values
        double [] precipitation ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};      //initialize with inch values        
        double newTemp [] = new double[12];
        double newPrecip [] = new double[12];
        double totalTemp = 0;
        double totalPrecip = 0;
        double avgTemp = 0;
        double avgPrecip = 0;
        String tempLabel = "";
        String precipLabel= "";
        int tempGoodChoice = 0;
        int precipGoodChoice = 0;
        int index = 0;
        int length = 0;
        
        System.out.println("Choose the temperature scale: (C = Celsius or F = Fahrenheit)");
        do
        {
          tempChoice = in.next();
        if(tempChoice.equalsIgnoreCase("c"))
        {            
            for(index = 0; index < temperature.length; index++)
            {
                newTemp[index] = (((temperature[index] - 32.0) * 5.0) / 9.0);
            }
            tempLabel = "C";
            tempGoodChoice++;
        }
        else if(tempChoice.equalsIgnoreCase("f"))
        {                    
            for(index = 0; index < temperature.length; index++)
            {
            newTemp[index] = temperature[index];
            }
            tempLabel = "F";
            tempGoodChoice++;
        }
        }while(tempGoodChoice == 0);
        
        System.out.println("Would you like precipitation measured in inches or centimeters? (i or c)");
        do
        {
          precipChoice = in.next();
        if(precipChoice.equalsIgnoreCase("c"))
        {
            for(index = 0; index < precipitation.length; index++)
            {
                newPrecip[index] = (precipitation[index] * 2.54);
            }
            precipLabel = "cm.";
            precipGoodChoice++;
        }
        else if(precipChoice.equalsIgnoreCase("i"))
        {            
            for(index = 0; index < precipitation.length; index++)
            {
            newPrecip[index] = precipitation[index];
        }
            precipLabel = "in.";
            precipGoodChoice++;
        }
        }while(precipGoodChoice == 0);
        
        //Processing - calculate average temperature and total precipitation
        for(index = 0; index < temperature.length; index++)
        {
            totalTemp += newTemp[index];
            totalPrecip += newPrecip[index];      
        }   
        avgTemp = totalTemp / (double)newTemp.length;
    
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for(index = 0; index < temperature.length; index++)
        {
            System.out.printf("%-3s", month[index]);
            System.out.print(".\t\t");
            System.out.printf("%.1f", newTemp[index]);
            System.out.print("\t\t");
            System.out.printf("%.1f%n", newPrecip[index]);
        }
        System.out.println("***************************************************");
        System.out.print("Average: \t");
        System.out.printf("%.1f", avgTemp);
        System.out.print("\t\tAnnual: ");
        System.out.printf("%.1f%n", totalPrecip);
    }//end main
}//end class

//test code
// double [] testTemperature ={58.2, 34.5, 23.5, 55.3, 34.5, 87.6, 11.2, 56.6, 99.5, 21.3, 44,2, 11.7};     
// double [] testPrecipitation ={4.5, 6.4, 6.4, 8.6, 2.2, 1.6, 7.6, 5.0, 6.3, 8.5, 9.2, 2.0};     