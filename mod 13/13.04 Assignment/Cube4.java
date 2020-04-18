
/**
 * Write a description of class Cube4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cube4 extends Box4
{
    public Cube4(int l, int w, int h)
    {
        super(l,w,h);
    }
    
    // String to display when object is printed.
    
    public String toString()
    {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
