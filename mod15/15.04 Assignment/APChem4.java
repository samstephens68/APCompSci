
/**
 * Write a description of class APChem here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public class APChem4 extends Homework4
{
    private int numPages; private int afterReading;
    private String typeOfWork;
    public APChem4()
    {
        super(12);
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "AP Chemistry";
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
