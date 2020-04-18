
/**
 * Write a description of class APCompSCi here.
 *
 * @author Sam Stephens
 * @version 2/26/20
 */
public class APCompSci3 extends Homework3
{
    private int numPages; private int afterReading;
    private String typeOfWork;
    public APCompSci3()
    {
        super();
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "AP Computer Science";
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
