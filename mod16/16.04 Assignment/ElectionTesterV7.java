
/**
 * Write a description of class ElectionTesterV1 here.
 *
 * @author Sam Stephens
 * @version 3.6.20
 */
public class ElectionTesterV7
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
        int [] arrally = new int[10];
        System.out.print(arrally[0]);
   
        //original results
        printTable(array, totalVotes);
        System.out.println("");
        
         int x = 1;
     int y = 8;

     while((x / y >= 0) && (y != 0) )
     {
          x += 1;
          y -= 2;
     }
        /*
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
        */  
        
        //print table after inserting new candidate
        insertByNum(array, 3, "Jon", 3000);
        totalVotes = findTotal(array);
        printTable(array, totalVotes);
        System.out.println();
        
        //print results after inserting new candidate by name
        insertByName(array, "Tyler", "Eric", 2);
        totalVotes = findTotal(array);
        printTable(array, totalVotes);
        System.out.println();
        
        //print results after deleting by position
        deleteByPosition(array, 2);
        totalVotes = findTotal(array);
        printTable(array, totalVotes);
        System.out.println();
        
        //print results after deleting by name
        deleteByName(array, "Jon");
        totalVotes = findTotal(array);
        printTable(array, totalVotes);
        
        
    }
    public static void printArray(Candidate [] array)
    {
        System.out.println("Raw election data: ");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != null)
            System.out.println(array[i]);
        }
    }
    public static int findTotal(Candidate [] array)
    {
        int totalVotes = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != null)
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
            if(array[i] != null)
            {
                System.out.printf("%-6s %15d %15.3f", array[i].getName(), array[i].getVotes(), ((double)array[i].getVotes() / (double)totalVotes) * 100.0);
                System.out.println();
            }
        }
        System.out.println("");
        System.out.println("Total votes cast in election: " + totalVotes);
        System.out.println("");
    }
    public static void nameChange(Candidate [] array, String oldName, String newName)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(oldName == array[i].getName() && array[i] != null)
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
            if(array[i].getName() == name && array[i] != null)
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
            if(oldName == array[i].getName() && array[i] != null)
            {
                array[i].setName(newName);
                array[i].setVotes(newVotes);
                System.out.println(" << Changing " + oldName + " to " + newName + " and votes to " + newVotes + " >>");
            }
        }
    }
    public static void insertByNum(Candidate [] array, int position, String name, int votes)
    {
        for(int i = array.length - 1; i > position; i--)
           array[i] = array[i-1];

        array[position] = new Candidate(name, votes);
        
        System.out.println("<< In position 4, add ," + name + ", " + votes + " >>");
        System.out.println();
    }
    public static void insertByName(Candidate [] array, String oldName, String newName, int votes)
    {
        int location = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].getName() == oldName && array[i] != null)
            {
               location = i;
               break;
            }
            else if(array[i] == null)
            {
                location = i;
                break;
            }
        }
        for(int i = array.length - 1; i > location; i--)
           array[i] = array[i - 1];
                   
        array[location] = new Candidate(newName, votes);
        
        System.out.println("<< Before " + oldName + ", add " + newName + ", " + votes + " >>");
        System.out.println();
    }     
    public static void deleteByPosition(Candidate [] array, int position)
    {
        if ((position > 0) && (position < array.length))
        {
            //move items up in the array -
            for(int i = position; i < array.length -1; i++)
                array[i] = array[i + 1];

            array[array.length-1] = null;
            
            System.out.println("<< Delete location " + position + " >>");
            System.out.println();
        }
    }
    public static void deleteByName(Candidate [] array, String name)
    {
        int location = 0;
        int index;

        // find location of item you want to delete
        for(index = 0; index < array.length; index++)
            if((array[index] != null) && (array[index].getName().equals(name)))
            {
                location = index;
                break;
            }
            else if(array[index] == null)
            {
                location = -1;
                break;
            }

        if ((index != array.length) && (location >= 0))
        { 
            //move items up in the array
            for(index = location; index < array.length -1; index++)
                array[index] = array[index + 1];

            array[array.length-1] = null;
        }
        
        System.out.println("<< Delete " + name + " >>");
        System.out.println();
    }
}