/**
 * Annual Weather description:
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
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        double [] temperature ={68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};     //initialize with Fahrenheit values
        double [] precipitation ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};      //initialize with inch values
        double totalTemp = 0;
        double totalPrecip = 0;
        double avgTemp = 0;
        double avgPrecip = 0;
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
 
        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            totalTemp += temperature[index];
            totalPrecip += precipitation[index];      
        }   
        avgTemp = totalTemp / (double)temperature.length;
        avgPrecip = totalPrecip / (double)temperature.length;
    
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.print(month[index] + "\t \t");
            System.out.print(temperature[index] + "\t \t");
            System.out.print(temperature[index]);
            System.out.println("");
        }
        System.out.println("Average: " + "    Total: ");
        System.out.println(avgTemp + "\t \t" + avgPrecip);
    }//end main
}//end class