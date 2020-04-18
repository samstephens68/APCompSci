
/**
 * Write a description of class Opti here.
 *
 * @author Sam Stephens
 * @version 3/1/20
 **/
public class Opti extends Sailboat
{
    private double  sailboatCost;
    private String  sailboatName;
    public Opti()
    {
        super();
    }
    public void sail(double cost)
    {
        sailboatName = "Opti";
        sailboatCost = cost;
    }
    public double getCost()
    {
        return sailboatCost;
    }
    public String getName()
    {
        return sailboatName;
    }
}
