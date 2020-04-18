/**
 * @purpose: to display waste reductions of households using
 *Arraylists and methods
 *
 * @author Sam Stephens
 * @version 12/20/19
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTesterV1
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWasteV1> households = new ArrayList<CO2FromWasteV1>();
           // add households to the ArrayList
           households.add( new CO2FromWasteV1(0, true, false, true, true));
           households.add( new CO2FromWasteV1(3, true, true, true, true));
           households.add( new CO2FromWasteV1(10, true, false, false, true));
           households.add( new CO2FromWasteV1(22, false, false, true, false));
           households.add( new CO2FromWasteV1(56, false, false, true, true));
           households.add( new CO2FromWasteV1(69, true, true, false, false));
           

       for(CO2FromWasteV1 dataRecord : households)
       {
           // invoke methods
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteReduction();   
       }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2FromWasteV1 dataRecord;

       for(int index = 0; index < households.size(); index ++)
       {
           // print each household's data
           dataRecord = households.get(index);
           System.out.printf("%6d", index);
           System.out.printf("%8d", dataRecord.getNumPeople());
           System.out.printf("%12b", dataRecord.getPaper());
           System.out.printf("%10b", dataRecord.getPlastic());
           System.out.printf("%11b", dataRecord.getGlass());
           System.out.printf("%13b", dataRecord.getCans());
           System.out.printf("%12.1f", dataRecord.getEmissions());
           System.out.printf("%14.2f", dataRecord.getReduction());
           System.out.printf("%10.1f%n", dataRecord.getNetEmissions());
       }
   }
}

