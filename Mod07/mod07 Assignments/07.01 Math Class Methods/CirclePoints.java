
/**
 * Write a description of class CirclePoints here.
 *
 * @author Sam Stephens
 * @version 11/9/19
 */

import java.util.Scanner;
public class CirclePoints
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        double radius = 0;
        String radiusString;
        double increment = .1;
        System.out.println("Enter the radius: (Ex. 1.5)");
        radiusString = in.next();
        radius = Double.parseDouble(radiusString);
        double x1 = radius;
        System.out.println("Points on a Circle with a radius of " + radius);
        System.out.printf("%-10s%n", "x1\ty1\tx1\ty2");
        System.out.println("**************************");
        
        Math.sqrt(Math.pow(Math.abs(x1 - x1),3));
        for(x1 = radius; x1 >= -radius; x1 -= increment)
        {
            System.out.printf("%-8.2f", x1);
            System.out.printf("%-8.2f", Math.sqrt(Math.pow(radius,2.0) - Math.pow(x1,2.0)));
            System.out.printf("%-8.2f", x1);
            System.out.printf("%-8.2f%n", -Math.sqrt(Math.pow(radius,2.0) - Math.pow(x1,2.0)));
        }
    }
}
