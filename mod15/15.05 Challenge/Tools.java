
/**
 * class Tools - write a description of the class here
 *
 * @author Sam Stephens
 * @version 3.5.20
 */
public class Tools extends Sailboat implements Product, Comparable<Product>
{
    private String toolName;
    private double toolCost;
    private int quantity;
    
    public Tools()
    {
        toolName = "none";
        toolCost = 0;
    }
    public double getCost()
    {
        return toolCost;
    }
    public String getName()
    {
        return toolName;
    }
    public void sail(double cost)
    {
        toolName = "Hammer";
        toolCost = cost;
    }
    public int compareTo(Product obj)
    {
        if(toolCost < obj.getCost())
        return -1;
        if(toolCost == obj.getCost())
        return 0;
        else
        return 1;
    }
}