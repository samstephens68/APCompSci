
/**
 * Write a description of class studentTester here.
 *
 * @author Sam Stephens
 * @version 3.27.20
 */
public class studentTester
{
    public static void main(String [] args)
    {
        double [] scores1 = { 45, 89, 97, 65 };
        double [] scores2 = {};
        
        //test first name exception
        //Student st1 = new Student("", "stephens", scores1);
        
        //test last name exception
        //Student st2 = new Student("sam", "", scores1);
        
        //test empty array exception
        //Student st3 = new Student("sam", "stephens", scores2);
        
        //test correct declaration
        Student st4 = new Student("sam", "stephens", scores1);
        
        System.out.println("First name   Last name  scores\t\tLetter grade");
        //System.out.println(st1);
        //System.out.println(st2);
        //System.out.println(st3);
        System.out.println(st4);
    }
}
