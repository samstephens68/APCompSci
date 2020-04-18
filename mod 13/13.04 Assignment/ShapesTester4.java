
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(5, 20);
        Rectangle4 two = new Box4(4, 10, 5);
        Rectangle4 three = new Box4(4, 4, 4);
        Rectangle4 four = new Cube4(4, 4, 4);
        Rectangle4 five = new Square4(3, 3);
        Rectangle4 six = new SquarePrism4(2, 2, 4);
        Rectangle4 seven = new Rectangle4(3, 3);

        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        shapes.add(six);
        shapes.add(seven);

        for(Rectangle4 rect: shapes)
        {
          showEffectBoth(rect);
          System.out.println();
        }
        if(three.equals(four))
        {
            System.out.println(three.toString() + " IS equal to " + four.toString());
        }
        else
        System.out.println(three.toString() + " IS NOT equal to " + four.toString());
        
        
        if(five.equals(seven))
        System.out.println(five.toString() + " IS equal to " + seven.toString());
        else
        System.out.println(five.toString() + " IS NOT equal to " + seven.toString());
        
        if(seven.equals(one))
        System.out.println(seven.toString() + " IS equal to " + one.toString());
        else
        System.out.println(seven.toString() + " IS NOT equal to " + one.toString());
    }

    public static void showEffectBoth(Rectangle4 rect)
    {
        System.out.println(rect);
    }

}
