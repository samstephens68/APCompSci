/**
 * This is a class that tests the Card class.
 *
 *  Sam Stephens
 *  3/16/20
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card twoSpades = new Card("two", "spades", 2);
      Card threeClubs = new Card("three", "clubs", 3);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: two of spades ****");
      System.out.println("  rank: " + twoSpades.rank());
      System.out.println("  suit: " + twoSpades.suit());
      System.out.println("  pointValue: " + twoSpades.pointValue());
      System.out.println("  toString: " + twoSpades.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: three of clubs ****");
      System.out.println("  rank: " + threeClubs.rank());
      System.out.println("  suit: " + threeClubs.suit());
      System.out.println("  pointValue: " + threeClubs.pointValue());
      System.out.println("  toString: " + threeClubs.toString());
      System.out.println();

      // Test matches() method
      System.out.println("Matching tests: ");
      System.out.println("Ace of Hearts compared to two of spades: ");
      System.out.println("matching: " + aceHearts.matches(twoSpades));
      System.out.println("not matching: " + !aceHearts.matches(twoSpades));
      
      System.out.println("two of spades compared to three of clubs: ");
      System.out.println("matching: " + twoSpades.matches(threeClubs));
      System.out.println("not matching: " + !twoSpades.matches(threeClubs));
      
      System.out.println("Ace of Hearts compared to three of clubs: ");
      System.out.println("matching: " + aceHearts.matches(threeClubs));
      System.out.println("not matching: " + !aceHearts.matches(threeClubs));
   }
}
