public class Rainforest extends Forest
{
    private int lizards;
    public Rainforest(int l, int w, int n, int r)
    {
        super(l,w,n);
        lizards = r;
    }
    public String getLizards()
    {
        return "the number of lizards is: " + lizards;
    }
}