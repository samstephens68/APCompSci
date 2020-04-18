/**
 * This is a class that tests the Deck class.
 *
 *  Sam Stephens
 *  3.27.20
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not use.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] rank1 = {"jack", "queen", "king"};
      String[] suit1 = {"hearts", "spades"};
      int[] pointValue1 = {11, 12, 13};
      Deck deck1 = new Deck(rank1, suit1, pointValue1);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + deck1.toString());
      System.out.println("  isEmpty: " + deck1.isEmpty());
      System.out.println("  size: " + deck1.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + deck1.deal());
      System.out.println();
      System.out.println();
      
      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" + deck1.toString());
      System.out.println("  isEmpty: " + deck1.isEmpty());
      System.out.println("  size: " + deck1.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");
      System.out.println("  deal: " + deck1.deal());
      System.out.println("  deal: " + deck1.deal());
      System.out.println("  deal: " + deck1.deal());
      System.out.println("  deal: " + deck1.deal());
      System.out.println("  deal: " + deck1.deal());

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" + deck1.toString());
      System.out.println("  isEmpty: " + deck1.isEmpty());
      System.out.println("  size: "  + deck1.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " + deck1.deal());
      System.out.println();
      System.out.println();


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println("  The Starting Deck ");

      // System.out.println("  The Deck After Dealing a Card" );

      // System.out.println("  Shuffleing the Deck ");


   }
}
