public class WinterMountain extends Mountain
{    
    private double temp;
    public WinterMountain(int l, int w, int m, double t)
    {
       super(l,w,m);
       temp = t;
    }
    public String getTemp()
    {
        return "the temperature of the region is: " + temp + "degrees celsius";
    }
}
