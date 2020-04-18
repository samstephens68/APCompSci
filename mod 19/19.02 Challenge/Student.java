
/**
 * Write a description of class student here.
 *
 * @author Sam Stephens
 * @version 3.27.20
 */
public class Student
{
    private String firstName; private String lastName;
    private double[] scores; private String letter;
    
    public Student(String f, String l, double[] s)
    {
        firstName = f;
        if(firstName.length() == 0)
        throw new IllegalArgumentException("Name must be longer than 0");
        
        lastName = l;
        if(lastName.length() == 0)
        throw new IllegalArgumentException("Name must be longer than 0");
        
        scores = s;
        
        calcLetter(s);
    }
    
    //setter methods
    public void setFirst(String f)
    {
        firstName = f;
    }
    public void setLast(String l)
    {
        lastName = l;
    }
    public void setScores(double[] s)
    {
        scores = s;
    }
    
    //getter methods
    public String getFirst()
    {
        return firstName;
    }
    public String getLast()
    {
        return lastName;
    }
    public double[] getScores()
    {
        return scores;
    }
    public String getLetter()
    {
        return letter;
    }
    
    public String toString()
    {
        String s = String.format(" %-12s %-12s", firstName, lastName);
        for(double score: scores)
        {
            s += String.format("%-7.2f", score);
        }
        s += String.format("%-4s", letter);
        return s;
    }
    
    public String calcLetter(double [] scores)
    {
        if(scores.length == 0)
        throw new IllegalArgumentException("scores cannot be empty");
                
        int count = 0; double avg = 0;
        for(double score : scores)
        {
            avg += score;
            count++;
        }
        avg = avg / (double)count;
        
        if(avg >= 89.5)
        {
            letter = "A";
            return letter;
        }
        else if(avg >= 79.5)
        {
            letter = "B";
            return letter;
        }
        else if(avg >= 69.5)
        {
            letter = "C";
            return letter;
        }
        else if(avg >= 59.5)
        {
            letter = "D";
            return letter;
        }
        else
        {
            letter = "F";
            return letter;
        }
    }
}
