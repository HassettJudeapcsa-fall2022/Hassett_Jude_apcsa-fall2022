import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////


/**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void keepOnlyRed() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setBlue(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void keepOnlyGreen() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setRed(0);
			  pixelObj.setBlue(0);
		  }
	  }
  }
  
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setRed(255-pixelObj.getRed());
			  pixelObj.setGreen(255-pixelObj.getGreen());
			  pixelObj.setBlue(255-pixelObj.getBlue());
		  }
	  }
  }
  
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  int avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
			  pixelObj.setRed(avg);
			  pixelObj.setGreen(avg);
			  pixelObj.setBlue(avg);
		  }
	  }
  }
  
  public void fixUnderwater() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setGreen(pixelObj.getGreen()-20);
			  pixelObj.setRed(pixelObj.getRed()-40);
			  if(pixelObj.getBlue() > 160) {
				  pixelObj.setBlue(pixelObj.getBlue()+40);
			  }
		  }
	  }
  }
  
  public void mexico()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed((int)(pixelObj.getRed()*1.6));
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    int height = pixels.length;
    for (int row = 0; row < height /2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    int height = pixels.length;
    for (int row = 0; row < height /2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel firstPixel = null;
    Pixel secondPixel = null;
    int width = pixels[0].length;
    int height = pixels.length;
    if(width > height) {
    	width = height;
    } else {
    	height = width;
    }

    
    for (int row = 0; row < height; row++)
    {
      for (int col = 0; col < width; col++)
      {
        firstPixel = pixels[row][col];
        secondPixel = pixels[col][row];
        firstPixel.setColor(secondPixel.getColor());
      }
    } 
  }	  
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.print(count);
  }
  
  public void mirrorArms() {
	  int mirrorPoint = 204;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
    
	  // loop through the rows
	  for (int row = 157; row < 195; row++)
	  {
		  // loop from 13 to just before the mirror point
		  for (int col = 98; col < mirrorPoint; col++)
		  {
        
			  leftPixel = pixels[row][col];      
			  rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	 }
  }
  
  public void mirrorGull() {
	  int mirrorPoint = 348;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
    
	  // loop through the rows
	  for (int row = 229; row < 324; row++)
	  {
		  // loop from 13 to just before the mirror point
		  for (int col = 229; col < mirrorPoint; col++)
		  {
        
			  leftPixel = pixels[row][col];      
			  rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	 }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, 
          int fromStartRow, int fromStartCol, int fromEndRow, int fromEndCol ,int startRow, int startCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = fromStartRow, toRow = startRow; 
		  fromRow <= fromEndRow &&
		  toRow < toPixels.length; 
		  fromRow++, toRow++)
		{
			for (int fromCol = fromStartCol, toCol = startCol; 
			    fromCol < fromEndCol &&
			    toCol < toPixels[0].length;  
			    fromCol++, toCol++)
			{
			 fromPixel = fromPixels[fromRow][fromCol];
			 toPixel = toPixels[toRow][toCol];
			 toPixel.setColor(fromPixel.getColor());
			}
		}   
	}
  
  public void createCollage2() {
	  Picture flower1 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower1.jpg");
	    Picture flower2 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower2.jpg");
	    this.copy2(flower1,25,25,50,50,0,0);
	    this.copy2(flower2,25,25,50,50,25,0);
	    this.copy2(flower1,25,25,50,50,50,0);
	    Picture flowerNoBlue = new Picture(flower2);
	    flowerNoBlue.zeroBlue();
	    this.copy2(flowerNoBlue,25,25,50,50,75,0);
	    this.copy2(flower1,25,25,50,50,100,0);
	    this.copy2(flower2,25,25,50,50,125,0);
	    this.mirrorHorizontal();
	    this.mirrorVertical();
	    this.write("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\collage.jpg");
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower1.jpg");
    Picture flower2 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\collage.jpg");
  }
  
  public void myCollage() {
	  Picture pic1 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\snowman.jpg");
	  Picture pic2 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\msg.jpg");
	  Picture pic3 = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\arch.jpg");
	  this.copy(pic3,0,0);
	  this.copy2(pic1,77,165,165,246,300,40);
	  this.copy2(pic1,171,239,199,294,351,106);
	  this.copy2(pic2,217,2,245,227,390,0);
	  Picture hell = new Picture(this);
	  hell.negate();
	  hell.mirrorVertical();
	  this.copy2(hell,0,320,480,640,0,320);
	  this.mexico();
	  this.write("C:\\\\\\\\Users\\\\\\\\hassettj2043\\\\\\\\Desktop\\\\\\\\APCSA Folder\\\\\\\\Hassett_Jude_apcsa-fall2022\\\\\\\\Unit-16\\\\\\\\src\\\\\\\\images\\\\\\\\collage.jpg");
	  Picture picFull = new Picture("C:\\\\Users\\\\hassettj2043\\\\Desktop\\\\APCSA Folder\\\\Hassett_Jude_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\collage.jpg");
	  picFull.keepOnlyGreen();
	  this.copy2(picFull,300,40,387,160,302,168);
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color botColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; 
           row < pixels.length-1; row++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[row+1][col];
        botColor = botPixel.getColor();
        if (topPixel.colorDistance(botColor) > 
            edgeDist)
          topPixel.setColor(Color.BLACK);
      }
    }
  }
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel topPixel = null;
    Pixel botPixel = null;
    
    int topIntensity;
    int botIntensity;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
    	  topPixel = this.getPixel(col, row);
    	  botPixel = this.getPixel(col, row+1);
    	  
    	  topIntensity = (topPixel.getRed() + topPixel.getGreen() + topPixel.getBlue())/3;
    	  botIntensity = (botPixel.getRed() + botPixel.getGreen() + botPixel.getBlue())/3;
    	  
    	  if(Math.abs(topIntensity - botIntensity) < edgeDist) {
    		  topPixel.setColor(Color.WHITE);
    	  } else {
    		  topPixel.setColor(Color.BLACK);
    	  }
      }
    }
    
  }
  
  public void randPixels() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (int row = 0; row < pixels.length-1; row++)
	   {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	    	  this.getPixel(col, row).setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
	      }
	   }
  }
  
  /** Hide a black and white message in the current
  * picture by changing the red to even and then
  * setting it to odd if the message pixel is black
  * @param messagePict the picture with a message
  */
  public void encode(Picture messagePict)
  {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  for(int row = 0; row < messagePict.getHeight(); row++) {
		  for(int col = 0; col < messagePict.getWidth(); col++) {
			  	  int randRow = (int)(randomMethod(currPixels[row][col].getBlue() + currPixels[row][col].getGreen()));
			  	  int randCol = (int)(randomMethod(currPixels[row][col].getBlue() + currPixels[row][col].getGreen()));
				  Pixel temp = messagePixels[row][col];
				  messagePixels[row][col] = messagePixels[randRow][randCol];
				  messagePixels[randRow][randCol] = temp;
		  }
	  }
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  //
			  currPixel = currPixels[row][col];
			  if (currPixel.getRed() % 2 == 1)
				  currPixel.setRed(currPixel.getRed() - 1);
			  messagePixel = messagePixels[row][col];
			  if (messagePixel.colorDistance(Color.BLACK) < 50)
			  {
				  currPixel.setRed(currPixel.getRed() + 1);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
  }
  
  public static double randomMethod(int seed) {
	  Random generator = new Random(seed);
	  double num = generator.nextDouble() * (0.5);
	  return num;
  }
  
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	
	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (currPixel.getRed() % 2 == 1)
			  {
				  messagePixel.setColor(Color.BLACK);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
 /*
  public static void main(String[] args) 
  {
    int[] randTest = new int[10];
    for(int i = 0; i < randTest.length; i++) {
    	randTest[i] = randomMethod(102090, 480, 32, 400, 32);
    }
    for(int i = 0; i < randTest.length; i++) {
    	System.out.print(randTest[i] + "\n");
    }
  }
*/
} // this } is the end of class Picture, put all new methods before this
