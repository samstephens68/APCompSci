
/**
 * The purpose of this program is to calculate
 * different characteristics of a sailboat 
 * using an array of objects
 *
 * @author Sam Stephens
 * @version 11/22/19
 */
public class sailboatV8
{
    private int mydirection;
    private double myspeed;
    private double mytripTime;
    private String mycompass;
    private String myname;
    
    //constructor
    sailboatV8(String name, int direction, double speed)
    {
        myname = name;
        mydirection = direction;
        myspeed = speed;
        mytripTime = 0.0;
        mycompass = "";
    }
    
    //mutator method to return direction string
    public void findHeading()
    {
        if(mydirection >= 0 && mydirection <= 89)
        mycompass = "North";
        if(mydirection >= 90 && mydirection <= 179)
        mycompass = "West";
        if(mydirection >= 180 && mydirection <= 269)
        mycompass = "South";
        if(mydirection >= 270 && mydirection <= 359)
        mycompass = "East";
    }
    
    //mutator method to calculate and return expected time
    public void expectedTime()
    {
        double boatSpeedConstant = 1.33;
        double hours = 5.0;
        mytripTime = hours / (boatSpeedConstant * myspeed);
    }
    
    // getter method to return the heading of sailboatV8 type
     public int getdirection()
    {
        return mydirection;
    }
    
    //getter method to return the speed of sailboatV8 type
     public double getspeed()
    {
        return myspeed;
    }
    
    //getter method to return the string "heading"
     public String getstring()
    {
        return mycompass;
    }
    
    //getter method to return the tripTime
    public double gettripTime()
    {
        return mytripTime;
    }
    
    //getter method to return the name
    public String getname()
    {
        return myname;
    }
    
    //setter method to assign speed to the object
    public void setSpeed(double speed)
    {
        myspeed = speed;
    }
    
    //setter method to assign compass reading to the object
    public void setdirection(int direction)
    {
        mydirection = direction;
    }
    
    //setter method to assign a name to the object
    public void setName(String name)
    {
        myname = name;
    }
    
    //toString method
    public String toString()
    {
    	return String.format("%-12s %9d %14.1f %13.1f, %12s", myname,
                                                       mydirection,
                                                       myspeed,
                                                       mytripTime,
                                                       mycompass);
    }
}//end class
