
/**
 * Write a description of class SquarePrism4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquarePrism4 extends Box4
{
    public SquarePrism4(int l, int w, int h)
    {
        super(l,w,h);
    }
    
    // String to display when object is printed.
        public String toString()
    {
        return "Square Prism - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
