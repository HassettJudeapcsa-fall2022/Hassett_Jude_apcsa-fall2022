//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;

	//add a constructor
	public Skeleton() {
		this("",0);
	}
	
	public Skeleton(String nm,int sz) {
		setName(nm);
		setSize(sz);
	}
	
	public void setName(String nm) {
		name = nm;
	}

	public void setSize(int sz) {
		size = sz;
	}
	
	//add code to implement the Monster interface
	public int getHowBig() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isBigger(Monster other) {
		if(other.getHowBig()<size) return false;
		return true;
	}
	
	public boolean isSmaller(Monster other) {
		if(other.getHowBig()>size) return false;
		return true;
	}
	
	public boolean namesTheSame(Monster other) {
		if(other.getName().equals(name)) return true;
		return false;
	}
	
	//add a toString
	public String toString() {
		return name + " " + size;
	}
}