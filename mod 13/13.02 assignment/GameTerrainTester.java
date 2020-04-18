
/**
 * Write a description of class GameTerrainTester here.
 *
 * @author Sam Stephens
 * @version 2/7/20
 */
public class GameTerrainTester
{
    public static void main(String args[])
    {
        Terrain biome = new Terrain(2, 5);
        Mountain kilimanjaro =  new Mountain(1, 4, 5);
        Forest Hollywood = new Forest(2, 6, 300);
        WinterMountain w1 =  new WinterMountain(3, 5, 3, 24.5);
        Desert sahara =  new Desert(5, 4, 31);
        Rainforest amazon = new Rainforest(7, 8, 3, 5000);
        
        //print statements
        System.out.println("Terrain Results");
        System.out.println(biome.getTerrainSize());
        System.out.println("Mountain " + kilimanjaro.getTerrainSize() + "and has " + kilimanjaro.getMountainNumber());
        System.out.println("Winter Mountain " + w1.getTerrainSize() + "and has" + w1.getMountainNumber() + "and " + w1.getTemp());
        System.out.println("Desert " + sahara.getTerrainSize() + " and has " + sahara.getCacti());
        System.out.println("Forest " + Hollywood.getTerrainSize() + " and has " + Hollywood.getTrees());
        System.out.println("Rainforest " + amazon.getTerrainSize() + " and has " + amazon.getTrees() + " and " + amazon.getLizards());
    }
}
