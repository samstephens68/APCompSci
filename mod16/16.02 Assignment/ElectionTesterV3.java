
/**
 * Write a description of class ElectionTesterV1 here.
 *
 * @author Sam Stephens
 * @version 3.6.20
 */
public class ElectionTesterV3
{
    public static void main(String args[])
    {
        Candidate [] array = new Candidate[5];
        array[0] = new Candidate("Sam", 20000);
        array[1] = new Candidate("Tyler", 1);
        array[2] = new Candidate("Adam", 19999);
        array[3] = new Candidate("Lukas", 2);
        array[4] = new Candidate("Bob E", 4000);
        int totalVotes = findTotal(array);
        //printArray(array);
        //original results
        printTable(array, totalVotes);
        System.out.println("");
        
        //namechange results
        nameChange(array, "Bob E", "Murphy");
        printTable(array, totalVotes);
        System.out.println("");
        
        //vote change results
        voteChange(array, "Lukas", 1000);
        totalVotes = findTotal(array);
        printTable(array, totalVotes);
        System.out.println("");
        
        //changing both results
        changeBoth(array, "Lukas", "Tod", 20300);
        totalVotes = findTotal(array);
        printTable(array, totalVotes);        
    }
    public static void printArray(Candidate [] array)
    {
        System.out.println("Raw election data: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static int findTotal(Candidate [] array)
    {
        int totalVotes = 0;
        for(int i = 0; i < array.length; i++)
        {
            totalVotes += array[i].getVotes();
        }
        return totalVotes;
    }
    public static void printTable(Candidate [] array, int totalVotes)
    {
        System.out.println("Election Results: \n");
        System.out.println("\t\tVotes\t\t% of Total Votes");
        System.out.println("Candidate\tReceived\tVotes");
        System.out.println("=============================================");
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%-6s %15d %15.3f", array[i].getName(), array[i].getVotes(), ((double)array[i].getVotes() / (double)totalVotes) * 100.0);
            System.out.println();
        }
        System.out.println("");
        System.out.println("Total votes cast in election: " + totalVotes);
        System.out.println("");
    }
    public static void nameChange(Candidate [] array, String oldName, String newName)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(oldName == array[i].getName())
            {
                array[i].setName(newName);
                System.out.println(" << Changing " + oldName + " to " + newName + " >>");
            }
        }
    }
    public static void voteChange(Candidate [] array, String name, int newVotes)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].getName() == name)
            {
                array[i].setVotes(newVotes);
                System.out.println(" << Changing " + array[i].getName() + " to " + newVotes + " votes >>");
            }
        }
    }
    public static void changeBoth(Candidate [] array, String oldName, String newName, int newVotes)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(oldName == array[i].getName())
            {
                array[i].setName(newName);
                array[i].setVotes(newVotes);
                System.out.println(" << Changing " + oldName + " to " + newName + " and votes to " + newVotes + " >>");
            }
        }
    }
}

