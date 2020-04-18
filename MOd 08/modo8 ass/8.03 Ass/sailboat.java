
/**
 * The purpose of this program is to use different
 * methods to give information about where a 
 * sailboat is headed
 *
 * @author Sam Stephens
 * @version 11/22/19
 */
public class sailboat
{
    private int mydirection;
    private double myspeed;
    private double mytripTime;
    private String mycompass;
    
    //default constructor
    public sailboat(int direction, double speed, double tripTime, String compass)
    {
        mydirection = direction;
        myspeed = speed;
        mytripTime = tripTime;
        mycompass = compass;
    }
    public static String findHeading(int direction)
    {
        String heading = "";
        if(direction >= 0 && direction <= 89)
        heading = "North";
        if(direction >= 90 && direction <= 179)
        heading = "West";
        if(direction >= 180 && direction <= 269)
        heading = "South";
        if(direction >= 270 && direction <= 359)
        heading = "East";
        return heading;
    }
    public static double expectedTime(double speed)
    {
        double boatSpeedConstant = 1.33;
        double hours = 5.0;
        return hours / (boatSpeedConstant * speed);
    }
    public static void main(String[] args)
    { 
        int direction = 246;
        double speed = 6.4;
        
        sailboat samsLaser = new sailboat(246, 6.4, 0, "");
        
        System.out.print("Boat's Direction(degrees)\tBoats's Heading\n");
        System.out.printf("%-4d", direction);
        System.out.print("\t\t\t\t");
        System.out.printf("%4.5s%n", samsLaser.findHeading(direction));
        System.out.print("Boat Speed\tExpected Travel Time\n");
        System.out.printf("%-4.2f", speed);
        System.out.printf("%17.2f", samsLaser.expectedTime(speed));
        System.out.print("\n");
    }//end main method
}//end class
