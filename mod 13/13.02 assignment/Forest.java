public class Forest extends Terrain
{
    private int trees;
    public Forest(int l, int w, int n)
 {
     super(l, w);
     trees = n;
 }
 public String getTrees()
    {
        return "the number of trees is: " + trees;
    }
}
