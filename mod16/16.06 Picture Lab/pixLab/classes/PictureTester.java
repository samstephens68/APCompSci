/*
 * Purpose:
 * 
 * Sam Stephens
 * 3.5.20
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  //method to test keepOnlyBlue
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
    }
  
  //method to test negate
    public static void testNegate()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
    }
    
  //method to test grayscale
  public static void testGrayscale()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.grayscale();
      beach.explore();
    }
    
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  //method to test mirrorVerticalRightToLeft
  public static void testMirrorVerticalRightToLeft()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVerticalRightToLeft();
      caterpillar.explore();
    }
  
  //method to test mirrorHorizontal
  public static void testMirrorHorizontal()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontal();
      caterpillar.explore();
    }
  
  //method to test mirrorHorizontalBotToTop
  public static void testMirrorHorizontalBotToTop()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontalBotToTop();
      caterpillar.explore();
    }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  //method to test mirrorArms
  public static void testMirrorArms()
  {
      Picture arms = new Picture("snowman.jpg");
      arms.explore();
      arms.mirrorArms();
      arms.explore();
    }
    
  //method to test mirrorGull
  public static void testMirrorGull()
  {
      Picture gull = new Picture("seagull.jpg");
      gull.explore();
      gull.mirrorGull();
      gull.explore();
    }
    
  //method to test copy
  public static void testCopy()
  {
      Picture gull = new Picture("snowman.jpg");
      gull.explore();
      gull.copy(gull, 171,105,194,292,143, 204);
      gull.explore();
  }
  //method to test mycollage
  public static void testMyCollage()
  {
      Picture canvas = new Picture("640x480.jpg");
      canvas.myCollage();
      canvas.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  //method to test second edge detection
  public static void testEdgeDetection2()
  {
      Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
    }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    // Activity 5
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();


    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();

    
    // Activity 8
    testCollage();
    testCopy();
    testMyCollage();
    
    // Activity 9
    testEdgeDetection();
    testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












