/**
 * @author Sam Stephens
 * @version 12/13/19
 */
public class CO2FootprintV2
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    /**
     * constructor for objects of type CO2FootprintV2
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * mutator method to calculate and return the tons of CO2 emitted
     * @param myGallonsUsed
     * converts gallons of gas used to tons of CO2
     * myGallonsUsed requires a value so a constructor needs to be initialized**
     */
    public void calcTonsCO2()
    { 
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * method to convert tons of co2 to pounds
     * @param myTonsCO2
     * Precondition: calcTonsCO2 must have been run
     * multiplied by the tons/pounds multiplier
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the gallons of gas used
     * @param myGallonsUsed
     * @return the number of gallons used
     * Precondition: myGallons has a value
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Accessor method to return the tons of CO2 emitted
     * @param myTonsCO2
     * @return tons of CO2 produced
     * Precondition: myTonsCO2 has been initialized
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * getter method that returns the pounds of CO2 emitted
     * @param myPoundsCO2
     * @return pounds of CO2 emitted
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

