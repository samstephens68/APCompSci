
/**
 * Write a description of class ElectionTesterV2 here.
 *
 * @author Sam Stephens
 * @version 3.5.20
 */
import java.util.*;
public class ElectionTesterV2
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
        printArray(list);
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
    }
}
