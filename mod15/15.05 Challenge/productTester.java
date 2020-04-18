/**
 * Write a description of class productTester here.
 *
 * @author Sam Stephens
 * @version 3/1/20
 */
import java.util.*;
public class productTester
{
    public static void main(String [] args)
    {
        //create objects
        Laser myboat = new Laser();
        Opti sailboat2 = new Opti();
        Laser myboat2 = new Laser();
        Opti sailboat4 = new Opti();
        Tools tool1 = new Tools();
        Tools tool2 = new Tools();
        
        //invoke methods
        myboat.sail(500.00);
        sailboat2.sail(400);
        myboat2.sail(1000);
        sailboat4.sail(400);
        tool1.sail(20);
        tool2.sail(40);
        
        //create arrayList and store products to it
        List<Product> list = new ArrayList<Product>();
        list.add(myboat);
        list.add(myboat2);
        list.add(sailboat2);
        list.add(sailboat4);
        list.add(tool1);
        list.add(tool2);
        
        takeInventory(list, "Laser");
        takeInventory(list, "Opti");
        takeInventory(list, "Hammer");
 
        //print comparisons using compareTo interface
        System.out.println("Comparing the Tools");
        System.out.println("--------------------------------------------------");
        if(tool1.compareTo(tool2) < 0)
            System.out.println("The first hammer is least expensive with a cost of $" + tool1.getCost());
        if(tool1.compareTo(tool2) == 0)
            System.out.println("The hammers are the same with a cost of $" + tool1.getCost());
        if(tool1.compareTo(tool2) > 0)
            System.out.println("The second hammer is least expensive with a cost of $" + tool2.getCost());
    }
    public static void takeInventory(List<Product> list, String s)
    {
        //print inventory
        System.out.println("Inventory");
        System.out.println("================================================");
        int quantity = 0; double totalCost = 0;
        for(Product check : list)
        {
            if(check.getName().equalsIgnoreCase(s))
            {
                quantity +=1;
                totalCost += check.getCost();
            }
        }
        System.out.println(s + ": Quantity = " + quantity  + ", Total cost = " + totalCost);
    }
}
