
/**
 *
 * @author Sam Stephens
 * @version 11/22/19
 */
public class sailboatV7
{
    private int mydirection;
    private double myspeed;
    private double mytripTime;
    private String mycompass;
    
    //default constructor
    sailboatV7(int direction, double speed, double tripTime, String compass)
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

}//end class
