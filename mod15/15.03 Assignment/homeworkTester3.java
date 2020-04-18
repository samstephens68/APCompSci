
/**
 * Write a description of class homeworkTester here.
 *
 * @author Sam Stephens
 * @version 2/24/20
 */
import java.util.ArrayList;
public class homeworkTester3
{
    public static void main(String [] args)
    {
        //instantiate objects
        Precalc3 vectors = new Precalc3();
        APChem3 kEQ = new APChem3();
        APLAC3 paper = new APLAC3();
        APCompSci3 challengeProgram = new APCompSci3();
                       
        //call methods
        vectors.setAssignment(34);
        kEQ.setAssignment(42);
        paper.setAssignment(57);
        challengeProgram.setAssignment(23);
        vectors.reading(20);
        kEQ.reading(6);
        paper.reading(56);
        challengeProgram.reading(20);
        
        
        //declare ArrayList
        ArrayList <Homework3> list = new ArrayList<Homework3>();
        
        //store objects to ArrayList
        list.add( vectors);
        list.add(kEQ);
        list.add(paper);
        list.add(challengeProgram);
        
        //display results in for:each loop
        System.out.println("Tonight's Homework:");
        System.out.println("*****************************************");
        for(Homework3 stuff : list)
        {
            System.out.println(stuff);
        }
        System.out.println("");
    }
}
