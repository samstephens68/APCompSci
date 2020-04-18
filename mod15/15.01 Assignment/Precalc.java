
/**
 * Write a description of class Precalc here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public class Precalc extends Homework
{
    private int numPages;
    private String typeOfWork;
    public Precalc()
    {
        super();
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "Precalculus";
    }
    public String toString()
    {
        return typeOfWork + " - read " + numPages + " pages.";
    }
}
