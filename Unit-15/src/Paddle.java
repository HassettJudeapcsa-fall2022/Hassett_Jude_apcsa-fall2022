//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed =5;
   }


   //add the other Paddle constructors

    public Paddle(int x, int y) {
		super(x,y);
		speed = 5;
    }
	
	public  Paddle(int x, int y, int v) {
		super(x,y);
		speed = v;
	}
	
	public Paddle(int x, int y, int w, int h) {
		super(x,y,w,h);
		speed = 5;
	}
	
	public Paddle(int x, int y, int w, int h, int v) {
		super(x,y,w,h);
		speed = v;
	}
	
	public Paddle(int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
		speed = 5;
	}
	
	public Paddle(int x, int y, int w, int h, Color c, int v) {
		super(x,y,w,h,c);
		speed = v;
	}
	
	public void setSpeed(int v) {
		speed = v;
	}

   public void moveUpAndDraw(Graphics window)
   {
	   setY(getY() + speed);
	   draw(window, getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   setY(getY() - speed);
	   draw(window, getColor());
   }

   public boolean equals(Paddle other) {
	   if(other.getX() == getX() && other.getY() == getY() && other.getWidth() == getWidth() && other.getHeight() == getHeight() && other.getColor() == getColor() && other.getSpeed() == speed) {
		   return true;
	   }
	   return false;
   }
   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	   return super.toString() + " speed: " + speed;
   }
}