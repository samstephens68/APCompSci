public class Desert extends Terrain
{    
    private int cacti;
    public Desert(int l, int w, int c)
    {
       super(l,w);
       cacti = c;
    }
    public String getCacti()
    {
        return "the number of cactuses is: " + cacti;
    }
}