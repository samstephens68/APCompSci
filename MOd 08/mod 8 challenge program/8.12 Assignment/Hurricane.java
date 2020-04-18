
/**
 * Write a description of class Hurricane here.
 *
 * @author Sam Stephens
 * @version 12/19/19
 */
public class Hurricane
{
    private int myyear;
    private String myname;
    private int mycategory;
    private int mypressure;
    private double mywindSpeed;
          
    //constructor
    Hurricane(int year, String name, int pressure, double windspeed)
    {
        myyear = year;
        myname = name;
        mypressure = pressure;
        mywindSpeed = windspeed;        
    }
    
    //mutator method for category determination
    public void findCategory()
    {
                         if(mywindSpeed >= 74 && mywindSpeed <= 95)
       {
           mycategory = 1;
        }
         else if(mywindSpeed >= 96 && mywindSpeed <= 110)
       {
           mycategory = 2;
        }
       else if(mywindSpeed >= 111 && mywindSpeed <= 129)
       {
           mycategory = 3;
        }
       else if(mywindSpeed >= 130 && mywindSpeed <= 156)
       {
           mycategory = 4;
        }
       else if(mywindSpeed >= 157)
       {
           mycategory = 5;
        }
     }
    
    //get methods
    public int getYear()
    {
        return myyear;
    }    
    public String getName()
    {
        return myname;
    }
    public int getPressure()
    {
        return mypressure;
    }
    public double getWindSpeed()
    {
        return mywindSpeed;
    }
    public int getCategory()
    {
        return mycategory;
    }
    
    
}
