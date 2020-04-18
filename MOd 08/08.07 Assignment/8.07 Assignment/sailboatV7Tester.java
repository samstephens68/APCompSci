
/**
 * Displays the results of methods that calculate results of objects
 *
 * @author Sam Stephens
 * @version 12/13/19
 */
public class sailboatV7Tester
{
    public static void main(String[] args)
    {
        //declare & initialize variables
        int directionL = 246; int directionH = 123; int directionS = 345;
        double speedL = 6.4; double speedH = 23.1; double speedS = 3.4;
        String stringL = ""; String stringH = ""; String stringS  = "";
        double tripTimeL = 0; double tripTimeH = 0; double tripTimeS = 0;
        
        //create objects
        sailboatV7 samsLaser = new sailboatV7(directionL, speedL, tripTimeL, stringL);
        sailboatV7 samsHobie = new sailboatV7(directionH, speedH, tripTimeH, stringH);
        sailboatV7 samsSunfish = new sailboatV7(directionS, speedS, tripTimeS, stringS);
        
        //print result
        System.out.print("Boat's Direction(degrees)\tBoats's Heading\n");
        System.out.printf("%-4d", directionL);
        System.out.print("\t\t\t\t");
        System.out.printf("%4.5s%n", samsLaser.findHeading(directionL));
        System.out.print("Boat Speed\tExpected Travel Time\n");
        System.out.printf("%-4.2f", speedL);
        System.out.printf("%17.2f", samsLaser.expectedTime(speedL));
        System.out.print("\n");    
        System.out.print("Boat's Direction(degrees)\tBoats's Heading\n");
        System.out.printf("%-4d", directionH);
        System.out.print("\t\t\t\t");
        System.out.printf("%4.5s%n", samsLaser.findHeading(directionH));
        System.out.print("Boat Speed\tExpected Travel Time\n");
        System.out.printf("%-4.2f", speedH);
        System.out.printf("%17.2f", samsLaser.expectedTime(speedH));
        System.out.print("\n");        
        System.out.print("Boat's Direction(degrees)\tBoats's Heading\n");
        System.out.printf("%-4d", directionS);
        System.out.print("\t\t\t\t");
        System.out.printf("%4.5s%n", samsLaser.findHeading(directionS));
        System.out.print("Boat Speed\tExpected Travel Time\n");
        System.out.printf("%-4.2f", speedS);
        System.out.printf("%17.2f", samsLaser.expectedTime(speedS));
        System.out.print("\n");
    }//end main method}
}
