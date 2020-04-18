
/**
 * Write a description of class orange here.
 *
 * @author Sam Stephens
 * @version 12/27/19
 */
public class orange
{
        //private instance variables
        private int[] mydegrees;
        private int[] myspeed;
        private double[][] mydistance = new double[6][5];
        private double[] mymps = new double[6];
        private double myradians = 0.0;
        private double distanceMeters = 0.0;
        
        //constructor
        orange(int[] speed, int[] degrees)
        {
            mydegrees = degrees;
            myspeed = speed;
        }
        
        //method to convert mph to m/s
        public void convertToMetersPerSec()
        {
            for(int count = 0; count < myspeed.length; count++)
            {
                mymps[count] = (double)myspeed[count] * .44704;
            }
        }
        
        //mutator method to calculate distance
        public void calcDistance()
        {
            for(int row = 0; row < mydegrees.length; row++)
            {
               for(int column = 0; column < myspeed.length; column++)
               {
                   myradians = Math.toRadians(((double)mydegrees[row] * 2));
                   distanceMeters = ((mymps[column] * mymps[column]) * Math.sin(myradians)) / 9.8;
                   mydistance[row][column] = distanceMeters;
                 }
            }
        }
        
        //getter method to return multidim array
        public double[][] getDistance()
        {
          return mydistance;
        }
        
    }
