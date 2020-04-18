/**
 * This program calls up different methods
 * to display different calculations acted onto an
 * array of objects
 *
 * @author Sam Stephens
 * @version 12/13/19
 */
public class sailboatV8Tester
{
    public static void main(String[] args)
    {
        //declare & initialize variables
        int directionL = 246; int directionH = 123; int directionS = 345; int directionB = 120; int directionC = 23;
        double speedL = 6.4; double speedH = 23.1; double speedS = 3.4; double speedB = 45.4; double speedC = 4.3;
        String stringL = ""; String stringH = ""; String stringS  = ""; String stringB = ""; String stringC = "";
        double tripTimeL = 0; double tripTimeH = 0; double tripTimeS = 0; double tripTimeB = 0; double tripTimeC = 0;
        String nameL = "Laser"; String nameH = "Hobie"; String nameS = "Sunfish"; String nameB = "Butterfly"; String nameC = "C420";
        
        //create objects
        sailboatV8[] boats = { new sailboatV8(nameL, directionL, speedL),
                          new sailboatV8(nameH, directionH, speedH),
                          new sailboatV8(nameS, directionS, speedS),
                          new sailboatV8(nameB, directionB, speedB),
                          new sailboatV8(nameC, directionC, speedC),
                          
                        };
                        
        //call methods
        for(int index = 0; index <boats.length; index++)
        {
            boats[index].findHeading();
           boats[index].expectedTime();
        }
                        
                        
        //print results
        System.out.println("         Sailboats                         ");
        System.out.println(" Name     Direction(degrees)    Speed(mph)  Est. Trip Time   Direction");                    
               for(int index = 0; index < boats.length; index++)
        {
            System.out.println(boats[index]);
        }
        
        //min/max of objects
        double minSpeed = Double.MAX_VALUE;
        double maxSpeed = Double.MIN_VALUE;
        double minTime = Double.MAX_VALUE;
        double maxTime = Double.MIN_VALUE;
       
        for(int i = 0; i < boats.length; i ++)
        {
            if(boats[i].getspeed() < minSpeed)
                minSpeed = boats[i].getspeed();

            if(boats[i].gettripTime() < minTime)
                minTime = boats[i].gettripTime();
            
        }   
        
        System.out.println("Minimum:    (speed)     (trip time)");
        System.out.printf("%8.1f", minSpeed);
        System.out.print("\t");
        System.out.printf("%8.1f", minTime);
        System.out.print("\n\n");
        
        for(int i = 0; i < boats.length; i ++)
        {
            if(boats[i].getspeed() > maxSpeed)
            	maxSpeed = boats[i].getspeed();
            
            if(boats[i].gettripTime() > maxTime)
                maxTime = boats[i].gettripTime();
        }
        
        System.out.println("Maximum:    (speed)     (trip time)");
        System.out.print("\t\t");
        System.out.printf("%8.1f", maxSpeed);
        System.out.printf("%8.1f", maxTime);
        System.out.print("\n\n");
        
        //averages
        double avgSpeed = 0; double totalSpeed = 0;
        double avgTime = 0; double totalTime = 0;
        for(int index = 0; index < boats.length; index++)
        {
            totalSpeed += boats[index].getspeed();
            totalTime += boats[index].gettripTime();      
        } 
        
        System.out.println("Average:    (speed)     (trip time)");
        System.out.print("\t");
        System.out.printf("%8.1f", totalSpeed / boats.length);
        System.out.printf("%16.1f%n", totalTime / boats.length);
    }
}