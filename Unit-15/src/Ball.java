//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, int xSpd, int ySpd) {
		super(x,y,w,h);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	 
	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd) {
		super(x,y,w,h,c);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
   //add the set methods
	public void setXSpeed(int xs) {
		xSpeed = xs;
	}
	
	public void setYSpeed(int ys) {
		ySpeed = ys;
	}
  
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window, Color.WHITE);
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Ball other)
	{
		if(other.getX() == getX() && other.getY() == getY() && other.getWidth() == getWidth() && other.getHeight() == getHeight() && other.getColor() == getColor() && other.getXSpeed() == xSpeed && other.getYSpeed() == ySpeed) {
			return true;
		}
		return false;
	}
	
	public boolean didCollideRight(Block other) {
		if( getX() <= other.getX() + other.getWidth() + Math.abs(getXSpeed())) return true;
		return false;
	}
	public boolean didCollideLeft(Block other) {
		if(getX() >= other.getX() - other.getWidth() - Math.abs(getXSpeed())) return true;
		return false;
	}
	public boolean didCollideTop(Block other) {
		return false;
	}
	public boolean didCollideBottom(Block other) {
		return false;
	}

	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

	public Color randomColor() {
		return Color.black;
	}
   //add a toString() method
	public String toString() {
		return super.toString() + " xSpeed: " + xSpeed + " ySpeed: " + ySpeed;
	}
}