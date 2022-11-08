//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		this(10,10,10,10,new Color(0,0,0));
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		this(x,y,10,10,new Color(0,0,0));
	}
	
	public Block(int x, int y, int w, int h) {
		this(x,y,w,h,new Color(0,0,0));
	}
	
	public Block(int x, int y, int w, int h, Color c) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
   //add the other set methods
   public void setX(int x) {
	   xPos = x;
   }
	
   public void setY(int y) {
	   yPos = y;
   }
   
   public void setPos(int x,int y) {
	   xPos=x;
	   yPos=y;
   }
   
   public void setWidth(int w) {
	   width = w;
   }
   
   public void setHeight(int h) {
	   height = h;
   }

   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(xPos, yPos, width, height);
   }
   
	public boolean equals(Block other)
	{
		if(other.getColor() == color && other.getHeight() == height && other.getWidth() == width && other.getX() == xPos && other.getY() == yPos) {
			return true;
		}
		return false;
	}   

   //add the other get methods
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
    
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		   String output = "";
		   output = "x: " + xPos + " y: " + yPos + " width: " + width + " height: " + height + " color: " + color;
		   return output;
	}
}