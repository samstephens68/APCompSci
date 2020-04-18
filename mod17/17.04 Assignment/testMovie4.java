/**
 * Write a description of class testMovie4 here.
 *
 * @author Sam Stephens
 * @version 3.8.20
 */
public class testMovie4
{
    public static void main(String [] args)
    {
        Movie [] movies = new Movie[10];
        
        //declare movie objects
        movies[0] = new Movie("Turbo", 2013, "Dreamworks");
        movies[1] = new Movie("Nemo", 2003, "Pixar");
        movies[2] = new Movie("The Incredibles", 2004, "Pixar");
        movies[3] = new Movie("Roma", 2018, "Espectaculos");
        movies[4] = new Movie("Knives out", 2019, "Lionsgate");
        movies[5] = new Movie("The Avengers", 2012, "Marvel");
        movies[6] = new Movie("Shrek", 2001, "Dreamworks");
        movies[7] = new Movie("Shrek 2", 2004, "Dreamworks");
        movies[8] = new Movie("Shrek 3", 2007, "Dreamworks");
        movies[9] = new Movie("Shrek Forever After", 2010, "Dreamworks");
        
        //print unsorted array
        System.out.println("<< \tunsorted array \t>>");
        printMovie(movies);
        
        //print array sorted by title
        mergeSortTitle(movies, 0, movies.length - 1);
        System.out.println("<< sorted by Title in ascending order >>");
        printMovie(movies);
        
        //print array sorted by year
        mergeSortYear(movies, 0, movies.length - 1);
        System.out.println("<< sorted by Year in ascending order >>");
        printMovie(movies);
        
        //print array sorted by Production Studio
        mergeSortStudio(movies, 0, movies.length - 1);
        System.out.println("<< sorted by Studio in ascending order >>");
        printMovie(movies);
    }
    public static void printMovie(Movie [] movies)
    {
        System.out.println("Title\tYear\t\t\t\tStudio");
        System.out.println("-----------------------------------------------------");
        for(int i = 0; i < movies.length; i++)
        {
            System.out.println(movies[i].toString());
        }
        System.out.println();
    }
    public static void mergeSortTitle(Movie [] movies, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortTitle( movies, low, mid );
        mergeSortTitle( movies, mid + 1, high);     
        mergeTitle( movies, low, mid, high);
    }
    public static void mergeSortYear(Movie [] movies, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortYear( movies, low, mid );
        mergeSortYear( movies, mid + 1, high);        
        mergeYear( movies, low, mid, high);
    }
    public static void mergeSortStudio(Movie [] movies, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortStudio( movies, low, mid );
        mergeSortStudio( movies, mid + 1, high);             
        mergeStudio( movies, low, mid, high);
    }
    public static void mergeYear( Movie[] movies, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if( movies[ i ].getYear() < movies[ j ].getYear() )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }
        for( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];
    }
    public static void mergeTitle( Movie[] movies, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if( movies[ i ].getTitle().compareTo(movies[ j ].getTitle()) < 0)
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }
        for( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];
    }
    public static void mergeStudio( Movie[] movies, int low, int mid, int high )
    {
        Movie[] temp = new Movie[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if( movies[ i ].getStudio().compareTo(movies[ j ].getStudio()) < 0 )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }
        for( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];
    }
}
