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
    Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  public static void testNegate() {
	  	Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  
  public static void testGrayscale() {
	  	Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
  }
  
  public static void testFixUnderwater() {
	  	Picture water = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\water.jpg");
	    water.explore();
	    water.fixUnderwater();
	    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture motor = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\redMotorcycle.jpg");
    motor.mirrorVerticalRightToLeft();
    motor.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture motor = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\redMotorcycle.jpg");
    motor.mirrorHorizontal();
    motor.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture motor = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\redMotorcycle.jpg");
    motor.mirrorHorizontalBotToTop();
    motor.explore();
  }
  
  public static void testMirrorArms() {
	  Picture snowman = new Picture("C:\\\\\\\\Users\\\\\\\\hassettj2043\\\\\\\\Desktop\\\\\\\\APCSA Folder\\\\\\\\Hassett_Jude_apcsa-fall2022\\\\\\\\Unit-16\\\\\\\\src\\\\\\\\images\\\\\\\\snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull() {
	  Picture gull = new Picture("C:\\\\\\\\Users\\\\\\\\hassettj2043\\\\\\\\Desktop\\\\\\\\APCSA Folder\\\\\\\\Hassett_Jude_apcsa-fall2022\\\\\\\\Unit-16\\\\\\\\src\\\\\\\\images\\\\\\\\seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCollage2()
  {
	
    Picture canvas = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\640x480.jpg");
    canvas.createCollage2();
    canvas.explore();
  }
  
  public static void testCopy2() {
	  Picture canvas = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\640x480.jpg");
	  Picture flower1 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower1.jpg");
	  canvas.copy2(flower1,10,10,90,90, 320,240);
	  canvas.explore();
  }
  
  public static void testCopy() {
	  Picture canvas = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\640x480.jpg");
	  Picture flower1 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower1.jpg");
	  canvas.copy(flower1, 320,240);
	  canvas.explore();
  }
  
  public static void testMyCollage() {
	  Picture canvas = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore();
  }
  
  public static void testRandPixels() {
	  Picture beach = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
	    beach.explore();
	    beach.randPixels();
	    beach.explore();
  }
  
  public static void testEncodeAndDecode() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  Picture apple = new Picture("src/images/msg.jpg");
	  beach.explore();
	  beach.encode(apple);
	  beach.explore();
	  beach.decode().explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
	//testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCollage2();
    //testCopy2();
    //testCopy();
	//testMyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
	//testRandPixels();
    //testChromakey();
    testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}