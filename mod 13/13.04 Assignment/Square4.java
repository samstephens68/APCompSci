
/**
 * Write a description of class Square4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square4 extends Rectangle4
{
    public Square4(int l, int w)
    {
        super(l,w);
    }
    public String toString()
    {
        return "Square - " + getLength() + " X " + getWidth();
    }
}
