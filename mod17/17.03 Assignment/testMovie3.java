/**
 * Write a description of class testMovie2 here.
 *
 * @author Sam Stephens
 * @version 3.8.20
 */
public class testMovie3
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
        int posmax;
	for (int i = movies.length - 1 ; i > 0 ; i-- )
	{	
	        posmax = 0;
		for (int k = 1 ; k <= i ; k++ )
		{
			String title = movies[k].getTitle();
			String posmaxTitle = movies[posmax].getTitle();

			if (title.compareTo(posmaxTitle) > 0 && a == 1)
			{
				posmax = k;
			}
			else if(title.compareTo(posmaxTitle) < 0 && a == 2)
			{
				posmax = k;
                        }
                }
		Movie temp = movies[i];
		movies[ i ] = movies[ posmax ];
		movies[ posmax ] = temp;
	}
	return movies;
    }
    public static Movie[] sortByYear(Movie [] movies, int a)
    {
        int i;
        int k;
        int posMax;
        Movie temp;
        for ( i = movies.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 1 ; k <= i ; k++ )
            {
                if ( movies[ k ].getYear() > movies[ posMax ].getYear() && a == 1)
                    posMax = k;
                else if(movies[ k ].getYear() < movies[ posMax ].getYear() && a == 2)
                posMax = k;
            }
            temp = movies[ i ];
            movies[ i ] = movies[posMax ];
            movies[ posMax ] = temp;
        }
        return movies;
    }

     public static Movie[] sortByStudio(Movie [] movies, int a)
    {
         int posmax;
	for (int i = movies.length - 1 ; i > 0 ; i-- )
	{	
	        posmax = 0;
		for (int k = 1 ; k <= i ; k++ )
		{
			String studio = movies[k].getStudio();
			String posmaxStudio = movies[posmax].getStudio();

			if (studio.compareTo(posmaxStudio) > 0 && a == 1)
			{
				posmax = k;
			}
			else if(studio.compareTo(posmaxStudio) < 0 && a == 2)
			{
				posmax = k;
                        }
                }
		Movie temp = movies[i];
		movies[ i ] = movies[ posmax ];
		movies[ posmax ] = temp;
	}
	return movies;
	}
}
