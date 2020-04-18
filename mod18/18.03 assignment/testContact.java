
/**
 * Write a description of class testContact here.
 *
 * @author Sam Stephens
 * @version 3.25.20
 */
public class testContact
{
    public static void main(String [] args)
    {
        //declare array and initialize objects
        Contact[] list = new Contact[10];
        list[0] = new Contact("Carson", "friend", "Jun 23", "240-534-9789", "fortniterocks@gmail.com");
        list[1] = new Contact("Lars", "programmer", "Oct, 21", "234-656-7532", "lakeshoregamers@gmail.com");
        list[2] = new Contact("Lukas", "programmer", "Sep 12", "156-564-8956", "coolguy23@gmail.com");
        list[3] = new Contact("Eric", "friend", "Dec 30", "549-153-1283", "fakeemail5@gmail.com");
        list[4] = new Contact("Tyler", "friend", "Feb 22", "441-185-5885", "freevbucks@gmail.com");
        list[5] = new Contact("Bob", "teacher", "Apr 04", "455-589-1164", "minecrafters@gmail.com");
        list[6] = new Contact("Murphy", "dog", "Oct 31", "111-000-1051", "something45@gmail.com");
        list[7] = new Contact("Lucas", "teammate", "Mar 14", "151-415-4869", "grant@gmail.com");
        list[8] = new Contact("Grant", "teammate", "Jul 04", "188-022-1858", "germany@gmail.com");
        list[9] = new Contact("Race", "teammate", "Apr 20", "888-444-2222", "realmsowner@gmail.com");
        int test = 0;
        System.out.println("<<\tunsorted table\t>>");
        printTable(list);
        
        //insertion sort by name
        sortName(list);
        
        //binary search for name (found)
        test = binaryName(list, "Murphy");
        if(test != -1)
            System.out.println("Found: " + list[test]);
        else
            System.out.println("Not found. " );
        System.out.println();
       
        //binary search for name (not found)
        test = binaryName(list, "Sam");
        if(test != -1)
            System.out.println("Found: " + list[test]);
        else
            System.out.println("Not found. " );
        System.out.println();
        
        //insertion sort by relationship
        sortRelation(list);        
        
        //binary search by relation (singular)
        binaryRelation(list, "dog");
        
        //binary search by relation (multiple)
        binaryRelation(list, "programmer");
        
        //binary search by relation (none)
        binaryRelation(list, "girlfriend");
        
        //sequential search for birthdays by month(Singular)
        sequentialMonth(list, "Sep");
        
        //sequential search for birthdays by month (multiple)
        sequentialMonth(list, "Apr");
        
        //sequential search for contacts by phone number (found)
        sequentialNumber(list, "240-534-9789");
        
        //sequential search for contacts by phone number (not found)
        sequentialNumber(list, "240-534-9780");
        
        //sequential search by email (found)
        sequentialEmail(list, "fortniterocks@gmail.com");
        
        //sequential search by email (not found)
        sequentialEmail(list, "lakeshoregaming@gmail.com");
    }
    public static void printTable(Contact[] list)
    {
        System.out.println("Name\t    Relation\tBirthday\tPhone #\t\tEmail");
        System.out.println("-----------------------------------------------------------------------");
        for(int i = 0; i < list.length; i++)
            System.out.println(list[i]);
        System.out.println();
    }
    public static void sortName(Contact[] list)
    {
        Contact[] dest = new Contact[ list.length ];

        for( int i = 0 ; i < list.length ; i++ )
        {
            Contact next = list[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getName().compareTo(dest[k-1].getName()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }
            dest[ insertIndex ] = next;
        }  
        for(int i = 0; i < dest.length; i++)
             list[i] = dest[i];
    }
    public static void sortRelation(Contact[] list)
    {
        Contact[] dest = new Contact[ list.length ];

        for( int i = 0 ; i < list.length ; i++ )
        {
            Contact next = list[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getRelation().compareTo(dest[k-1].getRelation()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }
            dest[ insertIndex ] = next;
        }  
        for(int i = 0; i < dest.length; i++)
             list[i] = dest[i];
    }
    public static int binaryName(Contact[] list, String name)
    {
        int high = list.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( list[probe].getName().compareTo(name) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (list[low].getName().compareTo(name) == 0 ))
            return low;
        else
            return -1;
    }
    public static void binaryRelation(Contact[] list, String relation)
    {
        int high = list.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(list[probe].getRelation().compareTo(relation) > 0)
                high = probe;
            else
            {
                low = probe;
                if( list[probe].getRelation().compareTo(relation) == 0)
                {
                    break;
                }
            }
        }
        if( (low >= 0) && (list[low].getRelation().compareTo(relation) == 0 ))
        {
            linearPrintRelation(list, relation, low);
        }
        else
            System.out.println("NOT found: " + relation);
        System.out.println();
    }
    public static void linearPrintRelation(Contact[] list, String relation, int low)
    {
        int i;
        int start = low;
        int end = low;
        i = low - 1;
        
        while((i >= 0) && (list[i].getRelation().compareTo(relation) == 0))
        {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < list.length) && (list[i].getRelation().compareTo(relation) == 0))
        {
            end = i;
            i++;
        }
        System.out.println("Contacts with relation: " + relation);
        for(i = start; i <= end; i++)
            System.out.println(list[i]);
        System.out.println();
    }
    public static int sequentialMonth(Contact[] list, String month)
    {
        int count = 0;

        for(int i = 0; i < list.length; i++)
        {
            if(list[i].getBirthday().substring(0, 3).equals(month))
            {
                System.out.println("Contacts with birthday month " + month + " in the array:");
                System.out.println(list[i]);
                System.out.println();
                count++;
            }
        }
        if(count > 0)
        return count;        
        else
        {
            System.out.println(month + " is not in the array");
            System.out.println();
            return count;
        }
    }
    public static int sequentialNumber(Contact[] list, String number)
    {
        int c = 0;

        for(int i = 0; i < list.length; i++)
        {
            if(list[i].getPhoneNumber().compareTo(number) == 0)
            {
                System.out.println("Contacts with " + number + " in the array:");
                System.out.println(list[i]);
                System.out.println();
                c++;
            }
        }
        if(c > 0)
        return c;        
        else
        {
            System.out.println(number + " is not in the array");
            System.out.println();
            return c;
        }
    }
    public static int sequentialEmail(Contact[] list, String email)
    {
        int inc = 0;

        for(int i = 0; i < list.length; i++)
        {
            if(list[i].getEmail().compareTo(email) == 0)
            {
                System.out.println("Contacts with " + email + " in the array:");
                System.out.println(list[i]);
                System.out.println();
                inc++;
            }
        }
        if(inc > 0)
        return inc;        
        else
        {
            System.out.println(email + " is not in the array");
            System.out.println();
            return inc;
        }
    }
}
