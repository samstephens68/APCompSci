
/**
 * Write a description of class Student here.
 *
 * @author Sam Stephens
 * @version 3.6.20
 */
public class Student
{
    private String name;
    private int [] scores = new int[5];
    
    public Student(String n, int s1, int s2, int s3, int s4, int s5)
    {
        name = n;
        scores[0] = s1;
        scores[1] = s2;
        scores[2] = s3;
        scores[3] = s4;
        scores[4] = s5;
    }
    public int getQuizValue(int number)
    {
        return scores[number];
    }
    public void setQuiz(int position, int score)
    {
        scores[position] = score;
    }
    public void setAllQuiz(int s1, int s2, int s3, int s4, int s5)
    {
        scores[0] = s1;
        scores[1] = s2;
        scores[2] = s3;
        scores[3] = s4;
        scores[4] = s5;
    }        
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String toString()
    {
        return name + "\t\t" + scores[0] + "\t" + scores[1] + "\t" + scores[2] + "\t" + scores[3] + "\t" + scores[4];
    }
}
