
/**
 * Abstract class Homework - write a description of the class here
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public abstract class Homework
{
    //instance variables
    private int numPages;
    private String typeOfWork;
       
    //default constructor
    public Homework()
    {
        numPages = 0;
        typeOfWork = "none";
    }
    
    public void setPages(int p)
    {
        this.numPages = p;
    }
    public int getPages()
    {
        return this.numPages;
    }
    
    //abstract method
    public abstract void setAssignment(int pages);
     
}
