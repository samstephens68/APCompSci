
/**
 * Write a description of class orange here.
 *
 * @author Sam Stephens
 * @version 12/27/19
 */
public class orange
{
        //private instance variables
        private int[] degrees;
        private int[] speed;
        private double[][] distance = new double[6][5];
        private double[] mps = new double[6];
        private double radians = 0.0;
        private double distanceMeters = 0.0;
        
        //constructor
        orange(int[] speed, int[] degrees)
        {
            this.degrees = degrees;
            this.speed = speed;
        }
        
        //method to convert mph to m/s
        public void convertToMetersPerSec()
        {
            for(int count = 0; count < this.speed.length; count++)
            {
                this.mps[count] = (double)this.speed[count] * .44704;
            }
        }
        
        //mutator method to calculate distance
        public void calcDistance()
        {
            for(int row = 0; row < this.degrees.length; row++)
            {
               for(int column = 0; column < this.speed.length; column++)
               {
                   this.radians = Math.toRadians(((double)this.degrees[row] * 2));
                   distanceMeters = ((this.mps[column] * this.mps[column]) * Math.sin(this.radians)) / 9.8;
                   this.distance[row][column] = distanceMeters;
                 }
            }
        }
        
        //getter method to return multidim array
        public double[][] getDistance()
        {
          return this.distance;
        }
        
    }
