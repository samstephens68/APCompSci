/**
 * Write a description of class orangeTester here.
 *
 * @author Sam Stephens
 * @version 12/27/19
 */
public class orangeTester
{
  public static void main(String args[])
    {
    //declare variables
    int[] degrees = {25, 30, 35, 40, 45, 50};
    int[] speed = {20, 25, 30, 35, 40};
    double[][] orangeSpeed = new double[6][6];
    
    //initialize object
    orange orangeCatapult = new orange(speed, degrees);
    
    //invoke methods & store values
    orangeCatapult.convertToMetersPerSec();
    orangeCatapult.calcDistance();
    orangeSpeed = orangeCatapult.getDistance();
  
    //print results
    System.out.println("\t\t\tOrange travel distance");
    System.out.println("MPH\t25 deg\t30 deg\t 35 deg\t 40 deg\t45 deg\t50 deg");
    System.out.println("*****************************************************************");
    for(int row = 0; row < speed.length; row++)
    {
        System.out.printf("%-10d", speed[row]);
                for(int column = 0; column < orangeSpeed[row].length; column++)
        {
            System.out.printf("%-10.2f", orangeSpeed[row][column]);
        }
        System.out.println("");
    }    
  }
}
