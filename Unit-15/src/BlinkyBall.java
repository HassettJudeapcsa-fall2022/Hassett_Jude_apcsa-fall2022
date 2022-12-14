//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {
	  super(x,y);
   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x,y,wid,ht);
   }
   
   public BlinkyBall(int x, int y, int wid, int ht, Color col) {
	   super(x,y,wid,ht,col);
   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col,xSpd,ySpd);
   }

   public Color randomColor()
   {
   	int r = (int)(Math.random() * 255);		//use Math.random()
 		int g = (int)(Math.random() * 255);
 		int b = (int)(Math.random() * 255);
 		return new Color(r,g,b);
   }

   public boolean didCollideRight(Block other) {
	   if(super.didCollideRight(other)) {
		   setColor(randomColor());
		   return true;
	   }
	   return false;
   }
   
   public boolean didCollideLeft(Block other) {
	   if(super.didCollideLeft(other)) {
		   setColor(randomColor());
		   return true;
	   }
	   return false;
   }
   
   public void moveAndDraw(Graphics window)
   {
	 //draw a white ball at old ball location
		  draw(window, Color.WHITE);
	      setX(getX()+getXSpeed());
	      setY(getY()+getYSpeed());
			//draw the ball at its new location
	      draw(window);
   }
}