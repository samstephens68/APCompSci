
/**
 * Write a description of class homeworkTester here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
import java.util.*;
public class homeworkTester4
{
    public static void main(String [] args)
    {
        //instantiate objects
        Precalc4 vectors = new Precalc4();
        APChem4 kEQ = new APChem4();
        APLAC4 paper = new APLAC4();
        APCompSci4 challengeProgram = new APCompSci4();
                       
        //call methods
        vectors.setAssignment(34);
        kEQ.setAssignment(12);
        paper.setAssignment(57);
        challengeProgram.setAssignment(57);
        vectors.reading(20);
        kEQ.reading(6);
        paper.reading(30);
        challengeProgram.reading(20);
        
        
        //declare ArrayList
        List<Homework4> list = new ArrayList<Homework4>();
        
        //store objects to ArrayList
        list.add( vectors);
        list.add(kEQ);
        list.add(paper);
        list.add(challengeProgram);
        
        //display results in for:each loop
        System.out.println("Tonight's Homework:");
        System.out.println("*****************************************");
        for(Homework4 stuff : list)
        {
            System.out.println(stuff);
        }
        System.out.println("");
        
        //compare homework and organize
        System.out.println("Comparing My Homework (Before Reading)");
        System.out.println("****************************************");
        if(vectors.compareTo(kEQ) == 0)
        System.out.println("The homework for " + kEQ.getName() + " has the SAME pages to read as " + vectors.getName());
        if(vectors.compareTo(kEQ) >= 1)
        System.out.println("The homework for " + kEQ.getName() + " has LESS pages to read than " + vectors.getName());
        if(vectors.compareTo(kEQ) <= -1)
        System.out.println("The homework for " + kEQ.getName() + " has MORE pages to read than " + vectors.getName());
        
        if(vectors.compareTo(paper) == 0)
        System.out.println("The homework for " + paper.getName() + " has the SAME pages to read as " + vectors.getName());
        if(vectors.compareTo(paper) >= 1)
        System.out.println("The homework for " + paper.getName() + " has LESS pages to read than " + vectors.getName());
        if(vectors.compareTo(paper) <= -1)
        System.out.println("The homework for " + paper.getName() + " has MORE pages to read than " + vectors.getName());
        
        if(vectors.compareTo(challengeProgram) == 0)
        System.out.println("The homework for " + challengeProgram.getName() + " has the SAME pages to read as " + vectors.getName());
        if(vectors.compareTo(challengeProgram) >= 1)
        System.out.println("The homework for " + challengeProgram.getName() + " has LESS pages to read than " + vectors.getName());
        if(vectors.compareTo(challengeProgram) <= -1)
        System.out.println("The homework for " + challengeProgram.getName() + " has MORE pages to read than " + vectors.getName());
        
        if(kEQ.compareTo(paper) == 0)
        System.out.println("The homework for " + paper.getName() + " has the SAME pages to read as " + kEQ.getName());
        if(kEQ.compareTo(paper) >= 1)
        System.out.println("The homework for " + paper.getName() + " has LESS pages to read than " + kEQ.getName());
        if(kEQ.compareTo(paper) <= -1)
        System.out.println("The homework for " + paper.getName() + " has MORE pages to read than " + kEQ.getName());
        
        if(kEQ.compareTo(challengeProgram) == 0)
        System.out.println("The homework for " + challengeProgram.getName() + " has the SAME pages to read as " + kEQ.getName());
        if(kEQ.compareTo(challengeProgram) >= 1)
        System.out.println("The homework for " + challengeProgram.getName() + " has LESS pages to read than " + kEQ.getName());
        if(kEQ.compareTo(challengeProgram) <= -1)
        System.out.println("The homework for " + challengeProgram.getName() + " has MORE pages to read than " + kEQ.getName());
        
        if(challengeProgram.compareTo(paper) == 0)
        System.out.println("The homework for " + paper.getName() + " has the SAME pages to read as " + challengeProgram.getName());
        if(challengeProgram.compareTo(paper) >= 1)
        System.out.println("The homework for " + paper.getName() + " has LESS pages to read than " + challengeProgram.getName());
        if(challengeProgram.compareTo(paper) <= -1)
        System.out.println("The homework for " + paper.getName() + " has MORE pages to read than " + challengeProgram.getName());
        System.out.println();
    }
}        
