/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Sam Stephens
 * @version 09/11/19
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.4354;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        //remaining variables below here

        double francsSpent = 1842.69;            // Swiss Francs spent
        double francExchangeRate = 0.991489;     // 1 US dollar = 0.991489 Francs
        double dollarsSpentInSwitzerland = 0.0;      // US dollars spent in Switzerland
        double dollarsAfterSwitzerland = 0.0;        // US dollars remaining after Switzerland

        double rupeesSpent = 43000.17;            // Indian Rupees spent
        double rupeeExchangeRate = 70.95425;     // 1 US dollar = 70.95425 Rupees
        double dollarsSpentInIndia = 0.0;      // US dollars spent in India
        double dollarsAfterIndia = 0.0;        // US dollars remaining after India

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        System.out.println("Starting US dollars: " + startingUsDollars);
        System.out.println("");
        System.out.println("Mexico: ");
        System.out.println("Pesos Spent: " + pesosSpent);
        System.out.println("US dollars Equivalent: " + dollarsSpentInMexico);
        System.out.println("US dollars Remaining: " + dollarsAfterMexico);
        
        dollarsSpentInSwitzerland = francsSpent / francExchangeRate;
        dollarsAfterSwitzerland = startingUsDollars - dollarsSpentInSwitzerland;
        System.out.println("");
        System.out.println("Switzerland: ");
        System.out.println("Francs Spent: " + francsSpent);
        System.out.println("US dollars Equivalent: " + dollarsSpentInSwitzerland);
        System.out.println("US dollars Remaining: " + dollarsAfterSwitzerland);
        
        dollarsSpentInIndia = rupeesSpent / rupeeExchangeRate;
        dollarsAfterIndia = startingUsDollars - dollarsSpentInIndia;
        System.out.println("");
        System.out.println("India: ");
        System.out.println("Rupees Spent: " + rupeesSpent);
        System.out.println("US dollars Equivalent: " + dollarsSpentInIndia);
        System.out.println("US dollars Remaining: " + dollarsAfterIndia);
           
        System.out.println("==================================");
        System.out.println("Remaining US dollars: " + dollarsAfterIndia);
        System.out.println("");
        System.out.println("");


        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = (int)(budget1 / costItem1);
        double fundsRemaining1 = budget1 % costItem1;
        
        fundsRemaining1 = budget1 - (totalItems1 * costItem1);
        System.out.println("Taco");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        
        int totalItems2 = (int)(budget2 / costItem2);
        double fundsRemaining2 = budget2 % costItem2;
       
        System.out.println("Didgeridoos");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

