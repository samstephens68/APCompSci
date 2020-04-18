
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class test
{
    public static void main(String [] args)
    {
        int[ ] arr = {17, 34, 43, 71};
int i = 0;
while(i < arr.length)
{
   if((arr[i] % 2) == 1)
   {
      arr[i] = arr[i] % 3;
   }
   else
   {
      arr[i] = arr[i] / 3;
   }
   i++;
}
for(int c = 0; c < arr.length; c++)
{
    System.out.println(arr[c]);
}
}
}

