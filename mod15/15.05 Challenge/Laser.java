
/**
 * Write a description of class Laser here.
 *
 * @author Sam Stephens
 * @version 3/1/20
 */
public class Laser extends Sailboat
{
    private double  sailboatCost;
    private String  sailboatName;
    public Laser()
    {
        super();
    }
    public void sail(double cost)
    {
        sailboatName = "Laser";
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
