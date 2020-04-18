
/**
 * Write a description of class APLAC here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public class APLAC extends Homework
{
    private int numPages;
    private String typeOfWork;
    public APLAC()
    {
        super();
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "AP Language and Composition";
    }
    public String toString()
    {
        return typeOfWork + " - read " + numPages + " pages.";
    }
}
