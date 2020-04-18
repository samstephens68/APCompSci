
/**
 * This program calculates the distance a projectile will travel
 *
 * @author Sam Stephens
 * @version 1/6/20
 */
public class orange
{
    private double[] myLaunchSpeed, mydegrees;
    private double myGravity;
    private double distances[][] = new double[6][7];
    public orange(double launchSpeed[], double degrees[], double gravity)
    {
        myLaunchSpeed = launchSpeed;
        mydegrees = degrees;
        myGravity = gravity;
    }
    public void calcDistances()
    {
        for(int row = 0; row < distances.length; row++)
        {
            for(int col = 0; col < distances[row].length; col++)
            {
                distances[row][col] = (3.2808399 * (myLaunchSpeed[row] * 0.44704 * myLaunchSpeed[row]
                    * 0.44704 * Math.sin(2 * Math.toRadians(mydegrees[col])))/myGravity);
            }
        }
    }
    public double[][] getDistances()
    {
        return distances;
    }
}
