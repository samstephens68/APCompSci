
/**
 * Write a description of class musicTester1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class musicTester1
{
    public static void main(String [] args)
    {
        Music [] songs = new Music[10];
        songs[0] = new Music("Despacito", 2019, "Luis Fonsi");
        songs[2] = new Music("SICKO MODE", 2018, "Travis Scott");
        songs[1] = new Music("Closer", 2016, "The Chainsmokers");
        songs[3] = new Music("Sorry", 2015, "Justin Bieber");
        songs[4] = new Music("Hey Ya!", 2003, "OutKast");
        songs[5] = new Music("Umbrella", 2007, "Rihanna");
        songs[6] = new Music("Mo Bamba", 2018, "Sheck Wes");
        songs[7] = new Music("Baby", 2010, "Justin Bieber");
        songs[8] = new Music("This is America", 2020, "Childish Gambino");
        songs[9] = new Music("Youngblood", 2018, "5SOS");
        
        //print array
        printSongs(songs);
        
        //search array for songs from a particular year
        searchByYear(songs, 2018);
        searchByYear(songs, 2003);
        
        //print the array item from a search for the song title
        searchByTitle(songs, "Mo Bamba");
                
        //searches array and prints all songs by the same artist
        searchByArtist(songs, "Justin Bieber");
        searchByArtist(songs, "5SOS");
    }
    
    public static void printSongs(Music[] a)
    {
        System.out.println("Song Title                  Year          Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        System.out.println();
    }
    public static int searchByTitle(Music[] songs, String title)
    {
        int count = 0;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getTitle().compareTo(title) == 0)
            {
                System.out.println("Song(s) with title " + title + " in the array:");
                System.out.println(songs[i]);
                System.out.println();
                count++;
            }
        }
        if(count > 0)
        return count;        
        else
        {
            System.out.println(title + " is not in the array");
            System.out.println();
            return count;
        }
    }
    public static int searchByYear(Music[] songs, int year)
    {
        int c = 0;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getYear() == year)
            {
                System.out.println("Song(s) with year " + year + " in the array:");
                System.out.println(songs[i]);
                System.out.println();
                c++;
            }
        }
        if(c > 0)
        return c;        
        else
        {
            System.out.println(year + " is not in the array");
            System.out.println();
            return c;
        }
    }
    public static int searchByArtist(Music[] songs, String artist)
    {
        int count = 0;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getArtist().compareTo(artist) == 0)
            {
                System.out.println("Song(s) with artist " + artist + " in the array:");
                System.out.println(songs[i]);
                System.out.println();
                count++;
            }
        }
        if(count > 0)
        return count;        
        else
        {
            System.out.println(artist + " is not in the array");
            System.out.println();
            return count;
        }
    }
}
