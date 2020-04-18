
/**
 * Write a description of class Precalc here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public class Precalc4 extends Homework4
{
    private int numPages; private int afterReading;
    private String typeOfWork;
    public Precalc4()
    {
        super(34);
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "Precalculus";
    }
    public void reading(int p)
    {
        afterReading = numPages - p;
    }
    public String getName()
    {
        return typeOfWork;
    }
    public String toString()
    {
        return "Before reading: " + typeOfWork + " - read " + numPages + " pages to read.\nAfter reading: " + typeOfWork + " - " + afterReading + " pages to read.\n";
    }
}
