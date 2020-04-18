
/**
 * This program calculates the distance a projectile will travel
 *
 * @author Sam Stephens
 * @version 1/6/20
 */
public class orangeTester
{
    public static void main(String[] args)
    {
        double launchSpeed[] = {20, 25, 30, 35, 40, 45};
        double degrees[] = {20, 25, 30, 35, 40, 45, 50};
        double gravity = 9.8;
        
        orange orangeCatapult = new orange(launchSpeed, degrees, gravity);
        orangeCatapult.calcDistances();
        double distances[][] = orangeCatapult.getDistances();
        
        System.out.println("                       Projectiles Distance (feet)");
        System.out.print("MPH");
        for(int index = 0; index < degrees.length; index++)
        {
            System.out.printf("%6.0f", degrees[index]);
            System.out.print(" deg");
        }
        System.out.println();
        for(int row = 0; row < distances.length; row ++)
        {
            System.out.printf("%-2.0f", launchSpeed[row]);
            for(int col = 0; col < distances[row].length; col ++)
            {
                System.out.printf("%10.2f", distances[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
