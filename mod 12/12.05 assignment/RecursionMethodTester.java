
/**
 * This class tests the recursive method for
 * the given Piecewise function.
 *
 * @author Elle Navan
 * @version 06/12/17
 */
class RecursiveMethods
{
    RecursiveMethods()          // default constructor
    {
    }

    public void fOf(int x)
    {
        if( x >5)           // the base case
        {
               // recursive call
             System.out.print(x + " ");
        }
        else
        {
            
            fOf(x+3); 
        }
    }
}

public class RecursionMethodTester
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();
        x = 1;
        rMethods.fOf(x);    
    }
    public static String recur(String str, int n)
{
     if(n >= str.length())
     {
          return str;
     }

     return str + recur(str.substring(n+1), n);
}
public static void recur(String str)
{
     int len = str.length();
     String temp = "" ;
     if(len > 1)
     {
          temp = str.substring(0, len - 2);
          System.out.println(temp);
          recur(temp);
          
     }
}



}


