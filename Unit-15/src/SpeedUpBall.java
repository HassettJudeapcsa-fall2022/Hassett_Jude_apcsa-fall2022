//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, Color col) {
	   super(x,y,wid,ht,col);
   }
   
   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y,xSpd,ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);
   }

   public void setXSpeed( int xSpd )
   {
	   super.setXSpeed(xSpd);
   }

   public void setYSpeed( int ySpd )
   {
	   super.setYSpeed(ySpd);
   }
   
   public boolean didCollideRight(Block other) {
	   if(super.didCollideRight(other)) {
		   if(getXSpeed() < 0) {
			   setXSpeed(getXSpeed() - 3);
		   } else {
			   setXSpeed(getXSpeed() + 3);
		   }
		   if(getYSpeed() < 0) {
			   setYSpeed(getYSpeed() - 1);
		   } else {
			   setYSpeed(getYSpeed() + 1);
		   }
		   return true;
	   }
	   return false;
   }
   
   public boolean didCollideLeft(Block other) {
	   if(super.didCollideLeft(other)) {
		   if(getXSpeed() < 0) {
			   setXSpeed(getXSpeed() - 3);
		   } else {
			   setXSpeed(getXSpeed() + 3);
		   }
		   if(getYSpeed() < 0) {
			   setYSpeed(getYSpeed() - 1);
		   } else {
			   setYSpeed(getYSpeed() + 1);
		   }
		   return true;
	   }
	   return false;
   }
}

