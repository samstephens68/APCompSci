/**
 * Write a description of class circleTester here.
 *
 * @author Sam Stephens
 * @version 2/8/20
 */
import java.util.ArrayList;
public class circleTester
{
    public static void main(String args[])
    {
        Circle2 circle3 = new Circle2(2,3,4);
        Cylinder2 cylinder = new Cylinder2(1,2,3,3);
        Oval2 oval = new Oval2(1,2,3,4);
        OvalCylinder2 ovalCylinder = new OvalCylinder2(1,2, 4,3,5);  
        ArrayList<Circle2> shape = new ArrayList<Circle2>();
        shape.add(circle3);
        shape.add(cylinder);
        shape.add(oval);
        shape.add(ovalCylinder);
        for(Circle2 circle: shape)
        {
            showCenter(circle);
        }
    }
    public static void showCenter(Circle2 shape)
    {
        System.out.println("For this " + shape.getName() + " the " +shape.getCenter());
        
    }
}
