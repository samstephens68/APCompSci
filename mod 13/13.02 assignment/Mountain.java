public class Mountain extends Terrain
{
    private int mountainNum;
    public Mountain(int l, int w, int m)
    {
       super(l,w);
       mountainNum = m;
    }
    public String getMountainNumber()
    {
        return "the number of mountains is: " + mountainNum;
    }
}