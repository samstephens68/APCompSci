
/**
 * Write a description of class musicTester1 here.
 *
 * @author Sam Stephens
 * @version 3.24.20
 */
public class musicTester3
{
    public static void main(String [] args)
    {
        Music [] songs = new Music[10];
        songs[0] = new Music("Despacito", 2019, "Luis Fonsi");
        songs[1] = new Music("SICKO MODE", 2018, "Travis Scott");
        songs[2] = new Music("Closer", 2016, "The Chainsmokers");
        songs[3] = new Music("Sorry", 2015, "Justin Bieber");
        songs[4] = new Music("Hey Ya!", 2003, "OutKast");
        songs[5] = new Music("Umbrella", 2007, "Rihanna");
        songs[6] = new Music("Mo Bamba", 2018, "Sheck Wes");
        songs[7] = new Music("Baby", 2010, "Justin Bieber");
        songs[8] = new Music("This is America", 2020, "Childish Gambino");
        songs[9] = new Music("Youngblood", 2018, "5SOS");
        int test = 0;
        
        //print unsorted array
        //System.out.println("<< \tUnsorted array\t >>");
        //printSongs(songs);
        //System.out.println();
        
         //print array sorted by title
        //System.out.println("<<\tArray sorted by title\t>>");
        sortTitle(songs);
        //printSongs(songs);        
        //System.out.println();
        
        //print the array item from a search for the song title (found)
        test = searchByTitle(songs, "Closer");
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("Not found. " );
        
            //test title search for a title that is not found
        test = searchByTitle(songs, "Kobe");
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("Not found. " );
        System.out.println();
            
        //print array sorted by year
        //System.out.println("<<\tArray sorted by year\t>>");
        sortYear(songs);
        //printSongs(songs);
        //System.out.println(); 
        
        //search array for songs from a particular year
        searchByYear(songs, 2018);
        searchByYear(songs, 2004);
        
        //print array sorted by artist
        //System.out.println("<<\tArray sorted by artist\t>>");
        sortArtist(songs);
        // printSongs(songs);
        //System.out.println();       
        
        //searches array and prints all songs by the same artist
        searchByArtist(songs, "Justin Bieber");
        searchByArtist(songs, "5SOS");
        searchByArtist(songs, "Bon Jovi");
    }
    public static void printSongs(Music[] a)
    {
        System.out.println("Song Title                  Year          Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        System.out.println();
    }
    public static void sortTitle(Music [] songs)
    {
        Music[] dest = new Music[ songs.length ];

        for( int i = 0 ; i < songs.length ; i++ )
        {
            Music next = songs[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo(dest[k-1].getTitle()) > 0 )
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
            songs[i] = dest[i];
    }
    public static void sortYear(Music[] songs)
    {
        Music[] dest = new Music[ songs.length ];

        for( int i = 0 ; i < songs.length ; i++ )
        {
            Music next = songs[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() > dest[k-1].getYear())
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
            songs[i] = dest[i];
    }
    public static void sortArtist(Music [] songs)
    {
        Music[] dest = new Music[ songs.length ];

        for( int i = 0 ; i < songs.length ; i++ )
        {
            Music next = songs[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getArtist().compareTo(dest[k-1].getArtist()) > 0 )
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
            songs[i] = dest[i];
    }
    public static int searchByTitle(Music[] songs, String title)
    {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( songs[probe].getTitle().compareTo(title) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (songs[low].getTitle().compareTo(title) == 0 ))
            return low;
        else
            return -1;
    }
    public static void searchByYear(Music[] songs, int year)
    {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(songs[probe].getYear() > year)
                high = probe;
            else
            {
                low = probe;
                if( songs[probe].getYear() == year)
                {
                    break;
                }
            }
        }
        if( (low >= 0) && (songs[low].getYear() == year))
        {
            linearPrintYear(songs, year, low);
        }
        else
            System.out.println("NOT found: " + year);
        System.out.println();
    }
    public static void linearPrintYear(Music [] songs, int year, int low)
    {
        int i;
        int start = low;
        int end = low;
        i = low - 1;
        
        while((i >= 0) && (songs[i].getYear() == year))
        {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < songs.length) && (songs[i].getYear() == year))
        {
            end = i;
            i++;
        }
        System.out.println("Songs from year: " + year);
        for(i = start; i <= end; i++)
            System.out.println(songs[i]);
        System.out.println();
    }
    public static void searchByArtist(Music[] songs, String artist)
    {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(songs[probe].getArtist().compareTo(artist) > 0)
                high = probe;
            else
            {
                low = probe;
                if( songs[probe].getArtist().compareTo(artist) == 0)
                {
                    break;
                }
            }
        }
        if( (low >= 0) && (songs[low].getArtist().compareTo(artist) == 0 ))
        {
            linearPrintArtist(songs, artist, low);
        }
        else
            System.out.println("NOT found: " + artist);
        System.out.println();
    }
    public static void linearPrintArtist(Music[] songs, String artist, int low)
    {
        int i;
        int start = low;
        int end = low;
        i = low - 1;
        
        while((i >= 0) && (songs[i].getArtist().compareTo(artist) == 0))
        {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < songs.length) && (songs[i].getArtist().compareTo(artist) == 0))
        {
            end = i;
            i++;
        }
        System.out.println("Songs from artist: " + artist);
        for(i = start; i <= end; i++)
            System.out.println(songs[i]);
        System.out.println();
    }
}
