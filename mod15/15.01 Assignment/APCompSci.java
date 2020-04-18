
/**
 * Write a description of class APCompSCi here.
 *
 * @author Sam Stephens
 * @version 2/26/20
 */
public class APCompSci extends Homework
{
    private int numPages;
    private String typeOfWork;
    public APCompSci()
    {
        super();
    }
    public void setAssignment(int pages)
    {
        numPages = pages;
        typeOfWork = "AP Computer Science";
    }
    public String toString()
    {
        return typeOfWork + " - read " + numPages + " pages.";
    }
}
