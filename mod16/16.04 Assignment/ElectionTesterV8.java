
/**
 * Write a description of class ElectionTesterV2 here.
 *
 * @author Sam Stephens
 * @version 3.5.20
 */
import java.util.*;
public class ElectionTesterV8
{
    public static void main(String args[])
    {
        List<Candidate> list =  new ArrayList<Candidate>();
        list.add(new Candidate("Sam", 20000));
        list.add(new Candidate("Tyler", 1));
        list.add(new Candidate("Adam", 19999));
        list.add(new Candidate("Lukas", 2));
        list.add(new Candidate("Bob E", 4000));
        int totalVotes = findTotal(list);
        //printArray(list);
        
        //print original results
        printTable(list, totalVotes);
        System.out.println();
        
        /*
        //print name change results
        nameChange(list, "Tyler", "Lars");
        printTable(list, totalVotes);
        System.out.println();
        
        //print vote change results
        voteChange(list, "Sam", 400000);
        totalVotes = findTotal(list);
        printTable(list, totalVotes);
        System.out.println();
        
        //both change results
        changeBoth(list, "Lukas", "Carson", 302020);
        totalVotes = findTotal(list);
        printTable(list, totalVotes);
        */
        //print table after inserting new candidate
        insertByNum(list, 3, "Jon", 3000);
        totalVotes = findTotal(list);
        printTable(list, totalVotes);
        System.out.println();
        
        //print results after inserting new candidate by name
        insertByName(list, "Tyler", "Eric", 2);
        totalVotes = findTotal(list);
        printTable(list, totalVotes);
        System.out.println();
        
        //print results after deleting by position
        deleteByPosition(list, 2);
        totalVotes = findTotal(list);
        printTable(list, totalVotes);
        System.out.println();
        
        //print results after deleting by name
        deleteByName(list, "Jon");
        totalVotes = findTotal(list);
        printTable(list, totalVotes);
    }
    public static void printArray(List<Candidate> list)
    {
        System.out.println("Raw election data: ");
        for(Candidate print : list)
        {
            System.out.println(print);
        }
    }
    public static int findTotal(List<Candidate> list)
    {
        int totalVotes = 0;
        for(Candidate print: list)
        {
            totalVotes += print.getVotes();
        }
        return totalVotes;
    }
    public static void printTable(List<Candidate> list, int totalVotes)
    {
        System.out.println("Election Results: \n");
        System.out.println("\t\tVotes\t\t% of Total Votes");
        System.out.println("Candidate\tReceived\tVotes");
        System.out.println("=============================================");
        for(Candidate print : list)
        {
            System.out.printf("%-6s %15d %15.3f", print.getName(), print.getVotes(), ((double)print.getVotes() / (double)totalVotes) * 100.0);
            System.out.println();
        }
        System.out.println();
        System.out.println("Total votes cast in election: " + totalVotes);
        System.out.println();
    }
    public static void nameChange(List<Candidate> list, String oldName, String newName)
    {
        for(Candidate name : list)
        {
            if(oldName == name.getName())
            {
                name.setName(newName);
                System.out.println(" << Changing " + oldName + " to " + newName + " >>");
            }
        }
    }
    public static void voteChange(List<Candidate> list, String name, int newVotes)
    {
        for(Candidate vote : list)
        {
            if(vote.getName() == name)
            {
                vote.setVotes(newVotes);
                System.out.println(" << Changing " + vote.getName() + " to " + newVotes + " votes >>");
            }
        }
    }
    public static void changeBoth(List<Candidate> list, String oldName, String newName, int newVotes)
    {
        for(Candidate both : list)
        {
            if(oldName == both.getName())
            {
                both.setName(newName);
                both.setVotes(newVotes);
                System.out.println(" << Changing " + oldName + " to " + newName + " and votes to " + newVotes + " >>");
            }
        }
    }
    public static void insertByNum(List<Candidate> list, int position, String name, int votes)
    {
        list.add(position, new Candidate(name, votes));
        
        System.out.println("<< In position 4, add ," + name + ", " + votes + " >>");
        System.out.println();
    }
    public static void insertByName(List<Candidate> list, String oldName, String newName, int votes)
    {
        int location = 0;
        for(int index = 0; index < list.size(); index++)
            if(list.get(index).getName().equals(oldName))
                location = index;
                   
        list.add( location, new Candidate(newName, votes));
        
        System.out.println("<< Before " + oldName + ", add " + newName + ", " + votes + " >>");
        System.out.println();
    }
    public static void deleteByPosition(List<Candidate> list, int position)
    {
        list.remove(position);
        
        System.out.println("<< Delete location " + position + " >>");
            System.out.println();
    }
    public static void deleteByName(List<Candidate> list, String name)
    {
        int location = 0;
        int index;

        for(index = 0; index < list.size(); index++)
        {
            if(list.get(index).getName().equals(name))
            {
                location = index;
                break;
            }
        }
        
        if (index != list.size())
            list.remove(location);
        
        System.out.println("<< Delete " + name + " >>");
        System.out.println();
    }
}
