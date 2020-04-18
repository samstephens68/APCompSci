
/**
 * Abstract class Sailboat - write a description of the class here
 *
 * @author Sam Stephens
 * @version 3/1/20
 */
public abstract class Sailboat implements Product
{
    private String sailboatName;
    private double sailboatCost;
    
    Sailboat()
    {
        sailboatName = "none";
        sailboatCost = 0;
    }
    public double getCost()
    {
        return sailboatCost;
    }
    public String getName()
    {
        return sailboatName;
    }
    
    public abstract void sail(double cost);
}

