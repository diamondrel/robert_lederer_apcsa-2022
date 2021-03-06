import java.util.ArrayList;
import java.util.List;

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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  /** Method to test zeroBlue */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  /** Method to test zeroBlue */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  public static void testNegate()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    beach.explore();
    beach.greyscale();
    beach.explore();
  }
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorRightToLeftVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\temple.jpg");
    caterpillar.explore();
    caterpillar.mirrorRightToLeftVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\temple.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorizontalTopToBot()
  {
    Picture caterpillar = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\temple.jpg");
    caterpillar.explore();
    caterpillar.mirrorBotToTop();
    caterpillar.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  public static void testMirrorDiagonalTwo()
  {
	    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonalTwo();
	    beach.explore();
	  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testCollageTwo()
  {
    Picture canvas = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\640x480.jpg");
    canvas.createCollageTwo();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testBackgroundSwap()
  {
    Picture mark = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\blue-mark.jpg");
    mark.backgroundSwap();
    mark.explore();
  }
  public static void testSteganography()
  {
    Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
    Picture apple = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\apple_icon.jpg");
    beach.steganography(apple);
    beach.explore();
  }
  public static void beachExplore() {
	  Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
	  beach.explore();
	  //Picture apple = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\apple_icon.jpg");
	  //apple.explore();
  }
  public static void laptopTestSteganography()
  {
	    Picture beach = new Picture("src\\beach.jpg");
	    Picture apple = new Picture("src\\apple_icon.jpg");
	    beach.steganography(apple);
	    beach.explore();
	    beach.decrypt();
  }
  public static void laptopTestSteganographyTwo()
  {
	    Picture beach = new Picture("src\\beach.jpg");
	    Picture msg = new Picture("src\\msg.jpg");
	    beach.steganography(msg);
	    beach.explore();
	    beach.decrypt();
  }
  public static void laptopBeachExplore() {
		  Picture beach = new Picture("src\\beach.jpg");
		  beach.explore();
//		  Picture apple = new Picture("src\\apple_icon.jpg");
//		  apple.explore();
  }
  public static void opacity() {
	  Picture beach = new Picture("C:\\Users\\ledererr8484\\Desktop\\apcsa-github\\unit-16\\src\\beach.jpg");
	  beach.opacitize();
	  beach.explore();
  }
  public static void manualDecode() {
	  Picture beach = new Picture("src\\beach.jpg");
	  Picture apple = new Picture("src\\apple_icon.jpg");
	beach.decryptTwo();
  	beach.manualSten(apple);
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
////    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorRightToLeftVertical();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalTopToBot();
//	  testMirrorDiagonal();
//	  testMirrorDiagonalTwo();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
//    testCollage();
    //testCopy();
//    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
//	  testBackgroundSwap();
//	  testSteganography();
	  laptopBeachExplore();
	  laptopTestSteganography();
	  laptopTestSteganographyTwo();
//	  manualDecode();
//	  beachExplore();
//	  opacity();
//	  testThing();
  }
}