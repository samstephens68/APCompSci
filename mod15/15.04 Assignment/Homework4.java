
/**
 * Abstract class Homework - write a description of the class here
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
public abstract class Homework4 implements Processing, Comparable<Homework4>
{
    //instance variables
    private int numPages;
    private String typeOfWork;
       
    //default constructor
    public Homework4(int numOfPages)
    {
        this.numPages = numOfPages;
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
    
    //abstract methods
    public abstract void setAssignment(int pages);
    public abstract String getName();
    
    public int compareTo(Homework4 homework)
	{
	    if(this.numPages < homework.numPages)
		{
			return -1;
		}
		else if(this.numPages == homework.numPages)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
     
}
