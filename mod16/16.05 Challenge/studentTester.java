
/**
 * Write a description of class studentTester here.
 *
 * @author Sam Stephens
 * @version 3.6.20
 */
import java.util.*;
public class studentTester
{
    public static void main(String [] args)
    {
        List<Student> students = new ArrayList<Student>();
        
        students.add( new Student("Sam Stephens", 100, 100, 100, 100, 100));
        students.add( new Student("Tyler Coats", 98, 99, 44, 93, 100));
        students.add( new Student("Lars Samuel", 23, 69, 94, 62, 89));
        students.add( new Student("Lukas Strain", 56, 44, 63, 85, 87));
        students.add( new Student("Eric Shoe", 92, 94, 78, 64, 91));
        
        printScores(students);
        
        //method to replace name by name
        replaceName(students, "Lukas Strain", "Bob Elenbaas");
        printScores(students);
        
        //method to replace single quiz score
        replaceQuiz(students, "Tyler", 3, 100);
        printScores(students);
        
        //method to replace a student by name
        replaceStudent(students, "Lars Samuel", "Sean Schroeder", 59, 39, 25, 64, 23);
        printScores(students);
        
        //method to insert a student before another by name
        insertBefore(students, "Sam Stephens", "Murphy Stephens", 99, 99, 99, 99, 99);
        printScores(students);
        
        //delete a student by name
        deleteStudentByName(students, "Sean Schroeder");
        printScores(students);
    }
    public static void printScores(List<Student> list)
    {
        System.out.println("Student Grades :\n");
        System.out.println("Student name\t\tQ1\tQ2\tQ3\tQ4\tQ5");
        System.out.println("====================================================");
        for(Student print : list)
        {
            if(print != null)
            System.out.println(print.toString());
        }
        System.out.println();
    }
    public static void replaceName(List<Student> list, String oldName, String newName)
    {
        for(Student name : list)
        {
            if(oldName == name.getName() && name != null)
            {
                name.setName(newName);
                System.out.println(" << Changing " + oldName + " to " + newName + " >>\n");
            }
        }
    }
    public static void replaceQuiz(List<Student> list, String name, int position, int newGrade)
    {
        for(Student quiz: list)
        {
            if(quiz.getName() == name && quiz != null)
            {
                quiz.setQuiz(position, newGrade);
                System.out.println(" << Changing " + quiz.getName() + " at position " + position + " to grade " + newGrade + " >>");
            }
        }
    }
    public static void replaceStudent(List<Student> list, String oldName, String newName, int q1, int q2, int q3, int q4, int q5)
    {
        for(Student both : list)
        {
            if(oldName == both.getName() && both != null)
            {
                both.setName(newName);
                both.setAllQuiz(q1, q2, q3, q4, q5);
                System.out.println(" << Changing " + oldName + " to " + newName + " and updating grades >>");
            }
        }
    }
    public static void insertBefore(List<Student> list, String oldName, String newName, int q1, int q2, int q3, int q4, int q5)
    {
        int location = 0;
        for(int index = 0; index < list.size(); index++)
            if(list.get(index).getName().equals(oldName))
                location = index;
                   
        list.add( location, new Student(newName, q1, q2, q3, q4, q5));
        
        System.out.println("<< Before " + oldName + ", add " + newName  + " >>");
        System.out.println();
    }
    public static void deleteStudentByName(List<Student> list, String name)
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