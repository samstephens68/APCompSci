
/**
 * Write a description of class breadTester here.
 *
 * @author Sam Stephens
 * @version 3.14.20
 */
public class breadTester
{   
    public static void main(String [] args)
    {
        bread [] loaves = new bread[10];
        loaves[0] = new bread("Rye", 100, 2.99, 125);
        loaves[1] = new bread("Banana", 101, 2.45, 378);
        loaves[2] = new bread("Zucchini", 102, 4.69, 245);
        loaves[3] = new bread("Italian", 103, 2.34, 786);
        loaves[4] = new bread("Wheat", 104, 6.54, 374);
        loaves[5] = new bread("Pumpernickel", 105, 2.57, 786);
        loaves[6] = new bread("Baguette", 106, 7.43, 567);
        loaves[7] = new bread("Cornbread", 107, 1.23, 486);
        loaves[8] = new bread("Tortilla", 108, 3.54, 398);
        loaves[9] = new bread("White", 109, 1.09, 451);
        
        //unsorted array
        printArray(loaves);
        
        //sorted by price using merge algorithm
        System.out.println("<< Sorted by price using merge algorithm >> ");
        mergeSortPrice(loaves, 0, loaves.length - 1);
        printArray(loaves);
        
        //sorted by Name using insertion algorithm a
        System.out.println("<< Sorted by Name using insertion algorithm(ascending) >>");
        insertSortName(loaves, 1);
        printArray(loaves);
        
        //sorted by Name using insertion algorithm d
        System.out.println("<< Sorted by Name using insertion algorithm(descending) >>");
        insertSortName(loaves, 2);
        printArray(loaves);
        
        //sorted by Product number using selection algorithm a
        System.out.println("<< Sorted by product number using selection algorithm(ascending) >>");
        selectSortNumber(loaves, 1);
        printArray(loaves);
        
        //sorted by Product number using selection algorithm d
        System.out.println("<< Sorted by product number using selection algorithm(descending) >>");
        selectSortNumber(loaves, 2);
        printArray(loaves);
    }
    public static void printArray(bread [] loaves)
    {
        System.out.println("Type of Bread\t\tProduct #\tPrice\tQuantity");
        for(int i = 0; i < loaves.length; i++)
        {
            System.out.println(loaves[i].toString());
        }
        System.out.println();
    }
    public static void insertSortName(bread[] bread, int a)
    {        
        if(a == 1)
        {
            for( int i = 0 ; i < bread.length ; i++ )
            {
            bread next = bread[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
               if( next.getName().compareTo(bread[k-1].getName()) > 0 )
                {
                    insertIndex = k;
                }
                else if(next.getName().compareTo(bread[k-1].getName()) < 0)
                {
                    bread[ k ] = bread[ k - 1 ];
                }
                k--;
            }
            bread[ insertIndex ] = next;
            }
        }
        else if(a == 2)
        {
            for( int i = 0 ; i < bread.length ; i++ )
            {
            bread next = bread[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getName().compareTo(bread[k-1].getName()) < 0 )
                {
                    insertIndex = k;
                }
                else if(next.getName().compareTo(bread[k-1].getName()) > 0)
                {
                    bread[ k ] = bread[ k - 1 ];
                }
                k--;
            }
            bread[ insertIndex ] = next;
            }
        }
    }
    public static void selectSortNumber(bread[] loaves, int a)
    {
        int i;
        int k;
        int posMax;
        bread temp;
        for ( i = loaves.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 1 ; k <= i ; k++ )
            {
                if ( loaves[ k ].getNumber() > loaves[ posMax ].getNumber() && a == 1)
                    posMax = k;
                else if(loaves[ k ].getNumber() < loaves[ posMax ].getNumber() && a == 2)
                posMax = k;
            }
            temp = loaves[ i ];
            loaves[ i ] = loaves[posMax ];
            loaves[ posMax ] = temp;
        }
    }
    public static void mergeSortPrice(bread[] loaves, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortPrice( loaves, low, mid );
        mergeSortPrice( loaves, mid + 1, high);        
        mergePrice( loaves, low, mid, high);
    }
    public static void mergePrice( bread[] loaves, int low, int mid, int high )
    {
        bread[] temp = new bread[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = loaves[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = loaves[ i ];
                i++;
            }
            else if( loaves[ i ].getPrice() < loaves[ j ].getPrice() )
            {
                temp[ n ] = loaves[ i ];
                i++;
            }
            else
            {
                temp[ n ] = loaves[ j ];
                j++;
            }
            n++;
        }
        for( int k = low ; k <= high ; k++ )
            loaves[ k ] = temp[ k - low ];
    }
}
