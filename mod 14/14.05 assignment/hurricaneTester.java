    /**
     * Write a description of class hurricaneTester here.
     *
     * @author Sam Stephens
     * @version 12/19/19
     */
    
    import java.util.Scanner;
    import java.io.File;
    import java.io.IOException;
    import java.util.ArrayList;
    public class hurricaneTester
{
        public static void main(String [] args) throws IOException
    {
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
        
        
        ArrayList<Hurricane> storms = new ArrayList<Hurricane>();
        storms.add( new Hurricane(1994, "Sam", 985, 120.0));
        storms.add( new Hurricane(1997, "Lukas", 967, 165.2));
        storms.add( new Hurricane(2002, "Robert", 955, 100.2));
        storms.add( new Hurricane(1993, "Tyler", 999, 150.6));
        storms.add( new Hurricane(2000, "Lars", 943, 98.9));
        storms.add( new Hurricane(2005, "Yash", 967, 120.2));
        storms.add( new Hurricane(1994, "Mark", 965, 134.7));
        storms.add( new Hurricane(1999, "Jon", 943, 113.6));
        storms.add( new Hurricane(1990, "Bill", 975, 103.3));
        storms.add( new Hurricane(2001, "Zuck", 988, 186.5));
        
        for(Hurricane dataRecord : storms)
        {
            dataRecord.findCategory();
        }
        
        
       
        System.out.println("");
        System.out.printf("%-8s","Year");
        System.out.printf("%-14s", "Hurricane");
        System.out.printf("%-13s", "Category");
        System.out.printf("%-18s", "Pressure (mb)");
        System.out.printf("%-16s%n", "Wind Speed (mph)");
        System.out.println("======================================================================");   
  
        Hurricane dataRecord;
        for(int index = 0; index < storms.size(); index++)
        {
            dataRecord = storms.get(index);
            System.out.printf("%-6d", dataRecord.getYear());
            System.out.printf("%-16s", dataRecord.getName());
            System.out.printf("%-13s", dataRecord.getCategory());
            System.out.printf("%-18d", dataRecord.getPressure());
            System.out.printf("%-16.2f%n", dataRecord.getWindSpeed());
            categoryAvg += dataRecord.getCategory();
            pressureAvg += dataRecord.getPressure();
            speedAvg += dataRecord.getWindSpeed();
            
            if(dataRecord.getCategory() < minCategory)
                    {
                        minCategory = dataRecord.getCategory();
                    }
                    else if(dataRecord.getCategory() > maxCategory)
                    {
                        maxCategory = dataRecord.getCategory();
                    }
            if(dataRecord.getPressure() < minPressure)
                    {
                        minPressure = dataRecord.getPressure();
                    }
                    else if(dataRecord.getPressure() > maxPressure)
                    {
                        maxPressure = dataRecord.getPressure();
                    }
            if(dataRecord.getWindSpeed() < minSpeed)
                    {
                        minSpeed = dataRecord.getWindSpeed();
                    }
                    else if(dataRecord.getWindSpeed() > maxSpeed)
                    {
                        maxSpeed = dataRecord.getWindSpeed();
                    }
            if(dataRecord.getCategory() == 1)
                    {
                        catOne++;
                    }
                    else if(dataRecord.getCategory() == 2)
                    {
                        catTwo++;
                    }
                    else if(dataRecord.getCategory() ==3)
                    {
                        catThree++;
                    }
                    else if(dataRecord.getCategory() == 4)
                    {
                        catFour++;
                    }
                    else
                    {
                        catFive++;
                    }
            }
        
       
        
            System.out.println("======================================================================");
            System.out.printf("%-22s","Average: ");
            System.out.printf("%-13.1f", categoryAvg / 10 );
            System.out.printf("%-18.1f",pressureAvg / 10);
            System.out.printf("%-16.2f%n", speedAvg / 10);
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
         }
}

             