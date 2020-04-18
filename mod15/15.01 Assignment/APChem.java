
/**
 * Write a description of class APChem here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public class APChem extends Homework
{
    private int numPages;
    private String typeOfWork;
    public APChem()
    {
        super();
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "AP Chemistry";
    }
    public String toString()
    {
        return typeOfWork + " - read " + numPages + " pages.";
    }
}
