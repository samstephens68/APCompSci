
/**
 * Write a description of class APLAC here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public class APLAC3 extends Homework3
{
    private int numPages; private int afterReading;
    private String typeOfWork;
    public APLAC3()
    {
        super();
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "AP Language and Composition";
    }
    public void reading(int p)
    {
        afterReading = numPages - p;
    }
    public String toString()
    {
        return "Before reading: " + typeOfWork + " - read " + numPages + " pages to read.\nAfter reading: " + typeOfWork + " - " + afterReading + " pages to read.\n";
    }
}
