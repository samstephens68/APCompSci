/**
 * Write a description of class testMovie2 here.
 *
 * @author Sam Stephens
 * @version 3.8.20
 */
public class testMovie2
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
        movies = sortByTitle(movies, 1);
        System.out.println("<< sorted by Title in ascending order >>");
        printMovie(movies);
        
        movies = sortByTitle(movies, 2);
        System.out.println("<< sorted by Title in descending order >>");
        printMovie(movies);
        
        //print array sorted by year
        movies = sortByYear(movies, 1);
        System.out.println("<< sorted by Year in ascending order >>");
        printMovie(movies);
        
        movies = sortByYear(movies, 2);
        System.out.println("<< sorted by Year in descending order >>");
        printMovie(movies);
        
        //print array sorted by Production Studio
        movies = sortByStudio(movies, 1);
        System.out.println("<< sorted by Studio in ascending order >>");
        printMovie(movies);
        
        movies = sortByStudio(movies, 2);
        System.out.println("<< sorted by Studio in descending order >>");
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
    public static Movie[] sortByTitle(Movie [] movies, int a)
    {
       Movie[] sorted = new Movie[ movies.length ];
        
        if(a == 1)
        {
            for( int i = 0 ; i < movies.length ; i++ )
            {
            Movie next = movies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
               if( next.getTitle().compareTo(sorted[k-1].getTitle()) > 0 )
                {
                    insertIndex = k;
                }
                else if(next.getTitle().compareTo(sorted[k-1].getTitle()) < 0)
                {
                    sorted[ k ] = sorted[ k - 1 ];
                }
                k--;
            }
            sorted[ insertIndex ] = next;
            }
        }
        else if(a == 2)
        {
            for( int i = 0 ; i < movies.length ; i++ )
            {
            Movie next = movies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo(sorted[k-1].getTitle()) < 0 )
                {
                    insertIndex = k;
                }
                else if(next.getTitle().compareTo(sorted[k-1].getTitle()) > 0)
                {
                    sorted[ k ] = sorted[ k - 1 ];
                }
                k--;
            }
            sorted[ insertIndex ] = next;
            }
        }
        return sorted;
    }
    public static Movie[] sortByYear(Movie [] movies, int a)
    {
        Movie[] sorted = new Movie[ movies.length ];
        
        if(a == 1)
        {
            for( int i = 0 ; i < movies.length ; i++ )
            {
            Movie next = movies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() > sorted[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else if( next.getYear() < sorted[k-1].getYear() )
                {
                    sorted[ k ] = sorted[ k - 1 ];
                }
                k--;
            }
            sorted[ insertIndex ] = next;
            }
        }
        else if(a == 2)
        {
            for( int i = 0 ; i < movies.length ; i++ )
            {
            Movie next = movies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() < sorted[k-1].getYear() )
                {
                    insertIndex = k;
                }
                else
                {
                    sorted[ k ] = sorted[ k - 1 ];
                }
                k--;
            }
            sorted[ insertIndex ] = next;
            }
        }
        return sorted;
    }
     public static Movie[] sortByStudio(Movie [] movies, int a)
    {
       Movie[] sorted = new Movie[ movies.length ];
        
        if(a == 1)
        {
            for( int i = 0 ; i < movies.length ; i++ )
            {
            Movie next = movies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
               if( next.getStudio().compareTo(sorted[k-1].getStudio()) >= 0 )
                {
                    insertIndex = k;
                }
                else if(next.getStudio().compareTo(sorted[k-1].getStudio()) < 0)
                {
                    sorted[ k ] = sorted[ k - 1 ];
                }
                k--;
            }
            sorted[ insertIndex ] = next;
            }
        }
        else if(a == 2)
        {
            for( int i = 0 ; i < movies.length ; i++ )
            {
            Movie next = movies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getStudio().compareTo(sorted[k-1].getStudio()) <= 0 )
                {
                    insertIndex = k;
                }
                else if(next.getStudio().compareTo(sorted[k-1].getStudio()) > 0)
                {
                    sorted[ k ] = sorted[ k - 1 ];
                }
                k--;
            }
            sorted[ insertIndex ] = next;
            }
        }
        return sorted;
    }
}
