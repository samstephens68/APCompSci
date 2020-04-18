
/**
 * Write a description of class homeworkTester here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
import java.util.ArrayList;
public class homeworkTester
{
    public static void main(String [] args)
    {
        //instantiate objects
        Precalc vectors = new Precalc();
        APChem kEQ = new APChem();
        APLAC paper = new APLAC();
        APCompSci challengeProgram = new APCompSci();
                       
        //call methods
        vectors.setAssignment(3);
        kEQ.setAssignment(4);
        paper.setAssignment(5);
        challengeProgram.setAssignment(6);
        
        //declare ArrayList
        ArrayList <Homework> list = new ArrayList<Homework>();
        
        //store objects to ArrayList
        list.add( vectors);
        list.add(kEQ);
        list.add(paper);
        list.add(challengeProgram);
        
        //display results in for:each loop
        System.out.println("Tonight's Homework:");
        System.out.println("*****************************************");
        for(Homework stuff : list)
        {
            System.out.println(stuff);
        }    
    }
}
