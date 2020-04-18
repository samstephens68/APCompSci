
/**
 * Write a description of class Hurricane here.
 *
 * @author Sam Stephens
 * @version 12/19/19
 */
public class Hurricane
{
    private int year;
    private String name;
    private int category;
    private int pressure;
    private double windSpeed;
          
    //constructor
    Hurricane(int year, String name, int pressure, double windspeed)
    {
        this.year = year;
        this.name = name;
        this.pressure = pressure;
        this.windSpeed = windspeed;        
    }
    
    //mutator method for category determination
    public void findCategory()
    {
                         if(this.windSpeed >= 74 && this.windSpeed <= 95)
       {
           this.category = 1;
        }
         else if(this.windSpeed >= 96 && this.windSpeed <= 110)
       {
           this.category = 2;
        }
       else if(this.windSpeed >= 111 && this.windSpeed <= 129)
       {
           this.category = 3;
        }
       else if(this.windSpeed >= 130 && this.windSpeed <= 156)
       {
           this.category = 4;
        }
       else if(this.windSpeed >= 157)
       {
           this.category = 5;
        }
     }
    
    //get methods
    public int getYear()
    {
        return this.year;
    }    
    public String getName()
    {
        return this.name;
    }
    public int getPressure()
    {
        return this.pressure;
    }
    public double getWindSpeed()
    {
        return this.windSpeed;
    }
    public int getCategory()
    {
        return this.category;
    }
    
    
}
