
/**
 * Write a description of class bread here.
 *
 * @author Sam Stephens
 * @version 3.14.20
 */
public class bread
{
    private String name; private int number;
    private double price; private int quantity;
    
    public bread(String name, int number, double price, int quantity)
    {
        this.name = name;
        this.number = number;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    public double getPrice()
    {
        return price;
    }
   
    public void setPrice(double price)
    {
        this.price = price;
    }
   
    public String toString()
    {
        String str = String.format("%-30s  %-6d $ %1.2f %8d", name, number, price, quantity);
        return str;
    }
    }
